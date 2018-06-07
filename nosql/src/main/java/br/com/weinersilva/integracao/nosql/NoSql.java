package br.com.weinersilva.integracao.nosql;

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
		individuo.append("Título", "Sr.");
		individuo.append("Preferido", 1);
		individuo.append("Uso", 1);
		individuo.append("Data Inicial", "12/05/2018");
		individuo.append("Data Final", "31/12/2019");
		individuo.append("Utilização Alternativa", "R");
		individuo.append("Uso Condicional", 6);
		individuo.append("Mãe", "Meire Lucia Silva");
		individuo.append("Pai", "Erasmo Rosa da Silva");
		individuo.append("Situação Familiar", "companheiro(a) e filho(s)");
		individuo.append("Data de Nascimento", "29/12/1980");
		individuo.append("Acurácia", "Acurado");
		individuo.append("Raça", "branca");
		individuo.append("Sexo", "M");
		individuo.append("Nacionalidade", "brasileiro");
		individuo.append("Estado Nascimento", "Goiás");
		individuo.append("Município Nascimento", "Jataí");
		individuo.append("Pluridade Nascimento", "Único");
		individuo.append("Ordem Nascimento", "segundo");
		individuo.append("Comentário", "Fulano diferente de Ciclano 1234");
		individuo.append("Tipo Endereço", "Residencial");
		individuo.append("Data Inicial", "18/08/2010");
		individuo.append("Acurácia", "Acurado");
		individuo.append("Data Final", "04/06/2018");
		individuo.append("Acurácia", "Acurado");
		individuo.append("Logradouro", "Rua 206, 180");
		individuo.append("Bairro", "Vila Nova");
		individuo.append("CEP", "74640-100");
		individuo.append("Municipio", "Goiânia");
		individuo.append("Estado", "Goiás");
		individuo.append("País", "Brasil");
		individuo.append("Contato", "Telefone");
		individuo.append("Detalhe", "62 99999-1245");
		individuo.append("Preferência", "Horario Comercial");
		individuo.append("Utilização", "Pessoal");
		individuo.append("Contato", "Email");
		individuo.append("Detalhe", "weinersilva@gmail.com");
		individuo.append("Preferência", "Qualquer Hora");
		individuo.append("Utilização", "Pessoal");
		individuo.append("Vínculos Identificador", "1542");
		individuo.append("Relacionamento", "Conjuge");
		individuo.append("Data Inicial", "18/12/2009");
		individuo.append("Tipo Identificação", "Único dentro da organização");
		individuo.append("Designação", "4013713");
		individuo.append("Area", "Nacional");
		individuo.append("Telefone", "62 3526-1245");
		individuo.append("Data", "26/05/2010");
		individuo.append("Emissor", "SSP-GO");
		individuo.append("Tipo Certidão", "Casamento");
		individuo.append("Nome do Cartório", "1º cartorio de registro civil");
		individuo.append("Livro", "AB-12");
		individuo.append("Folha", 124);
		individuo.append("Termo", 1245632);
		individuo.append("Serie CTPS", "124623");
		individuo.append("Estado CTPS", "GO");
		individuo.append("Titulo Eleitor", "12448463415461321");
		individuo.append("Seção", "14");
		individuo.append("Zona", "45");
		
		individuos.insertOne(individuo);
	}

}
