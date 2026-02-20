package com.devjansen.AgendadorDeConsulta.paciente;

import com.devjansen.AgendadorDeConsulta.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{9,10}")
        String cpf,

        @Valid
        DadosEndereco endereco

) {
}
