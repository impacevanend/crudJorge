package com.ejemploCrudJorge.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JorgeCrudController {


    @GetMapping("/lastName")
    public String getName(@RequestParam(name = "lastName") String lastName){
        return lastName + " hola mundo";
    }

}
