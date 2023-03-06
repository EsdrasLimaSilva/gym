package com.dio.gym.service;

import com.dio.gym.model.Enrollment;
import com.dio.gym.model.form.EnrollmentForm;

import java.util.List;

public interface IEnrollmentService {
    Enrollment create(EnrollmentForm form);

    Enrollment get(Long id);

    List<Enrollment> getAll(String district);

    void delete(Long id);
}
