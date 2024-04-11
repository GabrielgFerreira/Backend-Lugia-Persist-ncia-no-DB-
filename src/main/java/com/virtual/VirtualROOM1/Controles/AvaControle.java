package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.AvaDtos;
import com.virtual.VirtualROOM1.Modelo.AvaModelo;
import com.virtual.VirtualROOM1.Repositorios.AvaRepositorio;

import jakarta.validation.Valid;

@RestController
public class AvaControle {

    @Autowired
    AvaRepositorio avaRepositorio;

    @PostMapping("/Ava")
    public ResponseEntity<AvaModelo> saveAva(@RequestBody @Valid AvaDtos avaDtos){
        var avaModelo = new AvaModelo();
        BeanUtils.copyProperties(avaDtos, avaModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(avaRepositorio.save(avaModelo));
    }


    
}
