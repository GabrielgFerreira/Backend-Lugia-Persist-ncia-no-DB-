package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.ComunicacaoDtos;
import com.virtual.VirtualROOM1.Modelo.ComunicacaoModelo;
import com.virtual.VirtualROOM1.Repositorios.ComunicacaoRepositorio;

import jakarta.validation.Valid;

@RestController
public class ComunicacaoControle {

    @Autowired
    ComunicacaoRepositorio comunicacaoRepositorio;

    @PostMapping("/Comunicacao")
    public ResponseEntity<ComunicacaoModelo> saveComunicacao(@RequestBody @Valid ComunicacaoDtos comunicacaoDtos){
        var comunicacaoModelo = new ComunicacaoModelo();
        BeanUtils.copyProperties(comunicacaoDtos, comunicacaoModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(comunicacaoRepositorio.save(comunicacaoModelo));
    }


    
}
