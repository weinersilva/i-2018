package br.com.weinersilva.integracao.documents;

import java.util.Calendar;

import br.com.weinersilva.integracao.enuns.EnderecoTipo;
import br.com.weinersilva.integracao.enuns.Estado;
import br.com.weinersilva.integracao.enuns.Pais;

public class Endereco {

	private String id;
	private Individuo individuo;
	private String bairro;
	private String distrito;
	private Municipio municipio;
	private Estado estado;
	private Pais pais;
	private String cep;
	private String caixaPostal;
	private EnderecoTipo enderecoTipo;
	private Calendar dataInicial;
	private String dataInicialAcuracia;
	private Calendar dataFinal;
	private String dataFinalAcuracia;
	private EnderecoLinha enderecoLinha;
	
	Endereco(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCaixaPostal() {
		return caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	public EnderecoTipo getEnderecoTipo() {
		return enderecoTipo;
	}

	public void setEnderecoTipo(EnderecoTipo enderecoTipo) {
		this.enderecoTipo = enderecoTipo;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataInicialAcuracia() {
		return dataInicialAcuracia;
	}

	public void setDataInicialAcuracia(String dataInicialAcuracia) {
		this.dataInicialAcuracia = dataInicialAcuracia;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getDataFinalAcuracia() {
		return dataFinalAcuracia;
	}

	public void setDataFinalAcuracia(String dataFinalAcuracia) {
		this.dataFinalAcuracia = dataFinalAcuracia;
	}

	public EnderecoLinha getEnderecoLinha() {
		return enderecoLinha;
	}

	public void setEnderecoLinha(EnderecoLinha enderecoLinha) {
		this.enderecoLinha = enderecoLinha;
	}
	
	
}
