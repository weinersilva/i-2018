package br.com.weinersilva.integracao.nosql;

import java.util.Date;
import java.util.Map;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import br.com.weinersilva.integracao.documents.CTPS;
import br.com.weinersilva.integracao.documents.Certidao;
import br.com.weinersilva.integracao.documents.Comunicacao;
import br.com.weinersilva.integracao.documents.DadosDemograficos;
import br.com.weinersilva.integracao.documents.Endereco;
import br.com.weinersilva.integracao.documents.Identificador;
import br.com.weinersilva.integracao.documents.Individuo;
import br.com.weinersilva.integracao.documents.Municipio;
import br.com.weinersilva.integracao.documents.Nomes;
import br.com.weinersilva.integracao.documents.TituloEleitoral;
import br.com.weinersilva.integracao.documents.Utilizacao;
import br.com.weinersilva.integracao.enums.ComunicacaoMeio;
import br.com.weinersilva.integracao.enums.ComunicacaoPreferencia;
import br.com.weinersilva.integracao.enums.ComunicacaoUso;
import br.com.weinersilva.integracao.enums.EnderecoTipo;
import br.com.weinersilva.integracao.enums.Estado;
import br.com.weinersilva.integracao.enums.IdentificadorArea;
import br.com.weinersilva.integracao.enums.IdentificadorTipo;
import br.com.weinersilva.integracao.enums.Nacionalidade;
import br.com.weinersilva.integracao.enums.NascimentoOrdem;
import br.com.weinersilva.integracao.enums.NascimentoPluralidade;
import br.com.weinersilva.integracao.enums.Pais;
import br.com.weinersilva.integracao.enums.Preferido;
import br.com.weinersilva.integracao.enums.Raca;
import br.com.weinersilva.integracao.enums.Sexo;
import br.com.weinersilva.integracao.enums.SituacaoFamiliar;
import br.com.weinersilva.integracao.enums.Uso;
import br.com.weinersilva.integracao.enums.UsoCondicional;


public class NoSql {

	private static MongoClient mongoIndividuo;

	public static void main(String[] args) {
		String uri = "mongodb://admin:admin@cluster0-shard-00-00-swoap.mongodb.net:27017,cluster0-shard-00-01-swoap.mongodb.net:27017,cluster0-shard-00-02-swoap.mongodb.net:27017/admin?replicaSet=Cluster0-shard-0&ssl=true";
		
		MongoClientURI individuoURI = new MongoClientURI(uri);
		mongoIndividuo = new MongoClient(individuoURI);
		
		MongoDatabase mongoDatabase = mongoIndividuo.getDatabase("pacientes");
		
		MongoCollection<Document> individuos = mongoDatabase.getCollection("individuo"); 
		
		Individuo individuo = new Individuo();
		
		Certidao certidao = new Certidao();
		certidao.setTipo("Nascimento");
		certidao.setCartorio("1º CRC de Goiânia");
		certidao.setLivro("av-12");
		certidao.setFolha("233");
		certidao.setTermo("124523");
		certidao.setIndividuo(individuo);
		
		CTPS ctps = new CTPS();
		ctps.setSerie("23423");
		ctps.setEstado(Estado.GO);
		ctps.setIndividuo(individuo);
		
		TituloEleitoral tituloEleitoral = new TituloEleitoral();
		tituloEleitoral.setIndividuo(individuo);
		tituloEleitoral.setSecao("145");
		tituloEleitoral.setZona("65");
		
		Identificador ident = new Identificador();
		ident.setIndividuo(individuo);
		ident.setIdentificadorTipo(IdentificadorTipo.ÚNICO);
		ident.setDesignacao("411245");
		ident.setIdentificadorArea(IdentificadorArea.NACIONAL);
		ident.setEmissor("SSP-GO");
		ident.setDataEmissao(new Date(2018/05/26));
		ident.setCertidao(certidao);
		ident.setCtps(ctps);
		ident.setTituloEleitoral(tituloEleitoral);
		
		Utilizacao utilizacao = new Utilizacao();
		utilizacao.setIdentificador(ident);
		utilizacao.setDatainicial(new Date(2008/12/24));
		utilizacao.setUso(Uso.NOMESOLTEIRO);
		
		Nomes nome = new Nomes();
		nome.setIndividuo(individuo);
		nome.setNome("Beltrano");
		nome.setSobrenome("Aparecido");
		nome.setPreferido(Preferido.PREFERIDO);
		nome.setUsoCondicional(UsoCondicional.TEMPORARIO);
		nome.setUtilizacao(utilizacao);
		nome.setUtilizacao(utilizacao);
		
		DadosDemograficos dados = new DadosDemograficos();
		dados.setIndividuo(individuo);
		dados.setMae("Ciclana de Tal");
		dados.setPai("Fulano Aparecido");
		dados.setSituacaoFamiliar(SituacaoFamiliar.COMANHEIROSEMFILHO);
		dados.setNascimento(new Date(1980/02/24));
		dados.setNascimentoAcuracia("A,A,A");
		dados.setRaca(Raca.BRANCA);
		dados.setSexo(Sexo.MASCULINO);
		dados.setNacionalidade(Nacionalidade.BRASILEIRA);
		dados.setEstado(Estado.GO);
		dados.setMunicipio(new Municipio(52L,"Goiânia", Estado.GO));
		dados.setNascimentoPluralidade(NascimentoPluralidade.ÚNICO);
		dados.setNascimentoOrdem(NascimentoOrdem.ÚNICO);
		dados.setNascimentoSeguimento(1);
		dados.setComentario("Paciente diferente do Fulano id: 121452");
		
		Endereco endereco = new Endereco();
		endereco.setIndividuo(individuo);
		endereco.setEnderecoTipo(EnderecoTipo.RESIDENCIAL);
		endereco.setDataInicial(new Date(2010/05/17));
		endereco.setDataInicialAcuracia("A,A,A");
		endereco.setPais(Pais.BRASIL);
		endereco.setEstado(Estado.GO);
		endereco.setMunicipio(new Municipio(52L,"Goiânia", Estado.GO));
		endereco.setCep("74642-025");
		endereco.setBairro("Centro");
		endereco.setDescricao("Rua 20, 289, casa 3");
		
		Comunicacao comunicacao = new Comunicacao();
		comunicacao.setComunicacaoMeio(ComunicacaoMeio.CELULAR);
		comunicacao.setDetalhe("(62) 99999-9999");
		comunicacao.setComunicacaoPreferencia(ComunicacaoPreferencia.DURANTEODIA);
		comunicacao.setComunicacaoUso(ComunicacaoUso.PESSOAL);

		Comunicacao comunicacao2 = new Comunicacao();
		comunicacao2.setComunicacaoMeio(ComunicacaoMeio.EMAIL);
		comunicacao2.setDetalhe("beltrano@cia.com");
		comunicacao2.setComunicacaoPreferencia(ComunicacaoPreferencia.QUALQUERHORA);
		comunicacao2.setComunicacaoUso(ComunicacaoUso.PESSOAL);
		
		individuo.setIdentificador(ident);
		individuo.setNomes(nome);
		individuo.setDadosDemograficos(dados);
		individuo.setEndereco(endereco);
		individuo.setComunicacao(comunicacao);
		individuo.setComunicacao(comunicacao2);
		
		@SuppressWarnings("unchecked")
		Document individuo1 = new Document((Map<String, Object>) individuo);
		
		individuos.insertOne(individuo1);
	}

}
