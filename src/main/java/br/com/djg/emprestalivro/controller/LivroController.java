package br.com.djg.emprestalivro.controller;

import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.servico.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> buscarLivros(){
        List<Livro> listadelivros = livroService.buscarTodosLivros();
        return listadelivros;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Livro livro){
        livroService.salvarLivro(livro);
        return ResponseEntity.ok("Sucesso");
    }
}
