package br.com.weinersilva.integracao.documents;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import br.com.weinersilva.integracao.enums.Uso;
/**
 * 
 * @author WeinerSilva
 * Utiliza��o permite a diferencia��o entre os usos dos nomes registrados para o indiv�duo,
 * � composta por uma especifica��o de onde e datas inicial e final que estabelece o uso do nome.
 *
 */
public class Utilizacao  implements Serializable {

	private static final long serialVersionUID = 1L;
	//istancia do nome
	private Nomes nome;
	//grupo de uso
	private Uso uso;
	//identificador que est� vinculado ao nome
	private Identificador identificador;
	//data inicial da utiliza��o
	private Date datainicial;
	//data final da utiliza��o
	private Calendar datafinal;
	public Nomes getNome() {
		return nome;
	}
	public void setNome(Nomes nome) {
		this.nome = nome;
	}
	public Uso getUso() {
		return uso;
	}
	public void setUso(Uso uso) {
		this.uso = uso;
	}
	public Identificador getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}
	public Date getDatainicial() {
		return datainicial;
	}
	public void setDatainicial(Date date) {
		this.datainicial = date;
	}
	public Calendar getDatafinal() {
		return datafinal;
	}
	public void setDatafinal(Calendar datafinal) {
		this.datafinal = datafinal;
	}
	
	public Utilizacao(){
		
	}
	@Override
	public String toString() {
		return "Utilizacao [nome=" + nome + ", uso=" + uso + ", identificador=" + identificador + ", datainicial="
				+ datainicial + ", datafinal=" + datafinal + "]";
	}
	
	
}
