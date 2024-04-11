package com.virtual.VirtualROOM1.Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Comunicacao")
public class ComunicacaoModelo extends RepresentationModel<ComunicacaoModelo> implements Serializable{

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idComunicacao;
    private String mensagem;
    private LocalDate dataEnvio;

    public UUID getIdComunicacao() {
        return idComunicacao;
    }
    public void setIdComunicacao(UUID idComunicacao) {
        this.idComunicacao = idComunicacao;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public LocalDate getDataEnvio() {
        return dataEnvio;
    }
    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    
}
