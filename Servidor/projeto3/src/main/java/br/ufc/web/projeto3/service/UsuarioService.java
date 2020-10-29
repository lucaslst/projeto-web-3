package br.ufc.web.projeto3.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.web.projeto3.model.Usuario;
import br.ufc.web.projeto3.repository.UsuarioRepository;

@Service

public class UsuarioService {
	@Autowired
    UsuarioRepository userRepo;
    
    public Usuario addUsuario(String nome, String email, String datanascimento, String senha) {
        Usuario usuario = new Usuario(nome, email, datanascimento, senha);
        return userRepo.save(usuario);
    }
    
    public boolean removeUsuario(Integer id) {
        if(userRepo.existsById(id)) {
            userRepo.deleteById(id);
            return true;
        }
        
        return false;
    }
    
    public List<Usuario> getUsuario() {
        return userRepo.findAll();
    }
    
    public Usuario getUsuarioById(Integer id) {
        return userRepo.findById(id).get();
    }
    
    /*public List<Usuario> getUsuarioByCargo(String cargo) {
        return userRepo.findByCargo(cargo);
    }
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Funcionario> getFuncionarioByQuantidade(int quantidade){
    	List<Funcionario> consulta = entityManager.createQuery("SELECT funcionario from funcionarios funcionario ORDER BY funcionario.id", Funcionario.class).setMaxResults(quantidade).getResultList();
    	
    	return consulta;
    }
    */
    
    public Usuario updateUsuario(Integer id, String nome, String email, String dataNascimento, String senha){
        Usuario userAux = userRepo.findById(id).get();
        if(userAux != null) {
            userAux.setId(id);
            userAux.setNome(nome);
            userAux.setEmail(email);
            userAux.setDatanascimento(dataNascimento);
            userAux.setSenha(senha);
            userRepo.save(userAux);         
        }
        
        return userAux;
    }

}
