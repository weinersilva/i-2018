package br.com.weinersilva.integracao.repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.json.JSONObject;

public class IndividuoRepository {

	private DBCollection collection;

    public void MongoIndividuoRepository(DBCollection collection) {
        this.collection = collection;
    }
    
    public void add(JSONObject individuo) {
        DBObject object = (DBObject) JSON.parse(individuo.toString());
        collection.insert(object);
    }

    public JSONObject findBy(String field, Object value) {
        BasicDBObject query = new BasicDBObject();
        query.put(field, value);
        DBObject found = collection.findOne(query);
        return new JSONObject(JSON.serialize(found));
    }
}
