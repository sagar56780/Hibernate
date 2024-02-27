package school;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
	private int roll;
	@OneToOne
	private StudentId si;
	
	public Student()
	{
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", roll=" + roll + ", si=" + si + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public StudentId getSi() {
		return si;
	}
	public void setSi(StudentId si) {
		this.si = si;
	}
	public Student(int id, String name, int age, int roll, StudentId si) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.roll = roll;
		this.si = si;
	}

}
