package br.com.weinersilva.integracao.documents;

import br.com.weinersilva.integracao.enuns.Preferido;
import br.com.weinersilva.integracao.enuns.UsoCondicional;

public class Nomes {

	private String id;
	private Individuo individuo;
	private String titulos;
	private String nome;
	private String sobrenome;
	private Preferido preferido;
	private UsoCondicional usoCondicional;
	private Utilizacao utilizacao;
	private Representacao representacao;
	
	Nomes(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulos() {
		return titulos;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Preferido getPreferido() {
		return preferido;
	}

	public void setPreferido(Preferido preferido) {
		this.preferido = preferido;
	}

	public UsoCondicional getUsoCondicional() {
		return usoCondicional;
	}

	public void setUsoCondicional(UsoCondicional usoCondicional) {
		this.usoCondicional = usoCondicional;
	}

	public Utilizacao getUtilizacao() {
		return utilizacao;
	}

	public void setUtilizacao(Utilizacao utilizacao) {
		this.utilizacao = utilizacao;
	}

	public Representacao getRepresentacao() {
		return representacao;
	}

	public void setRepresentacao(Representacao representacao) {
		this.representacao = representacao;
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}
	
	
}
