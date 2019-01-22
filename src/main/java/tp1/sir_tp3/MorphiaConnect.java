package tp1.sir_tp3;

import java.net.UnknownHostException;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MorphiaConnect {

	public static void main( String[] args ) throws UnknownHostException
	{
	    Morphia morphia = new Morphia();    
	    MongoClient mongo = new MongoClient();
	    morphia.map(Person.class).map(Address.class);
	    Datastore ds = morphia.createDatastore(mongo, "my_database");
	    createTintin(ds);
	    createMilou(ds);
	    findPersons(ds);
	    
	}
	
	public static void createTintin(Datastore ds) {
		Person p = new Person();
	    p.setName("Tintin");

	    Address address = new Address();
	    address.setStreet("123 Some street");
	    address.setCity("Some city");
	    address.setPostCode("123 456");
	    address.setCountry("Belgium");
	    //set address
	    p.setAdress(address);
	    // Save the POJO
	    ds.save(p);
	}
	
	public static void createMilou(Datastore ds) {
		Person p = new Person();
	    p.setName("Milou");

	    Address address = new Address();
	    address.setStreet("312 Coincoin street");
	    address.setCity("Old doge city");
	    address.setPostCode("645 864");
	    address.setCountry("France");
	    //set address
	    p.setAdress(address);
	    // Save the POJO
	    ds.save(p);
	}
	

	public static void findPersons(Datastore ds) {
	    for (Person e : ds.find(Person.class))
	         System.out.println(e.getName());
	}

}
