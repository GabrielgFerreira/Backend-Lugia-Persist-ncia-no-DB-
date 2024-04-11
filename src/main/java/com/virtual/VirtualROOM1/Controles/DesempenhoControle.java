package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.DesempenhoDtos;
import com.virtual.VirtualROOM1.Modelo.DesempenhoModelo;
import com.virtual.VirtualROOM1.Repositorios.DesempenhoRepositorio;

import jakarta.validation.Valid;

@RestController
public class DesempenhoControle {

    @Autowired
    DesempenhoRepositorio desempenhoRepositorio;

    @PostMapping("/Desempenho")
    public ResponseEntity<DesempenhoModelo> saveDesempenho(@RequestBody @Valid DesempenhoDtos desempenhoDtos){
        var desempenhoModelo = new DesempenhoModelo();
        BeanUtils.copyProperties(desempenhoDtos, desempenhoModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(desempenhoRepositorio.save(desempenhoModelo));
    }


    
}
