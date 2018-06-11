package br.com.weinersilva.integracao.enums;

public enum Sexo {

	MASCULINO("M", "Masculino"),
	FEMININO("F", "Feminino"),
	INTERSEXO("I", "Intersexo ou indeterminado"),
	NAODECLARADO("U", "Não declarado");
	
	private String codigo;
	private String descricao;
	
	Sexo(){
	}
	
	private Sexo(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
