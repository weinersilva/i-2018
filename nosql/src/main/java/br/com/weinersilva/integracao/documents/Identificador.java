package br.com.weinersilva.integracao.documents;

import java.io.Serializable;
import java.util.Calendar;

import br.com.weinersilva.integracao.enums.IdentificadorArea;
import br.com.weinersilva.integracao.enums.IdentificadorTipo;
import sun.nio.cs.Surrogate;
/**
 * 
 * @author WeinerSilva
 * classe que representa um identificador (ou documento) do individuo
 */
public class Identificador  implements Serializable  {

	private static final long serialVersionUID = 1L;
	//identificação do identificador
	private Surrogate key;
	//identificação do individuo vinculado
	private Individuo individuo;
	//tipo do identificador
	private IdentificadorTipo identificadorTipo;
	//propriamente dito é o numero do documento especificado
	private String designacao;
	//codigo que representa a area geografica na qual o identificador é utilizado
	private IdentificadorArea identificadorArea;
	//organização que expediu o identificador do individuo
	private String emissor;
	//data de emissao do identificador
	private Calendar dataEmissao;
	//identificação da certidao utilizada no cadastro
	private Certidao certidao;
	//identificacao da ctps do individuo
	private CTPS ctps;
	//identificacao do titulo de eleitor do individuo
	private TituloEleitoral tituloEleitoral;
	
	Identificador(){
		
	}

	

	public IdentificadorTipo getIdentificadorTipo() {
		return identificadorTipo;
	}

	public void setIdentificadorTipo(IdentificadorTipo identificadorTipo) {
		this.identificadorTipo = identificadorTipo;
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public IdentificadorArea getIdentificadorArea() {
		return identificadorArea;
	}

	public void setIdentificadorArea(IdentificadorArea identificadorArea) {
		this.identificadorArea = identificadorArea;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Certidao getCertidao() {
		return certidao;
	}

	public void setCertidao(Certidao certidao) {
		this.certidao = certidao;
	}

	public CTPS getCtps() {
		return ctps;
	}

	public void setCtps(CTPS ctps) {
		this.ctps = ctps;
	}

	public TituloEleitoral getTituloEleitoral() {
		return tituloEleitoral;
	}

	public void setTituloEleitoral(TituloEleitoral tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}



	public Surrogate getKey() {
		return key;
	}



	public void setKey(Surrogate key) {
		this.key = key;
	}
	
	
}
