package br.com.djg.emprestalivro.controller;

import br.com.djg.emprestalivro.dominio.Emprestimo;
import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.servico.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> buscaremprestimos(){
        List<Emprestimo> listadeemprestimos = emprestimoService.buscarTodosEmprestimos();
        return listadeemprestimos;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Emprestimo emprestimo ) {
        emprestimoService.salvarEmprestimo(emprestimo);
        return ResponseEntity.ok("Sucesso");
    }


}

