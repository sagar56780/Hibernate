package entityclasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject{
	@Id
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + "]";
	}
	public Subject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Subject() {
		super();
	}
	
	
}
