package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.AdministrativoDtos;
import com.virtual.VirtualROOM1.Modelo.AdministrativoModelo;
import com.virtual.VirtualROOM1.Repositorios.AdministrativoRepositorio;

import jakarta.validation.Valid;

@RestController
public class AdministrativoControle {

    @Autowired
    AdministrativoRepositorio administrativoRepositorio;

    @PostMapping("/Administrativo")
    public ResponseEntity<AdministrativoModelo> saveAdministrativo(@RequestBody @Valid AdministrativoDtos administrativoDtos){
        var administrativoModelo = new AdministrativoModelo();
        BeanUtils.copyProperties(administrativoDtos, administrativoModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(administrativoRepositorio.save(administrativoModelo));
    }


    
}
