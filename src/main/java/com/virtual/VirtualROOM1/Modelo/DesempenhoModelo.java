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
@Table(name="Desempenho")
public class DesempenhoModelo extends RepresentationModel<DesempenhoModelo> implements Serializable {

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idDesempenho;
    private String tipoDesempenho;

    public UUID getIdDesempenho() {
        return idDesempenho;
    }
    public void setIdDesempenho(UUID idDesempenho) {
        this.idDesempenho = idDesempenho;
    }
    public String getTipoDesempenho() {
        return tipoDesempenho;
    }
    public void setTipoDesempenho(String tipoDesempenho) {
        this.tipoDesempenho = tipoDesempenho;
    }
    
}
