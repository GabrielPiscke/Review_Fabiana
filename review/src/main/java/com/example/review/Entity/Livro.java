package com.example.review.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Livro {
    private long id;
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private BigDecimal preco;
}
