package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;



public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person person1=new Person(1,"shubham",11111);
		PanCard pan1=new PanCard(101,"maharashtra","01/01/2000");
				person1.setPan(pan1);
				pan1.setPerson(person1);
				Person person2=new Person(2,"vishal",22222);
				PanCard pan2=new PanCard(102,"delhi","01/05/1999");
						person2.setPan(pan2);
						pan2.setPerson(person2);
						Person person3=new Person(3,"prasghad",3333);
						PanCard pan3=new PanCard(103,"maharashtra","02/05/2005");
								person3.setPan(pan3);
								pan3.setPerson(person3);
		et.begin();
//		em.persist(person1);
//		em.persist(person2);
		em.persist(person3);
		em.persist(pan3);
//		em.persist(pan2);
//		em.persist(pan1);
		et.commit();
		
		
		
		
		
	}
}
