package entity_classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToMany
	@JoinColumn
	List<Subject> subjects;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int id, String name, int age, List<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.subjects = subjects;
	}
	public Student() {
		super();
	}
	
	

}
