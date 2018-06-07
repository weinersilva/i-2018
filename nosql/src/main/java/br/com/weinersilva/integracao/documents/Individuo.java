package br.com.weinersilva.integracao.documents;

public class Individuo {

	private String id;
	private Identificador identificador;
	private Nomes nomes;
	private DadosDemograficos dadosDemograficos;
	private Endereco endereco;
	private Comunicacao comunicacao;
	private Vinculos vinculos;
	
	
	Individuo(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	
	
	
}
