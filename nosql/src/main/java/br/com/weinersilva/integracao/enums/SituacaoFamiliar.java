package br.com.weinersilva.integracao.enums;

public enum SituacaoFamiliar {

	COMPANHEIROEFILHO(1, "Companheiro(a) e filho(s)"),
	COMANHEIROSEMFILHO(2, "Companheiro(a) com la�os conjugais e sem filho(s)"),
	COMPANHEIROFILHOEOUTROS(3, "Companheiro(a), com filho(s) e/ou outro(s) familiares"),
	FAMILIARSEMCOMPANHEIRO(4, "Familiar(es) sem companheiro(s)"),
	OUTRAPESSOA(5, "Outra(s) pessoa(s) sem la�os consangu�neos e/ou la�os conjugais"),
	VIVESO(6, "Vive s�");
	
	private int codigo;
	private String descricao;
	
	SituacaoFamiliar(){
	}
	
	private SituacaoFamiliar(int codigo, String descricao) {
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
