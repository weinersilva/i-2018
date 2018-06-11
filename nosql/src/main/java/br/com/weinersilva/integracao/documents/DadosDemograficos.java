package br.com.weinersilva.integracao.documents;

import java.io.Serializable;
import java.util.Calendar;

import br.com.weinersilva.integracao.enums.Estado;
import br.com.weinersilva.integracao.enums.Nacionalidade;
import br.com.weinersilva.integracao.enums.NascimentoOrdem;
import br.com.weinersilva.integracao.enums.NascimentoPluralidade;
import br.com.weinersilva.integracao.enums.ObitoFonte;
import br.com.weinersilva.integracao.enums.Pais;
import br.com.weinersilva.integracao.enums.Raca;
import br.com.weinersilva.integracao.enums.Sexo;
import br.com.weinersilva.integracao.enums.SituacaoFamiliar;
/**
 * 
 * @author WeinerSilva
 * Classe que representa os dados demograficos do individuo
 */
public class DadosDemograficos  implements Serializable {

	private static final long serialVersionUID = 1L;
	//identificação do individuo
	private Individuo individuo;
	//data de nascimento do individuo
	private Calendar nascimento;
	//acuracia na informação da data de nascimento
	private String nascimentoAcuracia;
	//especifica se a data de nascimento informada é precisa do seguimento
	private int nascimentoSeguimento;
	//informa a pluridade de nascimento do individuo
	private NascimentoPluralidade nascimentoPluralidade;
	//informa ordem de nascimento do individuo
	private NascimentoOrdem nascimentoOrdem;
	//se houver obito informar data do obito
	private Calendar obito;
	//acuracia na informacao da data do obito
	private String obitoAcuracia;
	//fonte de registro do obito
	private ObitoFonte obitoFonte;
	//informa o sexo do individuo
	private Sexo sexo;
	//informa o nome da mãe do individuo
	private String mae;
	//informa o nome do pai do individuo
	private String pai;
	//informa a situação familiar do individuo
	private SituacaoFamiliar situacaoFamiliar;
	//informa a raça do individuo
	private Raca raca;
	//registra algum comentario
	private String comentario;
	//informa a nacionalidade do individuo
	private Nacionalidade nacionalidade;
	//informa o municipio do individuo
	private Municipio municipio;
	//informa o estado do individuo
	private Estado estado;
	//informa o pais do individuo
	private Pais pais;
	//informa o data de entrada do individuo se for estrangeiro
	private Calendar dataEntradaPais;
	
	DadosDemograficos(){
		
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public String getNascimentoAcuracia() {
		return nascimentoAcuracia;
	}

	public void setNascimentoAcuracia(String nascimentoAcuracia) {
		this.nascimentoAcuracia = nascimentoAcuracia;
	}

	public int getNascimentoSeguimento() {
		return nascimentoSeguimento;
	}

	public void setNascimentoSeguimento(int nascimentoSeguimento) {
		this.nascimentoSeguimento = nascimentoSeguimento;
	}

	public NascimentoPluralidade getNascimentoPluralidade() {
		return nascimentoPluralidade;
	}

	public void setNascimentoPluralidade(NascimentoPluralidade nascimentoPluralidade) {
		this.nascimentoPluralidade = nascimentoPluralidade;
	}

	public NascimentoOrdem getNascimentoOrdem() {
		return nascimentoOrdem;
	}

	public void setNascimentoOrdem(NascimentoOrdem nascimentoOrdem) {
		this.nascimentoOrdem = nascimentoOrdem;
	}

	public Calendar getObito() {
		return obito;
	}

	public void setObito(Calendar obito) {
		this.obito = obito;
	}

	public String getObitoAcuracia() {
		return obitoAcuracia;
	}

	public void setObitoAcuracia(String obitoAcuracia) {
		this.obitoAcuracia = obitoAcuracia;
	}

	public ObitoFonte getObitoFonte() {
		return obitoFonte;
	}

	public void setObitoFonte(ObitoFonte obitoFonte) {
		this.obitoFonte = obitoFonte;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public SituacaoFamiliar getSituacaoFamiliar() {
		return situacaoFamiliar;
	}

	public void setSituacaoFamiliar(SituacaoFamiliar situacaoFamiliar) {
		this.situacaoFamiliar = situacaoFamiliar;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Calendar getDataEntradaPais() {
		return dataEntradaPais;
	}

	public void setDataEntradaPais(Calendar dataEntradaPais) {
		this.dataEntradaPais = dataEntradaPais;
	}
	
	
}
