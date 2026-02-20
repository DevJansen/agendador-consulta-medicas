package com.devjansen.AgendadorDeConsulta.controller;

import com.devjansen.AgendadorDeConsulta.paciente.DadosCadastroPaciente;
import com.devjansen.AgendadorDeConsulta.paciente.Paciente;
import com.devjansen.AgendadorDeConsulta.service.PacienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final PacienteService pacienteService;

    @PostMapping
    public void cadastrarPaciente(@RequestBody @Valid DadosCadastroPaciente dados){
        pacienteService.cadastrarPaciente(dados);
    }

}
