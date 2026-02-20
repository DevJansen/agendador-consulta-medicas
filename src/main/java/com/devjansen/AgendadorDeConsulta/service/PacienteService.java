package com.devjansen.AgendadorDeConsulta.service;

import com.devjansen.AgendadorDeConsulta.paciente.DadosCadastroPaciente;
import com.devjansen.AgendadorDeConsulta.paciente.Paciente;
import com.devjansen.AgendadorDeConsulta.paciente.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public void cadastrarPaciente(DadosCadastroPaciente dados){
        pacienteRepository.save(new Paciente(dados));
    }

}
