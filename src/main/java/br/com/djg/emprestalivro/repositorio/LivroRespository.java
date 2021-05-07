package br.com.djg.emprestalivro.repositorio;

import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRespository extends JpaRepository<Livro, Long>
    {
    }
