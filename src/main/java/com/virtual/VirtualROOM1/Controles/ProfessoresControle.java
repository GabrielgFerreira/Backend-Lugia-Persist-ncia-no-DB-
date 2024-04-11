package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.ProfessoresDtos;
import com.virtual.VirtualROOM1.Modelo.ProfessoresModelo;
import com.virtual.VirtualROOM1.Repositorios.ProfessoresRepositorio;

import jakarta.validation.Valid;

@RestController
public class ProfessoresControle {

    @Autowired
    ProfessoresRepositorio professoresRepositorio;

    @PostMapping("/Professores")
    public ResponseEntity<ProfessoresModelo> saveProfessores(@RequestBody @Valid ProfessoresDtos professoresDtos){
        var professoresModelo = new ProfessoresModelo();
        BeanUtils.copyProperties(professoresDtos, professoresModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(professoresRepositorio.save(professoresModelo));
    }


    
}
