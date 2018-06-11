package br.com.weinersilva.integracao.documents;

import java.io.Serializable;

import br.com.weinersilva.integracao.enums.Estado;
/**
 * 
 * @author WeinerSilva
 * Classe de cadastro dos municipio
 */
public class Municipio implements Serializable {

	private static final long serialVersionUID = 1L;
	//identificador do municipio
	private Long codigo;
	//nome do muncipio
	private String nome;
	//estado do municipio
	private Estado estado;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Municipio [codigo=" + codigo + ", nome=" + nome + ", estado=" + estado + "]";
	}
    
	Municipio() {
	
	}
	
	
}
