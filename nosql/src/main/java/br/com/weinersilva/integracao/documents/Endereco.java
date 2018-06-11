package br.com.weinersilva.integracao.documents;

import java.io.Serializable;
import java.util.Calendar;

import br.com.weinersilva.integracao.enums.EnderecoTipo;
import br.com.weinersilva.integracao.enums.Estado;
import br.com.weinersilva.integracao.enums.Pais;
/**
 * 
 * @author WeinerSilva
 * classe representante do endere�o do individuo
 */
import sun.nio.cs.Surrogate;
public class Endereco  implements Serializable {

	private static final long serialVersionUID = 1L;
	//identifica��o do endere�o
	private Surrogate key;
	//identifica��o do individuo que possue o endere�o
	private Individuo individuo;
	//identifica o bairro do endere�o
	private String bairro;
	//se pertencer a um distrito, ser� identificado aqui
	private String distrito;
	//identifica o municipio do endere�o
	private Municipio municipio;
	//identifica o estado do endere�o
	private Estado estado;
	//identifica o pais do endere�o
	private Pais pais;
	//identifica o cep do endere�o
	private String cep;
	//se houver caixa postal, ser� identificada aqui
	private String caixaPostal;
	//tipo do endere�o do individuo (residencia, comercial, etc...)
	private EnderecoTipo enderecoTipo;
	//data inicial do individuo no endere�o
	private Calendar dataInicial;
	//acuracia da data inicial
	private String dataInicialAcuracia;
	//data final do individuo no endere�o
	private Calendar dataFinal;
	//acuracia da data final
	private String dataFinalAcuracia;
	//identifica��o do registro do endere�o
	private EnderecoLinha enderecoLinha;
	
	Endereco(){
		
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



	public Surrogate getKey() {
		return key;
	}



	public void setKey(Surrogate key) {
		this.key = key;
	}
	
	
}
