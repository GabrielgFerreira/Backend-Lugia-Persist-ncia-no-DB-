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
@Table(name="Conteudos")
public class ConteudosModelo extends RepresentationModel<ConteudosModelo> implements Serializable {
    
    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idConteudo;
    private String titulo;
    private String descricao;

    public UUID getIdConteudo() {
        return idConteudo;
    }
    public void setIdConteudo(UUID idConteudo) {
        this.idConteudo = idConteudo;
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
}
