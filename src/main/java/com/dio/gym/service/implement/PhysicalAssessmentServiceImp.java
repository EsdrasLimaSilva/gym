package com.dio.gym.service.implement;

import com.dio.gym.model.Member;
import com.dio.gym.model.PhysicalAssessment;
import com.dio.gym.model.form.PhysicalAssessmentForm;
import com.dio.gym.model.form.PhysicalAssessmentUpdateForm;
import com.dio.gym.repository.MemberRepository;
import com.dio.gym.repository.PhysicalAssessmentRepository;
import com.dio.gym.service.IPhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentServiceImp implements IPhysicalAssessmentService {

    @Autowired
    PhysicalAssessmentRepository repository;

    @Autowired
    MemberRepository memberRepository;

    @Override
    public PhysicalAssessment create(PhysicalAssessmentForm form) {
        PhysicalAssessment physicalAssessment = new PhysicalAssessment();
        Member member = memberRepository.findById(form.getMemberId()).get();

        physicalAssessment.setMember(member);
        physicalAssessment.setHeight(form.getHeight());
        physicalAssessment.setWeight(form.getWeight());

        return repository.save(physicalAssessment);
    }

    @Override
    public PhysicalAssessment get(Long id) {
        return null;
    }

    @Override
    public List<PhysicalAssessment> getAll() {
        return repository.findAll();
    }

    @Override
    public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm updateForm) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
