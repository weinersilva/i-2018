package br.github.weinersilva.integracao.model;

import java.util.Arrays;

public class Sapato extends Calcado {

	private int[] cor;
	
	public int[] getCor() {
		return cor;
	}

	
	public Sapato() {
		super();
		
	}


	public void setCor(int red, int green, int blue) {
		this.cor[0] = red;
		this.cor[1] = green;
		this.cor[2] = blue;
		
	}


	@Override
	public String toString() {
		return "Sapato [cor=" + Arrays.toString(cor) + ", getMarca()=" + getMarca() + ", getPreco()=" + getPreco()
				+ "]";
	}


	
}
