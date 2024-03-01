package fetch;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.PanCard1;
import entity_classes.Person1;


public class Fetch1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		PanCard1 pan1=em.find(PanCard1.class, 101);
		Person1 per1=pan1.getPerson();
		System.out.println(per1);
		
		
	}

}
