package br.ufc.web.projeto3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.web.projeto3.model.Usuario;
import br.ufc.web.projeto3.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/usuarios")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
 
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> getUsuario() {
        return new ResponseEntity<List<Usuario>>(usuarioService.getUsuario(), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") Integer id) {
        return new ResponseEntity<Usuario>(usuarioService.getUsuarioById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<Usuario>(usuarioService.addUsuario(usuario.getNome(), usuario.getEmail(), usuario.getDatanascimento(), usuario.getSenha()), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable("id") Integer id, @RequestBody Usuario usuario) {
        return new ResponseEntity<Usuario>(usuarioService.updateUsuario(id, usuario.getNome(), usuario.getEmail(), usuario.getDatanascimento(), usuario.getSenha()), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable("id") Integer id) {
        if (usuarioService.removeUsuario(id)) {
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
 
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }
    
    /*@RequestMapping(method = RequestMethod.GET, value = "/search", params = "cargo")
    public ResponseEntity<List<Funcionario>> getFuncionarioByCargo(@RequestParam("cargo") String cargo){
    	return new ResponseEntity<List<Funcionario>>(funcService.getFuncionarioByCargo(cargo), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/page", params = "quantidade")
    public ResponseEntity<List<Funcionario>> getFuncionarioByQuantidade(@RequestParam("quantidade") Integer quantidade){
    	return new ResponseEntity<List<Funcionario>>(funcService.getFuncionarioByQuantidade(quantidade), HttpStatus.OK);
    }
    */
}
