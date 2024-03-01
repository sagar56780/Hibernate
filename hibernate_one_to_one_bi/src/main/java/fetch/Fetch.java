package fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;
import insert.Insert;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class, 1);
		PanCard pan=p.getPan();
		System.out.println(p);
		System.out.println(pan);
		PanCard pan1=em.find(PanCard.class,102);
		Person p1=pan1.getPerson();
		System.out.println(pan1);
		System.out.println(p1);
		
		
	
	}

}
