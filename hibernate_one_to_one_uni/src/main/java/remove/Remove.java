package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;

public class Remove {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		PanCard p=em.find(PanCard.class, 103);
		Person per=em.find(Person.class, 3);
		per.setPan(null);
		et.begin();
		em.remove(p);
				
		et.commit();
		
	}

}


