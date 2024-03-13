package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Student;

public class InsertStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("auto_increment");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student("sagar",89);
		Student s2=new Student("ritiK",99);
		Student s3=new Student("ganesh",76);
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
	}

}
