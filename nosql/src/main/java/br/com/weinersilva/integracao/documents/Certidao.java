package br.com.weinersilva.integracao.documents;

import java.io.Serializable;
/**
 * 
 * @author WeinerSilva
 * Classe registro da certidao do individuo
 */
public class Certidao  implements Serializable {

	private static final long serialVersionUID = 1L;
	//instancia do individuo
	private Individuo individuo;
	//tipo de certidao (nascimento, casamento, obito)
	private String tipo;
	//descricao do nome do cartorio
	private String cartorio;
	//numero do livro que foi registrada
	private String livro;
	//numero da folha de registro
	private String folha;
	//numero do registro da certidão
	private String termo;
	
	public Individuo getIndividuo() {
		return individuo;
	}
	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCartorio() {
		return cartorio;
	}
	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public String getFolha() {
		return folha;
	}
	public void setFolha(String folha) {
		this.folha = folha;
	}
	public String getTermo() {
		return termo;
	}
	public void setTermo(String termo) {
		this.termo = termo;
	}
	
	public Certidao(){
		
	}
	@Override
	public String toString() {
		return "Certidao [individuo=" + individuo + ", tipo=" + tipo + ", cartorio=" + cartorio + ", livro=" + livro
				+ ", folha=" + folha + ", termo=" + termo + "]";
	}
	
	
}
