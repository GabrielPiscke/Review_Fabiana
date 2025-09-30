package com.example.review.Service;

import com.example.review.DTO.LivroDTO;
import com.example.review.Entity.Livro;
import com.example.review.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro fromDto (LivroDTO dto) {
        Livro livro = new Livro();
        livro.setAutor(dto.getAutor());
        livro.setTitulo(dto.getTitulo());
        livro.setPreco(dto.getPreco());
        livro.setEditora(dto.getEditora());
        livro.setAnoPublicacao(dto.getAnoPublicacao());

        return livro;
    }

    public LivroDTO toDto (Livro livro) {
        LivroDTO dto = new LivroDTO();
        dto.setAutor(livro.getAutor());
        dto.setTitulo(livro.getTitulo());
        dto.setPreco(livro.getPreco());
        dto.setEditora(livro.getEditora());
        dto.setAnoPublicacao(livro.getAnoPublicacao());

        return dto;
    }

    public List<Livro> listarTodos(){
        return repository.findAll();
    }

    public Optional<LivroDTO> getById(long id){
    Optional<Livro> livro = repository.findById(id);
        if (livro.isEmpty()){
            return Optional.empty();

        }
        return Optional.of(this.toDto(livro.get()));
    }

    public LivroDTO saveDto (LivroDTO dto){
        Livro livro = this.fromDto(dto);
        Livro livroBd = repository.save(livro);
        return this.toDto(livroBd);

    }

    public Optional<LivroDTO> update (long id, LivroDTO dto){
        Optional<Livro> livro = repository.findById(id);
        if(livro.isEmpty()){
            return Optional.empty();
        }
        Livro livroUp = livro.get();
        livroUp.setPreco(dto.getPreco());
        livroUp.setTitulo(dto.getTitulo());
        livroUp.setAutor(dto.getAutor());
        livroUp.setEditora(dto.getEditora());
        livroUp.setAnoPublicacao(dto.getAnoPublicacao());
        Livro livroBd = repository.save(livroUp);

        return Optional.of(this.toDto(livroBd));
    }

    public boolean delete (long id){
        if(!repository.existsById(id)){
           return false;
        }
        repository.deleteById(id);
        return true;
    }



}
