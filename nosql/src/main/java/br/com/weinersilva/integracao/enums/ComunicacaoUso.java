package br.com.weinersilva.integracao.enums;

public enum ComunicacaoUso {

	COMERCIAL(1, "Comercial"),
	PESSOAL(2, "Pessoal"),
	COMERCIALOUPESSOAL(3, "Comercial ou Pessoal");
	
	private int codigo;
	private String descricao;
	
	ComunicacaoUso(){
	}
	
	private ComunicacaoUso(int codigo, String descricao) {
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
