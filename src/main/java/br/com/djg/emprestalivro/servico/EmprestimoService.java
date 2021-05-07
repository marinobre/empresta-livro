package br.com.djg.emprestalivro.servico;

import br.com.djg.emprestalivro.dominio.Emprestimo;
import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.dominio.Usuario;
import br.com.djg.emprestalivro.repositorio.EmprestimoRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class EmprestimoService {
    private static final Logger log = LoggerFactory.getLogger(EmprestimoService.class);

    @Autowired
    private EmprestimoRespository emprestimoRespository;


    public List<Emprestimo> buscarTodosEmprestimos () {
        List<Emprestimo> emprestimo = emprestimoRespository.findAll();
        return emprestimo;
    }

    public void salvarEmprestimo (Emprestimo emprestimo){
        log.info("m=salvarEmprestimo emprestimo={}", emprestimo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataEmprestimo = LocalDate.parse(emprestimo.getDataEmprestimo(), formatter);
        LocalDate dataDevolucao = LocalDate.parse(emprestimo.getDataDevolucao(), formatter);
        if(dataDevolucao.isBefore(dataEmprestimo)){
            throw new RuntimeException("Data Devolução não pode ser menor que Data Emprestimo");
        }

        emprestimoRespository.save(emprestimo);
    }

    }

