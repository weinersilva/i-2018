package br.com.weinersilva.integracao.documents;

import java.io.Serializable;
import java.util.Calendar;

import br.com.weinersilva.integracao.enuns.VinculoRelacionamento;
/**
 * 
 * @author Weiner
 * Classe que instancia um vinculo para o indivíduo, para contribuir com a acurácia das informações associadas a ele, 
 * o que pode ser fruto de uma relação social.
 *
 */
public class Vinculos  implements Serializable  {

	private static final long serialVersionUID = 1L;
	//instancia do individuo - id
	private Individuo individuo;
	//instancia do individuo vinculado - id
	private Individuo individuoVinculo;
	//tiporelacionamento entre os individuos vinculados
	private VinculoRelacionamento vinculoRelacionamento;
	//data inicio do vinculo
	private Calendar dataInicial;
	//data final do vinculo - data final em branco referece que ainda nao teve fim o vinculo
	private Calendar dataFinal;
	
	Vinculos(){
		
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}

	public Individuo getIndividuoVinculo() {
		return individuoVinculo;
	}

	public void setIndividuoVinculo(Individuo individuoVinculo) {
		this.individuoVinculo = individuoVinculo;
	}

	public VinculoRelacionamento getVinculoRelacionamento() {
		return vinculoRelacionamento;
	}

	public void setVinculoRelacionamento(VinculoRelacionamento vinculoRelacionamento) {
		this.vinculoRelacionamento = vinculoRelacionamento;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	

}
