package com.dio.gym.service;

import com.dio.gym.model.Member;
import com.dio.gym.model.PhysicalAssessment;
import com.dio.gym.model.form.MemberForm;
import com.dio.gym.model.form.MemberUpdateForm;

import java.util.List;

public interface IMemberService {
    Member create(MemberForm createForm);

    Member get(Long id);

    List<Member> getAll(String birthday);

    Member update(Long id, MemberUpdateForm updateForm);

    List<PhysicalAssessment> getAllPhysicalAssessments(Long id);

}
