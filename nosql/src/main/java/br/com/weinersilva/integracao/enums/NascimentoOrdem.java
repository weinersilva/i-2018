package br.com.weinersilva.integracao.enums;

public enum NascimentoOrdem {
	ÚNICO (1, "Único ou primeiro"),
	SEGUNDO (2, "Segundo"),
	TERCEIRO(3, "Terceiro"),
	QUARTO(4, "Quarto"),
	QUINTO(5, "Quinto"),
	SEXTO(6, "Sexto"),
	OUTROS(7, "Outros"),
	NÃODECLARADO(8, "Não declarado");
	
	private int codigo;
	private String descricao;
	
	NascimentoOrdem(){	
	}
	
	private NascimentoOrdem(int codigo, String descricao) {
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
