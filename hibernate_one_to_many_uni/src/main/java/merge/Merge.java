package merge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import book.java.Author;
import book.java.Book;

public class Merge {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_many_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b=new Book(105,"kala jadu ",5000);
		Book b1=new Book(104,"safed jadu",1000);
		Author a=em.find(Author.class, 1);
		
		a.getBooks().add(b);
		a.getBooks().add(b1);
		et.begin();
		em.persist(b1);
		em.persist(b);
		em.merge(a);
		et.commit();
	}
	

}
