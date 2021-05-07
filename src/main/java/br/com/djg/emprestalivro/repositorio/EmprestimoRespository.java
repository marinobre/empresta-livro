package br.com.djg.emprestalivro.repositorio;

import br.com.djg.emprestalivro.dominio.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRespository extends JpaRepository<Emprestimo, Long> {
}
