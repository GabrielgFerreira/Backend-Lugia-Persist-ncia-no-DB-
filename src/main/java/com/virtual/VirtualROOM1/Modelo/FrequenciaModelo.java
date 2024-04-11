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
@Table(name="Frequencia")
public class FrequenciaModelo extends RepresentationModel<FrequenciaModelo> implements Serializable{

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFrequencia;
    private LocalDate data;

    public UUID getIdFrequencia() {
        return idFrequencia;
    }
    public void setIdFrequencia(UUID idFrequencia) {
        this.idFrequencia = idFrequencia;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
}
