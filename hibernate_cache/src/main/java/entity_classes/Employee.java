package entity_classes;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Cacheable
@Entity
public class Employee {
	@Id
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
			

}
