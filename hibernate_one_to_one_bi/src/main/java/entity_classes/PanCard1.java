package entity_classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard1 {
	@Id
	private int id;
	private String address;
	private String dob;
	@OneToOne(mappedBy= "pan1")
	private Person1 person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Person1 getPerson() {
		return person;
	}
	public void setPerson(Person1 person) {
		this.person = person;
	}
	public PanCard1(int id, String address, String dob, Person1 person) {
		super();
		this.id = id;
		this.address = address;
		this.dob = dob;
		this.person = person;
	}
	public PanCard1() {
		super();
	}
	@Override
	public String toString() {
		return "PanCard1 [id=" + id + ", address=" + address + ", dob=" + dob + "]";
	}

	

}
