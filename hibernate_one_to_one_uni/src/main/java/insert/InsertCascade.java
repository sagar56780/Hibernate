package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;

public class InsertCascade {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		PanCard pan=new PanCard(102,"meerut","1 jan 2020");
		Person per=new Person(2,"shivani",1111,pan);
		et.begin();
		em.persist(per);
		et.commit();
		
	}

}
