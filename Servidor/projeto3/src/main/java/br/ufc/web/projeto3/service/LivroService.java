package br.ufc.web.projeto3.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.web.projeto3.model.Livro;
import br.ufc.web.projeto3.repository.LivroRepository;

@Service

public class LivroService {
	@Autowired
    LivroRepository livroRepo;
    
    public Livro addLivro(String titulo, String genero, String autor, String sinopse, String datapublicacao, Integer numerototalcapitulos) {
        Livro livro = new Livro(titulo, genero, autor, sinopse, datapublicacao, numerototalcapitulos);
        return livroRepo.save(livro);
    }
    
    public boolean removeLivro(Integer id) {
        if(livroRepo.existsById(id)) {
            livroRepo.deleteById(id);
            return true;
        }
        
        return false;
    }
    
    public List<Livro> getLivro() {
        return livroRepo.findAll();
    }
    
    public Livro getLivroById(Integer id) {
        return livroRepo.findById(id).get();
    }
    
    public List<Livro> getLivroByAutor(String autor) {
        return livroRepo.findByAutor(autor);
    }
    
    public List<Livro> getLivroByGenero(String genero) {
        return livroRepo.findByGenero(genero);
    }
    
    public Livro updateLivro(Integer id, String titulo, String genero, String autor, String sinopse, String datapublicacao, Integer numerototalcapitulos){
        Livro livroAux = livroRepo.findById(id).get();
        if(livroAux != null) {
            livroAux.setId(id);
            livroAux.setTitulo(titulo);
            livroAux.setGenero(genero);
            livroAux.setAutor(autor);
            livroAux.setSinopse(sinopse);
            livroAux.setDatapublicacao(datapublicacao);
            livroAux.setNumerototalcapitulos(numerototalcapitulos);
            livroRepo.save(livroAux);         
        }
        
        return livroAux;
    }
}