package br.com.weinersilva.integracao.enums;

public enum ObitoFonte {

	CARTORIO(1, "Cartório"),
	PRESTADORSAUDE(2, "Prestador de assistência à saúde"),
	PARENTE(3, "Parente"),
	OUTRO(4, "Outro"),
	DESCONHECIDO(5, "Desconhecido");
	
	private int codigo;
	private String descricao;
	
	ObitoFonte(){
	}
	
	private ObitoFonte(int codigo, String descricao) {
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
