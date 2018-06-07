package br.com.weinersilva.integracao.documents;

import java.util.Calendar;

import br.com.weinersilva.integracao.enuns.IdentificadorArea;
import br.com.weinersilva.integracao.enuns.IdentificadorTipo;

public class Identificador {
	
	private String id;
	private Individuo individuo;
	private IdentificadorTipo identificadorTipo;
	private String designacao;
	private IdentificadorArea identificadorArea;
	private String emissor;
	private Calendar dataEmissao;
	private Certidao certidao;
	private CTPS ctps;
	private TituloEleitoral tituloEleitoral;
	
	Identificador(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	
}
