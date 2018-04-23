package com.weinersilva.integracao;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String email;
	private Cidade cidade;
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
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Pessoa(String nome, String email, Cidade cidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
	}
	
	
}
