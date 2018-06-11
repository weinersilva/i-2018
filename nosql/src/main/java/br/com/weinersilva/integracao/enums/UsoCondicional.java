package br.com.weinersilva.integracao.enums;

public enum UsoCondicional {

	INFONAOCONFIAVEL(1, "Informação não confiável."),
	ERRODIGITACAO(2, "Nome com erro de digitação."),
	NÃOSERUSADO(3, "Nome para não ser usado."),
	PROÍBIDO(4, "Vinculo do nome proíbido por lei."),
	PRIVACIDADE(6, "Requisito de privacidade / segurança especial."),
	TEMPORARIO(9, "Nome temporário.");
	
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
