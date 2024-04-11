package com.virtual.VirtualROOM1.Modelo;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Notas")
public class NotasModelo extends RepresentationModel<NotasModelo> implements Serializable{

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idNota;
    private String tipoAvaliacao;
    private double nota;

    public UUID getIdNota() {
        return idNota;
    }
    public void setIdNota(UUID idNota) {
        this.idNota = idNota;
    }
    public String getTipoAvaliacao() {
        return tipoAvaliacao;
    }
    public void setTipoAvaliacao(String tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }


    
}
