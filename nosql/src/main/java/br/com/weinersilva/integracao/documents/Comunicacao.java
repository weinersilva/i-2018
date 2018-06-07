package br.com.weinersilva.integracao.documents;

import br.com.weinersilva.integracao.enuns.ComunicacaoMeio;
import br.com.weinersilva.integracao.enuns.ComunicacaoPreferencia;
import br.com.weinersilva.integracao.enuns.ComunicacaoUso;

public class Comunicacao {
	
	private Individuo individuo;
	private ComunicacaoMeio comunicacaoMeio;
	private ComunicacaoPreferencia comunicacaoPreferencia;
	private String detalhe;
	private ComunicacaoUso comunicacaoUso;
	
	Comunicacao(){
		
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}

	public ComunicacaoMeio getComunicacaoMeio() {
		return comunicacaoMeio;
	}

	public void setComunicacaoMeio(ComunicacaoMeio comunicacaoMeio) {
		this.comunicacaoMeio = comunicacaoMeio;
	}

	public ComunicacaoPreferencia getComunicacaoPreferencia() {
		return comunicacaoPreferencia;
	}

	public void setComunicacaoPreferencia(ComunicacaoPreferencia comunicacaoPreferencia) {
		this.comunicacaoPreferencia = comunicacaoPreferencia;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

	public ComunicacaoUso getComunicacaoUso() {
		return comunicacaoUso;
	}

	public void setComunicacaoUso(ComunicacaoUso comunicacaoUso) {
		this.comunicacaoUso = comunicacaoUso;
	}
	
	
	
}
