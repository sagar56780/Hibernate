package entity_classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	private int id;
	private String name;
	private int coast;
	@ManyToOne
	private Author author;
	public Book(int id, String name, int coast, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.coast = coast;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", coast=" + coast + "]";
	}
	public Book() {
	
	}
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
	public int getCoast(){
		return coast;
	}
	public void setCoast(int coast) {
		this.coast = coast;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	

	
	

}
