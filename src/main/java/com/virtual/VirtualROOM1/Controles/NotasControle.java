package com.virtual.VirtualROOM1.Controles;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.NotasDtos;
import com.virtual.VirtualROOM1.Modelo.NotasModelo;
import com.virtual.VirtualROOM1.Repositorios.NotasRepositorio;

import jakarta.validation.Valid;

@RestController
public class NotasControle {

    @Autowired
    NotasRepositorio notasRepositorio;

    @PostMapping("/Notas")
    public ResponseEntity<NotasModelo> saveNotas(@RequestBody @Valid NotasDtos notasDtos){
        var notasModelo = new NotasModelo();
        BeanUtils.copyProperties(notasDtos, notasModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(notasRepositorio.save(notasModelo));
    }

    @GetMapping("/Notas")
    public ResponseEntity<List<NotasModelo>> consultarNotas(){


    return ResponseEntity.status(HttpStatus.OK).body(notasRepositorio.findAll());
}
  
    
}