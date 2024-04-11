package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.AvaliacoesDtos;
import com.virtual.VirtualROOM1.Modelo.AvaliacoesModelo;
import com.virtual.VirtualROOM1.Repositorios.AvaliacoesRepositorio;

import jakarta.validation.Valid;

@RestController
public class AvaliacoesControle {

    @Autowired
    AvaliacoesRepositorio avaliacoesRepositorio;

    @PostMapping("/Avaliacoes")
    public ResponseEntity<AvaliacoesModelo> saveAvaliacoes(@RequestBody @Valid AvaliacoesDtos avaliacoesDtos){
        var avaliacoesModelo = new AvaliacoesModelo();
        BeanUtils.copyProperties(avaliacoesDtos, avaliacoesModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(avaliacoesRepositorio.save(avaliacoesModelo));
    }


    
}
