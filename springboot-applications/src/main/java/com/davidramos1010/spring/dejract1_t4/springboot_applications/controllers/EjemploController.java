package com.davidramos1010.spring.dejract1_t4.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")

    public String info(Model model) {
        model.addAttribute("titulo", "Servidor en línea");
        model.addAttribute("servidor", "PrograWeb");
        model.addAttribute("ip", "192.168.1.1");
        return "detalles_info";
    }

}
