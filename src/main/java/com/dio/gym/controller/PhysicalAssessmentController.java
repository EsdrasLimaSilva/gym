package com.dio.gym.controller;

import com.dio.gym.model.PhysicalAssessment;
import com.dio.gym.model.form.PhysicalAssessmentForm;
import com.dio.gym.service.implement.PhysicalAssessmentServiceImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessments")
public class PhysicalAssessmentController {
    @Autowired
    private PhysicalAssessmentServiceImp service;

    @GetMapping
    public List<PhysicalAssessment> getAll(){
        return service.getAll();
    }

    @PostMapping
    public PhysicalAssessment create(@Valid @RequestBody PhysicalAssessmentForm form){
        return service.create(form);
    }
}
