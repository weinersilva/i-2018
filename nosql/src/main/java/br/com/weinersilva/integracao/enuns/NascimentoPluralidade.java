package br.com.weinersilva.integracao.enuns;

public enum NascimentoPluralidade {
	�NICO (1, "�nico"),
	G�MEOS (2, "G�meos"),
	TRIG�MEOS(3, "Trig�meos"),
	QU�DRUPLOS(4, "Qu�druplos"),
	QU�NTUPLOS(5, "Qu�ntuplos"),
	S�XTUPLOS(6, "S�xtuplos"),
	OUTROS(7, "Outros"),
	N�ODECLARADO(8, "N�o declarado");
	
	private int codigo;
	private String descricao;
	
	NascimentoPluralidade(){	
	}
	
	private NascimentoPluralidade(int codigo, String descricao) {
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
