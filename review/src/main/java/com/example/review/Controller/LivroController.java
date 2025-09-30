package com.example.review.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.review.DTO.LivroDTO;
import com.example.review.Entity.Livro;
import com.example.review.Service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @PostMapping
    public ResponseEntity<LivroDTO> create (@RequestBody LivroDTO livroDTO){
        LivroDTO livro = service.saveDto(livroDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(livro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroDTO> getById (@PathVariable Long id){
        Optional<LivroDTO> livro = service.getById(id);
        
        if(livro.isPresent()){
            return ResponseEntity.ok(livro.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivroDTO> update (@PathVariable Long id, @RequestBody LivroDTO livroDTO){
        Optional<LivroDTO> livrOptional = service.update(id, livroDTO);

        if(livrOptional.isPresent()){
            return ResponseEntity.ok(livrOptional.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        if(service.delete(id)){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    


}
