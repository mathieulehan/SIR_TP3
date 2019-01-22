package tp1.sir_tp3;

import org.bson.types.ObjectId;

/**
 * Hello world!
 *
 */
public class Article 
{
	private ObjectId id;
	private String name;
	private int stars;
	
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
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
}
