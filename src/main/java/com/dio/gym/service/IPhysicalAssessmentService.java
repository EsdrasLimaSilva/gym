package com.dio.gym.service;

import com.dio.gym.model.PhysicalAssessment;
import com.dio.gym.model.form.PhysicalAssessmentForm;
import com.dio.gym.model.form.PhysicalAssessmentUpdateForm;

import java.util.List;

public interface IPhysicalAssessmentService {
    PhysicalAssessment create(PhysicalAssessmentForm form);

    PhysicalAssessment get(Long id);

    List<PhysicalAssessment> getAll();

    PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm updateForm);

    void delete(Long id);
}
