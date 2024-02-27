package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;



public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		PanCard pan=new PanCard(101,"Delhi","1 jan 2020");
		Person per=new Person(1,"shubham",1111,pan);
		
		PanCard pan2=new PanCard(102,"lucknow","1 feb 2012");
		Person per2 =new Person(2,"sumit",2222,pan2);
		
		PanCard pan3=new PanCard(103,"karnataka","10 feb 1990");
		Person per3=new Person(3,"ganesh",3333,null);
		
		et.begin();
		em.persist(pan);
		em.persist(pan2);
		em.persist(pan3);
		em.persist(per3);
		em.persist(per2);
		em.persist(per);
		
		
		
		
		et.commit();
		
		
		
		
	}
}
