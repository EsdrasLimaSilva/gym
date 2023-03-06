package com.dio.gym.model.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentForm {
    @NotNull(message = "Preencha o id do aluno corretamente (matrícula)")
    @Positive(message = "O id do alundo precisa ser positivo")
    private Long memberId;
}
