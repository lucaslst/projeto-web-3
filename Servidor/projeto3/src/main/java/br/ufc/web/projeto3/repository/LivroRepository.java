package br.ufc.web.projeto3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.web.projeto3.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{
	List<Livro> findByAutor(String autor);
	List<Livro> findByGenero(String genero);
}
