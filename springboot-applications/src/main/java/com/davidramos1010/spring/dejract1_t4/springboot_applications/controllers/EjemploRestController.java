package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //método handler REST
public class EjemploRestController {

    @GetMapping("/detalles_info2")

    public Map<String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "PrograWeb");
        respuesta.put("Ip", "192.168.1.1");
        return respuesta;

    }
}
