package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import book.java.Author;

public class RemoveAuthor {
	
	
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_many_uni");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Author a=em.find(Author.class, 1);	
	et.begin();
	em.remove(a);
	et.commit();
	}
	
}
