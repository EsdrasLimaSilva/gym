package com.dio.gym.service.implement;

import com.dio.gym.model.Enrollment;
import com.dio.gym.model.Member;
import com.dio.gym.model.form.EnrollmentForm;
import com.dio.gym.repository.EnrollmentRepository;
import com.dio.gym.repository.MemberRepository;
import com.dio.gym.service.IEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImp implements IEnrollmentService {
    @Autowired
    private EnrollmentRepository repository;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Enrollment create(EnrollmentForm form) {
        Enrollment enrollment = new Enrollment();
        Member member = memberRepository.findById(form.getMemberId()).get();
        enrollment.setMember(member);

        repository.save(enrollment);

        return enrollment;
    }

    @Override
    public Enrollment get(Long id) {
        return null;
    }

    @Override
    public List<Enrollment> getAll(String district) {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}
