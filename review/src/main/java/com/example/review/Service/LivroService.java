package com.example.review.Service;

import com.example.review.DTO.LivroDTO;
import com.example.review.Entity.Livro;
import com.example.review.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro fromDto (LivroDTO dto) {
        Livro livro = new Livro();
        livro.setAutor(dto.getAutor());
        livro.setTitulo(dto.getTitulo());
        livro.setPreco(dto.getPreco());

    }


}
