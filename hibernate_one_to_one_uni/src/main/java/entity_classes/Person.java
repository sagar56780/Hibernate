package entity_classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private long phone;
	@OneToOne
	@Cascade(CascadeType.PERSIST.MERGE.REMOVE)
	private  PanCard pan;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public PanCard getPan() {
		return pan;
	}
	public void setPan(PanCard pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", pan=" + pan + "]";
	}
	public Person(int id, String name, long phone, PanCard pan) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.pan = pan;
	}
	public Person() {
		super();
	}
	
	
	

}
