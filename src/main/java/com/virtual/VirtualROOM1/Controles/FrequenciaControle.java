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

import com.virtual.VirtualROOM1.Dtos.FrequenciaDtos;
import com.virtual.VirtualROOM1.Modelo.FrequenciaModelo;
import com.virtual.VirtualROOM1.Repositorios.FrequenciaRepositorio;

import jakarta.validation.Valid;

@RestController
public class FrequenciaControle {

    @Autowired
    FrequenciaRepositorio frequenciaRepositorio;

    @PostMapping("/Frequencia")
    public ResponseEntity<FrequenciaModelo> saveFrequencia(@RequestBody @Valid FrequenciaDtos frequenciaDtos){
        var frequenciaModelo = new FrequenciaModelo();
        BeanUtils.copyProperties(frequenciaDtos, frequenciaModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(frequenciaRepositorio.save(frequenciaModelo));
    }

    @GetMapping("/Frequencia")
    public ResponseEntity<List<FrequenciaModelo>> consultarFrequencia(){


    return ResponseEntity.status(HttpStatus.OK).body(frequenciaRepositorio.findAll());
}
  
    
}
