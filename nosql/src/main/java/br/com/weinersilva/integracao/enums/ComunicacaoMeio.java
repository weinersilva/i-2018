package br.com.weinersilva.integracao.enums;

public enum ComunicacaoMeio {

	TELEFONE(1, "Telefone"),
	CELULAR(2, "Celular"),
	FAX(3, "Fax"),
	PAGER(4, "Pager"),
	EMAIL(5, "Email"),
	URL(6, "URL"),
	OUTRO(7, "Outro");
	
	private int codigo;
	private String descricao;
	
	ComunicacaoMeio (){
		
	}
	
	private ComunicacaoMeio(int codigo, String descricao) {
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
