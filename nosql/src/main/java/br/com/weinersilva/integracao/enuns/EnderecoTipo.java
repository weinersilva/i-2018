package br.com.weinersilva.integracao.enuns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum EnderecoTipo {

	RESIDENCIAL(1, "Residencial"),
	COMERCIAL(2, "Comercial"),
	CORREIOOUPOSTAL(3, "Correio ou Postal"),
	ACOMODACAOTEMPORARIA(4, "Acomodação temporário"),
	SEMENDERECOFIXO(5, "Sem endereço fixo"),
	DESCONHECIDONAOINFORMADO(6, "Desconhecido / Não informado");
	
	private int codigo;
	private String descricao;
	
	EnderecoTipo(){
	}
	
	private EnderecoTipo(int codigo, String descricao) {
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
	
	public static List<EnderecoTipo> getEnderecoTipo(){
		List<EnderecoTipo> enderecoTipos = new ArrayList<EnderecoTipo>();
		for(EnderecoTipo enderecoTipo : EnderecoTipo.values()) {
			enderecoTipos.add(enderecoTipo);
		}
		
		Collections.sort(enderecoTipos, new Comparator<EnderecoTipo>() {
			
			public int compare(EnderecoTipo e1, EnderecoTipo e2) {
				return new Integer(e1.ordinal()).compareTo(new Integer(e2.ordinal()));
			}
			});
		
		return enderecoTipos;
	}
}
