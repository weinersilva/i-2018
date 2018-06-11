package br.com.weinersilva.integracao.enums;

public enum UsoCondicional {

	INFONAOCONFIAVEL(1, "Informa��o n�o confi�vel."),
	ERRODIGITACAO(2, "Nome com erro de digita��o."),
	N�OSERUSADO(3, "Nome para n�o ser usado."),
	PRO�BIDO(4, "Vinculo do nome pro�bido por lei."),
	PRIVACIDADE(6, "Requisito de privacidade / seguran�a especial."),
	TEMPORARIO(9, "Nome tempor�rio.");
	
	private int codigo;
	private String descricao;
	
	UsoCondicional(){	
	}
	
	private UsoCondicional(int codigo, String descricao) {
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
