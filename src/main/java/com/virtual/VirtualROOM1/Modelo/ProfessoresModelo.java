package com.virtual.VirtualROOM1.Modelo;

import java.io.Serializable;
import java.util.UUID;
import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="Professores")
public class ProfessoresModelo extends RepresentationModel<ProfessoresModelo> implements Serializable{

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProfessor;
    private String nome;
    private String email;
    private String senha;
    
    public UUID getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(UUID idProfessor) {
        this.idProfessor = idProfessor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }




    
}
