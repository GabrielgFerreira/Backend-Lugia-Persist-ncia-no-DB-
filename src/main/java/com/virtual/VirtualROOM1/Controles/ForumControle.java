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

import com.virtual.VirtualROOM1.Dtos.ForumDtos;
import com.virtual.VirtualROOM1.Modelo.ForumModelo;
import com.virtual.VirtualROOM1.Repositorios.ForumRepositorio;

import jakarta.validation.Valid;

@RestController
public class ForumControle {

    @Autowired
    ForumRepositorio forumRepositorio;

    @PostMapping("/Forum")
    public ResponseEntity<ForumModelo> saveForum(@RequestBody @Valid ForumDtos forumDtos){
        var forumModelo = new ForumModelo();
        BeanUtils.copyProperties(forumDtos, forumModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(forumRepositorio.save(forumModelo));
    }

    @GetMapping("/Forum")
    public ResponseEntity<List<ForumModelo>> consultarForum(){


    return ResponseEntity.status(HttpStatus.OK).body(forumRepositorio.findAll());
}
  
    
}
