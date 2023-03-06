package com.dio.gym.controller;

import com.dio.gym.model.Member;
import com.dio.gym.model.PhysicalAssessment;
import com.dio.gym.model.form.MemberForm;
import com.dio.gym.service.implement.MemberServiceImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberServiceImp service;

    @GetMapping
    public List<Member> getAll(@RequestParam(value = "birthday", required = false) String birthday){
        return service.getAll(birthday);
    }

    @GetMapping("/assessments/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessments(@PathVariable Long id){
        return service.getAllPhysicalAssessments(id);
    }


    @PostMapping
    public Member create(@Valid  @RequestBody MemberForm form){
        return service.create(form);
    }
}
