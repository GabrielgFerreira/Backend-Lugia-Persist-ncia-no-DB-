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

import com.virtual.VirtualROOM1.Dtos.ConfiguracoesDtos;
import com.virtual.VirtualROOM1.Modelo.ConfiguracoesModelo;
import com.virtual.VirtualROOM1.Repositorios.ConfiguracoesRepositorio;

import jakarta.validation.Valid;

@RestController
public class ConfiguracoesControle {

    @Autowired
    ConfiguracoesRepositorio configuracoesRepositorio;

    @PostMapping("/Configuracoes")
    public ResponseEntity<ConfiguracoesModelo> saveConfiguracoes(@RequestBody @Valid ConfiguracoesDtos configuracoesDtos){
        var configuracoesModelo = new ConfiguracoesModelo();
        BeanUtils.copyProperties(configuracoesDtos, configuracoesModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(configuracoesRepositorio.save(configuracoesModelo));
    }

    @GetMapping("/Configuracoes")
    public ResponseEntity<List<ConfiguracoesModelo>> consultarConfiguracoes(){


    return ResponseEntity.status(HttpStatus.OK).body(configuracoesRepositorio.findAll());
}
  
    
}
