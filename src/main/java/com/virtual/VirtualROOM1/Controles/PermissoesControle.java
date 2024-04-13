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

import com.virtual.VirtualROOM1.Dtos.PermissoesDtos;
import com.virtual.VirtualROOM1.Modelo.PermissoesModelo;
import com.virtual.VirtualROOM1.Repositorios.PermissoesRepositorio;

import jakarta.validation.Valid;

@RestController
public class PermissoesControle {

    @Autowired
    PermissoesRepositorio permissoesRepositorio;

    @PostMapping("/Permissoes")
    public ResponseEntity<PermissoesModelo> savePermissoes(@RequestBody @Valid PermissoesDtos permissoesDtos){
        var permissoesModelo = new PermissoesModelo();
        BeanUtils.copyProperties(permissoesDtos, permissoesModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(permissoesRepositorio.save(permissoesModelo));
    }

    @GetMapping("/Permissoes")
    public ResponseEntity<List<PermissoesModelo>> consultarPermissoes(){


    return ResponseEntity.status(HttpStatus.OK).body(permissoesRepositorio.findAll());
}
  
    
}
