package br.com.weinersilva.integracao.documents;

import java.io.Serializable;

import br.com.weinersilva.integracao.enuns.Preferido;
import br.com.weinersilva.integracao.enuns.UsoCondicional;
import sun.nio.cs.Surrogate;

/**
 * 
 * @author WeinerSilva
 * classe responsavel por registrar nomes dos individuos
 */
public class Nomes  implements Serializable {

	private static final long serialVersionUID = 1L;
	//identificação do nome
	private Surrogate key;
	//instancia um individuo
	private Individuo individuo;
	//registra titulos se o individuo tiver
	private String titulos;
	//nome do individuo
	private String nome;
	//sobrenomes do individuo
	private String sobrenome;
	//registro se o nome é o preferido ou não
	private Preferido preferido;
	//indicador de condições especificas ou regras do nome do individuo
	private UsoCondicional usoCondicional;
	//classificação que permite a diferenciação entre os usos dos nomes registrados do individuo
	private Utilizacao utilizacao;
	//identifica quando o nome do individuo é baseado em fonte ou caractere alternativo(outra lingua por exemplo)
	private String representacao;
	
	Nomes(){
		
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

	public String getRepresentacao() {
		return representacao;
	}

	public void setRepresentacao(String representacao) {
		this.representacao = representacao;
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}

	public Surrogate getKey() {
		return key;
	}

	public void setKey(Surrogate key) {
		this.key = key;
	}
	
	
}
