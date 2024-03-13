package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Employee;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cache");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Employee e1=new Employee(1,"shubham",100);
	Employee e2=new Employee(2,"prashad",200);
	
	et.begin();
	em.persist(e1);
	em.persist(e2);
	et.commit();
	
	}
	
	
	

}
