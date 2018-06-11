package br.com.weinersilva.integracao.documents;

import java.io.Serializable;

import br.com.weinersilva.integracao.enums.Estado;
/**
 * 
 * @author WeinerSilva
 * classe responsável pelo registro da CTPS do individuo
 */
public class CTPS  implements Serializable {

	private static final long serialVersionUID = 1L;
	//instancia do individuo vinculado
	private Individuo individuo;
	//numero de serie da CTPS
	private String serie;
	//estado de origem da CTPS
	private Estado estado;
	
	public Individuo getIndividuo() {
		return individuo;
	}
	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "CTPS [individuo=" + individuo + ", serie=" + serie + ", estado=" + estado + "]";
	}
	
	public CTPS(){
		
	}
}
