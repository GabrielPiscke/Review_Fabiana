package com.example.review.dto;

import java.math.BigDecimal;

import org.antlr.v4.runtime.misc.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LivroDTO {
 
    @NotNull
    private String titulo;
    @NotNull
    private String autor;
    private String editora;
    private int anoPublicacao;
    private BigDecimal preco;
}
