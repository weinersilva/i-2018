package br.com.weinersilva.integracao.documents;

import java.io.Serializable;

import br.com.weinersilva.integracao.enuns.ComunicacaoMeio;
import br.com.weinersilva.integracao.enuns.ComunicacaoPreferencia;
import br.com.weinersilva.integracao.enuns.ComunicacaoUso;
/**
 * 
 * @author WeinerSilva
 * Classe de registro dos tipos de comunica��o cadastradas aos individuos
 */
public class Comunicacao  implements Serializable  {

	private static final long serialVersionUID = 1L;
	//instancia do individuo
	private Individuo individuo;
	//tipo do registro de comunica��o (telefone, email, etc...)
	private ComunicacaoMeio comunicacaoMeio;
	//tipo de preferencia para contato
	private ComunicacaoPreferencia comunicacaoPreferencia;
	//descricao da comunicacao
	private String detalhe;
	//tipo de utilizacao do meio de comunica��o (pessoal, comercial, etc..)
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
