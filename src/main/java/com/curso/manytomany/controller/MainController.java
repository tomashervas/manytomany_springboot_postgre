package com.curso.manytomany.controller;

import com.curso.manytomany.dto.SubDTO;
import com.curso.manytomany.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    UsuarioService usuarioService;

    @PutMapping("/subscribe")
    public ResponseEntity subscribe(@RequestBody SubDTO dto){
        usuarioService.subscribe(dto.getIdUser(), dto.getIdCanal());
        return new ResponseEntity("Te has suscrito", HttpStatus.OK);
    }

    @PutMapping("/unsubscribe")
    public ResponseEntity unsubscribe(@RequestBody SubDTO dto){
        usuarioService.unsubscribe(dto.getIdUser(), dto.getIdCanal());
        return new ResponseEntity("Te has borrado", HttpStatus.OK);
    }

    @DeleteMapping("/deletecanal/{id}")
    public ResponseEntity deleteCanal(@PathVariable("id") int id){
        usuarioService.deleteCanal(id);
        return new ResponseEntity("canal eliminado", HttpStatus.OK);
    }
}
