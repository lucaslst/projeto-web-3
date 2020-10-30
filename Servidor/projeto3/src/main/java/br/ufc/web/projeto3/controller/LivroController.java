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

import br.ufc.web.projeto3.model.Livro;
import br.ufc.web.projeto3.service.LivroService;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/livros")

public class LivroController {

    @Autowired
    LivroService livroService;
 
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Livro>> getLivro() {
        return new ResponseEntity<List<Livro>>(livroService.getLivro(), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity<Livro> getLivroById(@PathVariable("id") Integer id) {
        return new ResponseEntity<Livro>(livroService.getLivroById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Livro> addLivro(@RequestBody Livro livro) {
        return new ResponseEntity<Livro>(livroService.addLivro(livro.getTitulo(), livro.getGenero(), livro.getAutor(), livro.getSinopse(), livro.getDatapublicacao(), livro.getNumerototalcapitulos()), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public ResponseEntity<Livro> updateLivro(@PathVariable("id") Integer id, @RequestBody Livro livro) {
        return new ResponseEntity<Livro>(livroService.updateLivro(id, livro.getTitulo(), livro.getGenero(), livro.getAutor(), livro.getSinopse(), livro.getDatapublicacao(), livro.getNumerototalcapitulos()), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public ResponseEntity<Void> deleteLivro(@PathVariable("id") Integer id) {
        if (livroService.removeLivro(id)) {
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
 
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/search", params = "autor")
    public ResponseEntity<List<Livro>> getLivroByAutor(@RequestParam("autor") String autor){
    	return new ResponseEntity<List<Livro>>(livroService.getLivroByAutor(autor), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/search", params = "genero")
    public ResponseEntity<List<Livro>> getLivroByGenero(@RequestParam("genero") String genero){
    	return new ResponseEntity<List<Livro>>(livroService.getLivroByGenero(genero), HttpStatus.OK);
    }
}
