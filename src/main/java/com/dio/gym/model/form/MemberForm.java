package com.dio.gym.model.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberForm {
    @NotBlank(message = "Preencha o campo corretamente")
    @Size(min = 3, max = 50, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres")
    private String name;

    @NotBlank(message = "Preencha o cpf corretamente")
    @CPF(message = "'${validadeValue}' é inváilido")
    private String cpf;

    @NotBlank(message = "Preencha o bairro corretamente")
    @Size(min = 3, max = 50, message = "${validateValue}' precisa estar entre {min} e {max} caracteres")
    private String district;

    @NotNull(message = "Preenha a data de nascimento corretamente")
    @Past(message = "Data ${validateValue} é inválida")
    private LocalDate birthday;
}
