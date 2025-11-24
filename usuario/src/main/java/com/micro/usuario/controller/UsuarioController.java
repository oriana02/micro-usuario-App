package com.micro.usuario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/admin")
public class UsuarioController {

    @PostMapping("home/admin")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request

        return entity;
    }

}
