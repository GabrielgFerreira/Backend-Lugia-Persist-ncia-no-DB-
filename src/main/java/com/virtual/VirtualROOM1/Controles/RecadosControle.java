package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.RecadosDtos;
import com.virtual.VirtualROOM1.Modelo.RecadosModelo;
import com.virtual.VirtualROOM1.Repositorios.RecadosRepositorio;

import jakarta.validation.Valid;

@RestController
public class RecadosControle {

    @Autowired
    RecadosRepositorio recadosRepositorio;

    @PostMapping("/Recados")
    public ResponseEntity<RecadosModelo> saveRecados(@RequestBody @Valid RecadosDtos recadosDtos){
        var recadosModelo = new RecadosModelo();
        BeanUtils.copyProperties(recadosDtos, recadosModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(recadosRepositorio.save(recadosModelo));
    }


    
}
