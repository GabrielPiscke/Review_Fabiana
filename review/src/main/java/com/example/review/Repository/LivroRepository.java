package com.example.review.Repository;

import org.springframework.stereotype.Repository;

import com.example.review.Entity.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LivroRepository JpaRepository<Long, Livro>{
}
