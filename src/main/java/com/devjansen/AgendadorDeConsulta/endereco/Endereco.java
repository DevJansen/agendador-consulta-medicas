package com.devjansen.AgendadorDeConsulta.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Embeddable
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(DadosEndereco dadosDto){
        this.logradouro = dadosDto.logradouro();
        this.numero = dadosDto.numero();
        this.complemento = dadosDto.complemento();
        this.bairro = dadosDto.bairro();
        this.cidade = dadosDto.cidade();
        this.uf = dadosDto.uf();
        this.cep = dadosDto.cep();
    }
}
