package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Student;

public class RemoveStudent {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many_bi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student student =em.find(Student.class, 1);
	
	

}
