package br.com.weinersilva.integracao.documents;

import java.util.Calendar;

import br.com.weinersilva.integracao.enuns.VinculoRelacionamento;

public class Vinculos {
	
	private Individuo individuo;
	private Individuo individuoVinculo;
	private VinculoRelacionamento vinculoRelacionamento;
	private Calendar dataInicial;
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
