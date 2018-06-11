package br.com.weinersilva.integracao.enums;

public enum IdentificadorTipo {
	�NICO(1, "�nico dentro da organiza��o"),
	PRONTUARIO(2, "N�mero do prontu�rio"),
	RADIOLOGIA(3, "Radiologia"),
	PATOLOGIA(4, "Patologia"),
	FARM�CIA(5, "Farm�cia");
	
	private int codigo;
	private String descricao;
	
	IdentificadorTipo(){
		
	}
	
	IdentificadorTipo(int codigo, String descricao){
		this.setCodigo(codigo);
		this.setDescricao(descricao);
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
}
