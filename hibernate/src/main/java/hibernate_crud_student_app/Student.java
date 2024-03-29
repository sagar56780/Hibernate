package hibernate_crud_student_app;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private int id;
	public Student()
	{
		
	}
	public Student(int id, String name, int age, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	private String name;
	private int age;
	private float percentage;
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
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, percentage);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(percentage) == Float.floatToIntBits(other.percentage);
	}
	
	
}
