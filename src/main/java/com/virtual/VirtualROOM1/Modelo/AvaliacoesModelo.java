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
@Table(name="Avaliacoes")
public class AvaliacoesModelo extends RepresentationModel<AvaliacoesModelo> implements Serializable {

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAvaliacao;
    private String tipoAvaliacao;
    private LocalDate dataAvaliacao;

    public UUID getIdAvaliacao() {
        return idAvaliacao;
    }
    public void setIdAvaliacao(UUID idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }
    public String getTipoAvaliacao() {
        return tipoAvaliacao;
    }
    public void setTipoAvaliacao(String tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }
    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }
    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    
}
