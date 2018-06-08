package br.com.weinersilva.integracao.enuns;

public enum ComunicacaoPreferencia {

	HORARIOCOMERCIAL(1,"Hor�rio Comercial"),
	DURANTEODIA(2, "Durante o dia"),
	FINAISDESEMANA(3, "Finais de semana"),
	QUALQUERHORA(4, "Qualquer hora"),
	PERIODONOTURNO(5, "Per�odo noturno");
	
	private int codigo;
	private String descricao;
	
	ComunicacaoPreferencia(){
	}
	
	private ComunicacaoPreferencia(int codigo, String descricao) {
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
