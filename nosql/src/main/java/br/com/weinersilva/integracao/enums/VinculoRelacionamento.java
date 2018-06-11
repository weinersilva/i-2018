package br.com.weinersilva.integracao.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public enum VinculoRelacionamento {

	AVOMATERNA (1, "Avó Materna"),
	AVOMATERNO (2, "Avô Materno"), 
	CONJUGE (3, "Conjuge / Companheiro"),
	IRMAO (4, "Irmão"),
	IRMA (5, "Irmã"),
	MEIOIRMAO (6, "Meio-Irmão"),
	MEIOIRMA (6, "Meio-Irmão"),
	IRMAOS (6, "Meio-Irmão"),
	CRIANCA (6, "Meio-Irmão"),
	FILHA (6, "Meio-Irmão"),
	AVOPATERNA (7, "Meio-Irmão"),
	AVOPATERNO (8, "Meio-Irmão"),
	TIOPATERNO (9, "Meio-Irmão"),
	TIAMATERNA (10, "Meio-Irmão"),
	TIAPATERNO (11, "Meio-Irmão"),
	RECEMNASCIDO (12, "Meio-Irmão"),
	PAIS (13, "Meio-Irmão"),
	MAEADOTIVA (14, "Meio-Irmão"),
	PAIADOTIVO (15, "Meio-Irmão"),
	RESPONSAVEL (16, "Meio-Irmão"),
	COABITANTE (17, "Meio-Irmão");

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
