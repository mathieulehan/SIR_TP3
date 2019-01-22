package tp1.sir_tp3;

import org.bson.types.ObjectId;

public class Person {

	private ObjectId id;
	private String name;
	private Address adress;
	
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
