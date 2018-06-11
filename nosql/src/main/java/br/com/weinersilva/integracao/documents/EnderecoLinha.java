package br.com.weinersilva.integracao.documents;
/**
 * 
 * @author WeinerSilva
 * Classe que identifica o registro dos enderecos do individuo
 */
public class EnderecoLinha {

	//instancia do endereco
	private Endereco endereco;
	//linha de registro
	private String linha;
	//ordem de registro no cadastro
	private String ordem;
	
	EnderecoLinha(){
		
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		return "EnderecoLinha [endereco=" + endereco + ", linha=" + linha + ", ordem=" + ordem + "]";
	}
	
	
}
