package com.example.review.DTO;

import java.math.BigDecimal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivroDTO {
 
 
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private BigDecimal preco;
}
