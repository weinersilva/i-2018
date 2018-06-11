package br.com.weinersilva.integracao.enums;

public enum Preferido {

	PREFERIDO(1, "Este � o nome preferido. Deve ser usado em relat�rios, cartas e outros, exceto se um uso espec�fico, comentado adiante, indicar o uso de outro nome."),
	N�OPREFERIDO(2, "Este n�o � o nome preferido.");
	
	private int codigo;
	private String descricao;
	
	Preferido(){	
	}
	
	private Preferido(int codigo, String descricao) {
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
}
