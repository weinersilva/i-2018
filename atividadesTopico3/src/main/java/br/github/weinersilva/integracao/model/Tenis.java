package br.github.weinersilva.integracao.model;

public class Tenis extends Calcado  {

	private String esporte;

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public Tenis() {
		super();
		}

	@Override
	public String toString() {
		return "Tenis [esporte=" + esporte + ", getMarca()=" + getMarca() + ", getPreco()=" + getPreco() + "]";
	}
	
	
}
