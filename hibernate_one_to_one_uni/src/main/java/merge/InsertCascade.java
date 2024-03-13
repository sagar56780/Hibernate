package merge;

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
	Person p=em.find(Person.class, 3);
	PanCard pan=new PanCard(103, "banglore", "06/03/23");
	p.setPan(pan);
	et.begin();
	em.merge(p);
	et.commit();
}
}
