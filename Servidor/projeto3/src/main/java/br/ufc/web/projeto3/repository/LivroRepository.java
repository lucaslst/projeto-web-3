package br.ufc.web.projeto3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.web.projeto3.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
