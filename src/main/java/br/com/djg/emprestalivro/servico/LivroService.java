package br.com.djg.emprestalivro.servico;

import br.com.djg.emprestalivro.EmprestaLivroApplication;
import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.dominio.Usuario;
import br.com.djg.emprestalivro.repositorio.LivroRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private static final Logger log = LoggerFactory.getLogger(LivroService.class);

    @Autowired
    private LivroRespository livroRespository;

    public List<Livro> buscarTodosLivros () {
        List<Livro> livros = livroRespository.findAll();
        return livros;
    }

    public void salvarLivro (Livro livro){
        log.info("m=salvarLivro livro={}", livro);
        livroRespository.save(livro);
    }

}
