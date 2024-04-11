package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.AlunoDtos;
import com.virtual.VirtualROOM1.Modelo.AlunoModelo;
import com.virtual.VirtualROOM1.Repositorios.AlunoRepositorio;

import jakarta.validation.Valid;

@RestController
public class AlunoControle {

    @Autowired
    AlunoRepositorio alunoRepositorio;

    @PostMapping("/Alunos")
    public ResponseEntity<AlunoModelo> saveAluno(@RequestBody @Valid AlunoDtos alunoDtos){
        var alunoModelo = new AlunoModelo();
        BeanUtils.copyProperties(alunoDtos, alunoModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepositorio.save(alunoModelo));
    }


    
}
