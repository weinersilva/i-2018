package br.github.weinersilva.integracao.repositorio;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import br.github.weinersilva.integracao.model.Sapato;
import br.github.weinersilva.integracao.model.Tenis;

@XmlRootElement
public class Calcados {
	
	private ArrayList<Sapato> sapatos;
	private ArrayList<Tenis> tenis;
	
	public ArrayList<Sapato> getSapato() {
		return sapatos;
	}
	public void setSapato(ArrayList<Sapato> sapatos) {
		this.sapatos = sapatos;
	}
	public ArrayList<Tenis> getTenis() {
		return tenis;
	}
	public void setTenis(ArrayList<Tenis> tenis) {
		this.tenis = tenis;
	}

	@Override
	public String toString() {
		return "Calcados [sapatos=" + sapatos + ", tenis=" + tenis + "]";
	}
	
	
	

}
