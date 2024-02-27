package RemoveDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.demo.Employee;

public class RemoveDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee em1= em.find(Employee.class, 2);
		et.begin();
			em.remove(em1);
		
		
		et.commit();
		
		
		
	}

}
