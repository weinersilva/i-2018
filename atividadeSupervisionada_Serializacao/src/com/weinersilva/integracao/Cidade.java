package com.weinersilva.integracao;

public class Cidade {

	private String nome;
	private String estado;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Cidade(String nome, String estado) {
		this.nome = nome;
		this.estado = estado;
	}
	
	
}
