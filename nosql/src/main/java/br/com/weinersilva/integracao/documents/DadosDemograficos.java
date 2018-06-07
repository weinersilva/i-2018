package br.com.weinersilva.integracao.documents;

import java.util.Calendar;

import br.com.weinersilva.integracao.enuns.Estado;
import br.com.weinersilva.integracao.enuns.Nacionalidade;
import br.com.weinersilva.integracao.enuns.NascimentoOrdem;
import br.com.weinersilva.integracao.enuns.NascimentoPluralidade;
import br.com.weinersilva.integracao.enuns.NascimentoSeguimento;
import br.com.weinersilva.integracao.enuns.ObitoFonte;
import br.com.weinersilva.integracao.enuns.Pais;
import br.com.weinersilva.integracao.enuns.Raca;
import br.com.weinersilva.integracao.enuns.Sexo;
import br.com.weinersilva.integracao.enuns.SituacaoFamiliar;

public class DadosDemograficos {

	private Individuo individuo;
	private Calendar nascimento;
	private String nascimentoAcuracia;
	private NascimentoSeguimento nascimentoSeguimento;
	private NascimentoPluralidade nascimentoPluralidade;
	private NascimentoOrdem nascimentoOrdem;
	private Calendar obito;
	private String obitoAcuracia;
	private ObitoFonte obitoFonte;
	private Sexo sexo;
	private String mae;
	private String pai;
	private SituacaoFamiliar situacaoFamiliar;
	private Raca raca;
	private String comentario;
	private Nacionalidade nacionalidade;
	private Municipio municipio;
	private Estado estado;
	private Pais pais;
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

	public NascimentoSeguimento getNascimentoSeguimento() {
		return nascimentoSeguimento;
	}

	public void setNascimentoSeguimento(NascimentoSeguimento nascimentoSeguimento) {
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
