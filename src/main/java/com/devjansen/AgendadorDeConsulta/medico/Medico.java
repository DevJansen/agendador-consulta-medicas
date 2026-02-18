package com.devjansen.AgendadorDeConsulta.medico;

import com.devjansen.AgendadorDeConsulta.endereco.DadosEndereco;
import com.devjansen.AgendadorDeConsulta.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity(name = "medico")
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dadosDto){
        this.nome = dadosDto.nome();
        this.email = dadosDto.email();
        this.crm = dadosDto.crm();
        this.telefone = dadosDto.telefone();
        this.especialidade = dadosDto.especialidade();
        this.endereco = new Endereco(dadosDto.endereco());
    }

}
