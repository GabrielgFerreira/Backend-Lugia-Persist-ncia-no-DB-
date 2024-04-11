package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.UsuariosDtos;
import com.virtual.VirtualROOM1.Modelo.UsuariosModelo;
import com.virtual.VirtualROOM1.Repositorios.UsuariosRepositorio;

import jakarta.validation.Valid;

@RestController
public class UsuariosControle {

    @Autowired
    UsuariosRepositorio usuariosRepositorio;

    @PostMapping("/Usuarios")
    public ResponseEntity<UsuariosModelo> saveUsuarios(@RequestBody @Valid UsuariosDtos usuariosDtos){
        var usuariosModelo = new UsuariosModelo();
        BeanUtils.copyProperties(usuariosDtos, usuariosModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuariosRepositorio.save(usuariosModelo));
    }


    
}
