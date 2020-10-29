package br.ufc.web.projeto3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.web.projeto3.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
