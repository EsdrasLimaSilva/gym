package com.dio.gym.controller;

import com.dio.gym.model.Enrollment;
import com.dio.gym.model.form.EnrollmentForm;
import com.dio.gym.service.implement.EnrollmentServiceImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    @Autowired
    private EnrollmentServiceImp service;

    @GetMapping
    private List<Enrollment> getAll(@RequestParam(value = "district", required = false) String district){
        return  service.getAll(district);
    }


    @PostMapping
    private Enrollment create(@Valid @RequestBody EnrollmentForm form){
        return service.create(form);
    }
}
