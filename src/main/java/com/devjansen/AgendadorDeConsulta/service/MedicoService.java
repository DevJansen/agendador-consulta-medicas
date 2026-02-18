package com.devjansen.AgendadorDeConsulta.service;

import com.devjansen.AgendadorDeConsulta.endereco.Endereco;
import com.devjansen.AgendadorDeConsulta.medico.DadosCadastroMedico;
import com.devjansen.AgendadorDeConsulta.medico.Medico;
import com.devjansen.AgendadorDeConsulta.medico.MedicoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public void cadastrarMedico(DadosCadastroMedico dadosDto){
        medicoRepository.save(new Medico(dadosDto));
    }

}
