package br.com.weinersilva.integracao.documents;

import java.io.Serializable;

import sun.nio.cs.Surrogate;

/**
 * 
 * @author WeinerSilva
 * registro do individuo no sistema
 */
public class Individuo  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//identificação do individuo
	private Surrogate key;
	//identificação do identificador do individuo
	private Identificador identificador;
	//nomes do individuo
	private Nomes nomes;
	//aborda os dados demograficos do individuo
	private DadosDemograficos dadosDemograficos;
	//identifica os endereços do individuo
	private Endereco endereco;
	//identifica os meios de comunicação do individuo (fone, email, etc..)
	private Comunicacao comunicacao;
	//identifica os vinculos que o individuo possue
	private Vinculos vinculos;
	
	
	public Individuo(){
		
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public Nomes getNomes() {
		return nomes;
	}

	public void setNomes(Nomes nomes) {
		this.nomes = nomes;
	}

	public DadosDemograficos getDadosDemograficos() {
		return dadosDemograficos;
	}

	public void setDadosDemograficos(DadosDemograficos dadosDemograficos) {
		this.dadosDemograficos = dadosDemograficos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Comunicacao getComunicacao() {
		return comunicacao;
	}

	public void setComunicacao(Comunicacao comunicacao) {
		this.comunicacao = comunicacao;
	}

	public Vinculos getVinculos() {
		return vinculos;
	}

	public void setVinculos(Vinculos vinculos) {
		this.vinculos = vinculos;
	}

	public Surrogate getKey() {
		return key;
	}

	public void setKey(Surrogate key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Individuo [key=" + key + ", identificador=" + identificador + ", nomes=" + nomes
				+ ", dadosDemograficos=" + dadosDemograficos + ", endereco=" + endereco + ", comunicacao=" + comunicacao
				+ ", vinculos=" + vinculos + "]";
	}
	
	
	
	
}
