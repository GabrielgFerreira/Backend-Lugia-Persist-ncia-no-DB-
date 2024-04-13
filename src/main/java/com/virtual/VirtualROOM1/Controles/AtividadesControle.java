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

import com.virtual.VirtualROOM1.Dtos.AtividadesDtos;
import com.virtual.VirtualROOM1.Modelo.AtividadesModelo;
import com.virtual.VirtualROOM1.Repositorios.AtividadesRepositorio;

import jakarta.validation.Valid;

@RestController
public class AtividadesControle {

    @Autowired
    AtividadesRepositorio atividadesRepositorio;

    @PostMapping("/Atividades")
    public ResponseEntity<AtividadesModelo> saveAtividades(@RequestBody @Valid AtividadesDtos atividadesDtos){
        var atividadesModelo = new AtividadesModelo();
        BeanUtils.copyProperties(atividadesDtos, atividadesModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(atividadesRepositorio.save(atividadesModelo));
    }

    @GetMapping("/Atividades")
        public ResponseEntity<List<AtividadesModelo>> consultarAtividades() {

        return ResponseEntity.status(HttpStatus.OK).body(atividadesRepositorio.findAll());
    }
    
}
