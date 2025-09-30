package com.example.review.DTO;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivroDTO {
 
    @NotBlank
    private String titulo;
    @NotBlank
    private String autor;
    private String editora;
    private int anoPublicacao;
    private BigDecimal preco;
}
