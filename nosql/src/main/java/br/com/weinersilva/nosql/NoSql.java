package br.com.weinersilva.nosql;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class NoSql {

	private static MongoClient mongoIndividuo;

	public static void main(String[] args) {
		String uri = "mongodb://admin:admin@cluster0-shard-00-00-swoap.mongodb.net:27017,cluster0-shard-00-01-swoap.mongodb.net:27017,cluster0-shard-00-02-swoap.mongodb.net:27017/admin?replicaSet=Cluster0-shard-0&ssl=true";
		
		MongoClientURI individuoURI = new MongoClientURI(uri);
		mongoIndividuo = new MongoClient(individuoURI);
		
		MongoDatabase mongoDatabase = mongoIndividuo.getDatabase("nosql");
		
		MongoCollection<Document> individuos = mongoDatabase.getCollection("individuos"); 
		
		Document individuo = new Document("Nome", "Weiner");
		individuo.append("Sobrenome", "Silva");
		individuo.append("T�tulo", "Sr.");
		individuo.append("Preferido", 1);
		individuo.append("Uso", 1);
		individuo.append("Data Inicial", "12/05/2018");
		individuo.append("Data Final", "31/12/2019");
		individuo.append("Utiliza��o Alternativa", "R");
		individuo.append("Uso Condicional", 6);
		individuo.append("M�e", "Meire Lucia Silva");
		individuo.append("Pai", "Erasmo Rosa da Silva");
		individuo.append("Situa��o Familiar", "companheiro(a) e filho(s)");
		individuo.append("Data de Nascimento", "29/12/1980");
		individuo.append("Acur�cia", "Acurado");
		individuo.append("Ra�a", "branca");
		individuo.append("Sexo", "M");
		individuo.append("Nacionalidade", "brasileiro");
		individuo.append("Estado Nascimento", "Goi�s");
		individuo.append("Munic�pio Nascimento", "Jata�");
		individuo.append("Pluridade Nascimento", "�nico");
		individuo.append("Ordem Nascimento", "segundo");
		individuo.append("Coment�rio", "Fulano diferente de Ciclano 1234");
		individuo.append("Tipo Endere�o", "Residencial");
		individuo.append("Data Inicial", "18/08/2010");
		individuo.append("Acur�cia", "Acurado");
		individuo.append("Data Final", "04/06/2018");
		individuo.append("Acur�cia", "Acurado");
		individuo.append("Logradouro", "Rua 206, 180");
		individuo.append("Bairro", "Vila Nova");
		individuo.append("CEP", "74640-100");
		individuo.append("Municipio", "Goi�nia");
		individuo.append("Estado", "Goi�s");
		individuo.append("Pa�s", "Brasil");
		individuo.append("Contato", "Telefone");
		individuo.append("Detalhe", "62 99999-1245");
		individuo.append("Prefer�ncia", "Horario Comercial");
		individuo.append("Utiliza��o", "Pessoal");
		individuo.append("Contato", "Email");
		individuo.append("Detalhe", "weinersilva@gmail.com");
		individuo.append("Prefer�ncia", "Qualquer Hora");
		individuo.append("Utiliza��o", "Pessoal");
		individuo.append("V�nculos Identificador", "1542");
		individuo.append("Relacionamento", "Conjuge");
		individuo.append("Data Inicial", "18/12/2009");
		individuo.append("Tipo Identifica��o", "�nico dentro da organiza��o");
		individuo.append("Designa��o", "4013713");
		individuo.append("Area", "Nacional");
		individuo.append("Telefone", "62 3526-1245");
		individuo.append("Data", "26/05/2010");
		individuo.append("Emissor", "SSP-GO");
		individuo.append("Tipo Certid�o", "Casamento");
		individuo.append("Nome do Cart�rio", "1� cartorio de registro civil");
		individuo.append("Livro", "AB-12");
		individuo.append("Folha", 124);
		individuo.append("Termo", 1245632);
		individuo.append("Serie CTPS", "124623");
		individuo.append("Estado CTPS", "GO");
		individuo.append("Titulo Eleitor", "12448463415461321");
		individuo.append("Se��o", "14");
		individuo.append("Zona", "45");
		
		individuos.insertOne(individuo);
	}

}
