package fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Employee;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cache");
		EntityManager em=emf.createEntityManager();
		EntityManager em2=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee e1=em.find(Employee.class,1);
		System.out.println(e1);
		Employee e2=em.find(Employee.class, 1);//querry only execute once 
		System.out.println(e2);
		
		Employee e3=em2.find(Employee.class, 1);//querry executes again because of ne Entity manager object
		System.out.println(e3);
		
		
		
		
	}

}
