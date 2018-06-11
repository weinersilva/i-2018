package br.com.weinersilva.integracao.enuns;

public enum IdentificadorArea {
	LOCAL(1, "Identifica��o local", "L"),
	AREA(2, "Identificador de �rea, regi�o ou distrito", "A"),
	ESTADO(3, "Identificador de estado, prov�ncia ou territ�rio", "E"),
	NACIONAL(4, "Identificador nacional","N");
	
	private int codigo;
	private String descricao;
	private String alternativo;
	
	IdentificadorArea(){
		
	}
	
	IdentificadorArea(int codigo, String descricao, String alternativo){
		this.codigo = codigo;
		this.descricao = descricao;
		this.alternativo = alternativo;
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

	public String getAlternativo() {
		return alternativo;
	}

	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}
	
	
}
