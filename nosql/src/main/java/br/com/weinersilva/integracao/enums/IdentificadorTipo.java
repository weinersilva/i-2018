package br.com.weinersilva.integracao.enums;

public enum IdentificadorTipo {
	ÚNICO(1, "Único dentro da organização"),
	PRONTUARIO(2, "Número do prontuário"),
	RADIOLOGIA(3, "Radiologia"),
	PATOLOGIA(4, "Patologia"),
	FARMÁCIA(5, "Farmácia");
	
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
