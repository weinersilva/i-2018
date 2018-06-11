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
		
		MongoDatabase mongoDatabase = mongoIndividuo.getDatabase("pacientes");
		
		MongoCollection<Document> individuos = mongoDatabase.getCollection("individuo"); 
		
		
		
	
		Document individuo = new Document();
		
		individuos.insertOne(individuo);
	}

}
