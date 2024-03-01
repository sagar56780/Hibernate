package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.PanCard1;
import entity_classes.Person1;

public class Remove1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		// for removing data first we have to find the data that we have have to delete 
		// suppuse we have to to delete data which has 101 id first we find this data
		PanCard1 pan1=em.find(PanCard1.class, 101);
		// then we have to terminate the relation b/w person table and pancad table
		Person1 person1=pan1.getPerson();
		person1.setPan1(null);
		
		et.begin();
		em.merge(person1);
		em.remove(pan1);
		et.commit();
		
		
		
		
		

	}
}
