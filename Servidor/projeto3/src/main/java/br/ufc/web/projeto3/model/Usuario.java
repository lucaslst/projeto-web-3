package br.ufc.web.projeto3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="usuarios")

public class Usuario {

	@Id
    @GeneratedValue
	
	int id;
	String nome;
	String email;
	String datanascimento;
    String senha;
    
    public Usuario(int id, String nome, String email, String datanascimento, String senha) {
        super();
        this.id = id;
        this.nome = nome;
    	this.email = email;
    	this.datanascimento = datanascimento;
        this.senha = senha;
    }
    
    public Usuario(String nome, String email, String datanascimento, String senha) {
        super();
        this.nome = nome;
    	this.email = email;
    	this.datanascimento = datanascimento;
        this.senha = senha;
    }
    
    public Usuario() {
    }
    
    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDatanascimento() {
		return datanascimento;
	}



	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	@Override
    public String toString() {
        return "Usuario [id=" + id + "nome=" + nome + "email=" + email + ", senha=" + senha + ", datanascimento=" + datanascimento + "]";
    }
	
	
}
