package com.virtual.VirtualROOM1.Repositorios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtual.VirtualROOM1.Modelo.AlunoModelo;

@Repository
public interface AlunoRepositorio extends JpaRepository<AlunoModelo, UUID>{

    
}