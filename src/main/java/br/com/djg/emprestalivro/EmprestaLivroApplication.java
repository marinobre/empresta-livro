package br.com.djg.emprestalivro;

import br.com.djg.emprestalivro.dominio.Usuario;
import br.com.djg.emprestalivro.repositorio.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class EmprestaLivroApplication {
	private static final Logger log = LoggerFactory.getLogger(EmprestaLivroApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmprestaLivroApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UsuarioRepository repository) {
		return (args) -> {
			// save a few usuarios
	///		repository.save(new Usuario("mari", "18/07", "RUA A"));
	///		repository.save(new Usuario("bia", "01/07", "RUA B"));
		};
	}

}
