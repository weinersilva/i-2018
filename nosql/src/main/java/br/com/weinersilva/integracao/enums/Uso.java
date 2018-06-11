package br.com.weinersilva.integracao.enums;

public enum Uso {
	RELATÓRIO(1, "Relatório", "R"),
	NOMERECÉMNASCIDO(2, "Nome de recém-nascido", "N"),
	NOMEPROFISSIONAL(3, "Nome profissional ou comercial", "C"),
	NOMESOLTEIRO(4, "Nome de solteiro, nome de nascimento ou nome original", "S"),
	NOMEREGISTRADO(5, "Nome registrado (nome legal)", "L"),
	OUTRONOME(8, "Outro nome (alias)", "O");
	
	private int codigo;
	private String descricao;
	private String alternativa;
	
	Uso(){
	}
	
	private Uso(int codigo, String descricao, String alternativa) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.setAlternativa(alternativa);
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

	public String getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
}
