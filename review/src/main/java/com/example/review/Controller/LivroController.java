package com.example.review.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.review.Entity.Livro;
import com.example.review.Service.LivroService;

@RestController
@RequestMapping
public class LivroController {

    @Autowired
    private LivroService service;   

 

}
