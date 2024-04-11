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
@Table(name="Atividades")
public class AtividadesModelo extends RepresentationModel<AtividadesModelo> implements Serializable {

    public static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAtividade;
    private String titulo;
    private String descricao;
    private LocalDate dataEntrega;

    public UUID getIdAtividade() {
        return idAtividade;
    }
    public void setIdAtividade(UUID idAtividade) {
        this.idAtividade = idAtividade;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    
}
