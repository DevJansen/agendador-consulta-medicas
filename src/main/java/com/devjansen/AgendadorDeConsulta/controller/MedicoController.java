package com.devjansen.AgendadorDeConsulta.controller;

import com.devjansen.AgendadorDeConsulta.medico.DadosCadastroMedico;
import com.devjansen.AgendadorDeConsulta.medico.Medico;
import com.devjansen.AgendadorDeConsulta.medico.MedicoRepository;
import com.devjansen.AgendadorDeConsulta.service.MedicoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("/medico")
public class MedicoController {

    private final MedicoService medicoService;

    @PostMapping
    public void cadastrarMedico(@RequestBody @Valid  DadosCadastroMedico dados){
        medicoService.cadastrarMedico(dados);
    }

}

