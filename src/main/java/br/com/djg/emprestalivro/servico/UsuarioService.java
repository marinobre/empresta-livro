package br.com.djg.emprestalivro.servico;

import br.com.djg.emprestalivro.dominio.Usuario;
import br.com.djg.emprestalivro.repositorio.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarTodosUsuarios () {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    public void salvarUsuario (Usuario usuario){
      usuarioRepository.save(usuario);
    }

}
