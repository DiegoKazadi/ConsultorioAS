package com.consultorio.springvscode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ConsultorioControler {
  
    
    @GetMapping(value="/")
    public String getMethodName() {
        return "Bem Vindo ao Consultório!";
    }
    
}
