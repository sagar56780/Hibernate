package update_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.demo.Employee;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emq= new Employee(1,"saurabh",20000);
	
		et.begin();
		em.merge(emq);
		
		
		et.commit();
	}

	

}
