package br.com.weinersilva.integracao.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public enum VinculoRelacionamento {

	AVOMATERNA (1, "Av� Materna"),
	AVOMATERNO (2, "Av� Materno"), 
	CONJUGE (3, "Conjuge / Companheiro"),
	IRMAO (4, "Irm�o"),
	IRMA (5, "Irm�"),
	MEIOIRMAO (6, "Meio-Irm�o"),
	MEIOIRMA (6, "Meio-Irm�o"),
	IRMAOS (6, "Meio-Irm�o"),
	CRIANCA (6, "Meio-Irm�o"),
	FILHA (6, "Meio-Irm�o"),
	AVOPATERNA (7, "Meio-Irm�o"),
	AVOPATERNO (8, "Meio-Irm�o"),
	TIOPATERNO (9, "Meio-Irm�o"),
	TIAMATERNA (10, "Meio-Irm�o"),
	TIAPATERNO (11, "Meio-Irm�o"),
	RECEMNASCIDO (12, "Meio-Irm�o"),
	PAIS (13, "Meio-Irm�o"),
	MAEADOTIVA (14, "Meio-Irm�o"),
	PAIADOTIVO (15, "Meio-Irm�o"),
	RESPONSAVEL (16, "Meio-Irm�o"),
	COABITANTE (17, "Meio-Irm�o");

	private int codigo;
	private String descricao;
	
	VinculoRelacionamento (){
		
	}
	
	private VinculoRelacionamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static List<VinculoRelacionamento> getVinculoRelacionamento(){
		List<VinculoRelacionamento> vinculoRelacionamentos = new ArrayList<VinculoRelacionamento>();
		for(VinculoRelacionamento vinculoRelacionamento : VinculoRelacionamento.values()) {
			vinculoRelacionamentos.add(vinculoRelacionamento);
		}
		
		Collections.sort(vinculoRelacionamentos, new Comparator<VinculoRelacionamento>() {
			
			public int compare(VinculoRelacionamento r1, VinculoRelacionamento r2) {
				return new Integer(r1.ordinal()).compareTo(new Integer(r2.ordinal()));
			}
			});
		
		return vinculoRelacionamentos;
	}
}
