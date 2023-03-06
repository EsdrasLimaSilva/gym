package com.dio.gym.service.implement;

import com.dio.gym.infra.utils.JavaTimeUtils;
import com.dio.gym.model.Member;
import com.dio.gym.model.PhysicalAssessment;
import com.dio.gym.model.form.MemberForm;
import com.dio.gym.model.form.MemberUpdateForm;
import com.dio.gym.repository.MemberRepository;
import com.dio.gym.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MemberServiceImp implements IMemberService {

    @Autowired
    private MemberRepository repository;

    @Override
    public Member create(MemberForm form) {
        Member member = new Member();

        member.setName(form.getName());
        member.setCpf(form.getCpf());
        member.setDistrict(form.getDistrict());
        member.setBirthday(form.getBirthday());

        repository.save(member);
        return member;
    }

    @Override
    public Member get(Long id) {
        return null;
    }

    @Override
    public List<Member> getAll(String birthday) {
        if(birthday == null){
            return repository.findAll();
        }

        LocalDate localDate = LocalDate.parse(birthday, JavaTimeUtils.LOCAL_DATE_FORMATTER);
        return repository.findByBirthday(localDate);
    }

    @Override
    public Member update(Long id, MemberUpdateForm updateForm) {
        return null;
    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessments(Long id) {
        Member member = repository.findById(id).get();

        return member.getPhysicalAssessments();
    }

}
