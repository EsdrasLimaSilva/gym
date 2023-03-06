package com.dio.gym.model.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentForm {

    @Positive(message = "O id do aluno precisa ser positivo")
    @NotNull
    private Long memberId;

    @NotNull(message = "Preencha o peso corretamente")
    @Positive(message = "O peso precisa ser um valor positivo")
    private double weight;

    @NotNull(message = "Preencha a altura corretamente")
    @Positive(message = "A altura ser um valor positivo")
    private double height;
}
