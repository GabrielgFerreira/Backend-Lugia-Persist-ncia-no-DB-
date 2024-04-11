package com.virtual.VirtualROOM1.Controles;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.VirtualROOM1.Dtos.CursosDtos;
import com.virtual.VirtualROOM1.Modelo.CursosModelo;
import com.virtual.VirtualROOM1.Repositorios.CursosRepositorio;

import jakarta.validation.Valid;

@RestController
public class CursosControle {

    @Autowired
    CursosRepositorio cursosRepositorio;

    @PostMapping("/Cursos")
    public ResponseEntity<CursosModelo> saveCursos(@RequestBody @Valid CursosDtos cursosDtos){
        var cursosModelo = new CursosModelo();
        BeanUtils.copyProperties(cursosDtos, cursosModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursosRepositorio.save(cursosModelo));
    }


    
}
