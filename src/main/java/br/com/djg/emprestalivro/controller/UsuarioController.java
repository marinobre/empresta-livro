package br.com.djg.emprestalivro.controller;

import br.com.djg.emprestalivro.dominio.Usuario;
import br.com.djg.emprestalivro.repositorio.UsuarioRepository;
import br.com.djg.emprestalivro.servico.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> buscarTodosUsuarios ()  {
        List<Usuario> listaDeUsuarios = usuarioService.buscarTodosUsuarios();
        return listaDeUsuarios;
    }
    @PostMapping
    public void save(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
    }
}
