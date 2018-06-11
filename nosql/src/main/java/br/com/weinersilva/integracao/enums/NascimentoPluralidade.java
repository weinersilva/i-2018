package br.com.weinersilva.integracao.enums;

public enum NascimentoPluralidade {
	ÚNICO (1, "Único"),
	GÊMEOS (2, "Gêmeos"),
	TRIGÊMEOS(3, "Trigêmeos"),
	QUÁDRUPLOS(4, "Quádruplos"),
	QUÍNTUPLOS(5, "Quíntuplos"),
	SÊXTUPLOS(6, "Sêxtuplos"),
	OUTROS(7, "Outros"),
	NÃODECLARADO(8, "Não declarado");
	
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
