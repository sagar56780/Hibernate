package create_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.demo.Employee;

public class CreateDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emq= new Employee(1,"shubham",20000);
		Employee em2=new Employee(2,"kiran",300000);
		Employee em3=new Employee(3,"ganesh",300233);
		et.begin();
		em.persist(emq);
		em.persist(em2);
		em.persist(em3);
		et.commit();
		System.out.println("data Inserted");
		
	}

}
