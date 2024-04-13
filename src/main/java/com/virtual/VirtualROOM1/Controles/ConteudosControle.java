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

import com.virtual.VirtualROOM1.Dtos.ConteudosDtos;
import com.virtual.VirtualROOM1.Modelo.ConteudosModelo;
import com.virtual.VirtualROOM1.Repositorios.ConteudosRepositorio;

import jakarta.validation.Valid;

@RestController
public class ConteudosControle {

    @Autowired
    ConteudosRepositorio conteudosRepositorio;

    @PostMapping("/Conteudos")
    public ResponseEntity<ConteudosModelo> saveConteudos(@RequestBody @Valid ConteudosDtos conteudosDtos){
        var conteudosModelo = new ConteudosModelo();
        BeanUtils.copyProperties(conteudosDtos, conteudosModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(conteudosRepositorio.save(conteudosModelo));
    }

    @GetMapping("/Conteudos")
    public ResponseEntity<List<ConteudosModelo>> consultarConteudos(){


    return ResponseEntity.status(HttpStatus.OK).body(conteudosRepositorio.findAll());
}
  
    
}
