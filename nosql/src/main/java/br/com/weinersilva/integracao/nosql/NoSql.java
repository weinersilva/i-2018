package br.com.weinersilva.integracao.nosql;

import java.util.Date;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.sun.jmx.snmp.Timestamp;

import br.com.weinersilva.integracao.documents.CTPS;
import br.com.weinersilva.integracao.documents.Certidao;
import br.com.weinersilva.integracao.documents.Identificador;
import br.com.weinersilva.integracao.documents.Individuo;
import br.com.weinersilva.integracao.documents.Nomes;
import br.com.weinersilva.integracao.documents.TituloEleitoral;
import br.com.weinersilva.integracao.documents.Utilizacao;
import br.com.weinersilva.integracao.enums.Estado;
import br.com.weinersilva.integracao.enums.IdentificadorArea;
import br.com.weinersilva.integracao.enums.IdentificadorTipo;
import br.com.weinersilva.integracao.enums.Preferido;
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
		nome.setRepresentacao(representacao);
			
		individuos.insertOne(individuo);
	}

}
