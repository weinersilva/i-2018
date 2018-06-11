package br.com.weinersilva.integracao.documents;

import java.io.Serializable;

/**
 * 
 * @author WeinerSilva
 * Classe que instancia o titulo de eleitor do individuo
 */
public class TituloEleitoral  implements Serializable  {

	private static final long serialVersionUID = 1L;
	//instancia do individuo
	private Individuo individuo;
	//secao eleitoral
	private String secao;
	//zona eleitoral
	private String zona;
	
	public Individuo getIndividuo() {
		return individuo;
	}
	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}
	public String getSecao() {
		return secao;
	}
	public void setSecao(String secao) {
		this.secao = secao;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public TituloEleitoral(){
		
	}
	@Override
	public String toString() {
		return "TituloEleitoral [individuo=" + individuo + ", secao=" + secao + ", zona=" + zona + "]";
	}
	
	
}
