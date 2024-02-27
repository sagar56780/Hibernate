package insert;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import book.java.Author;
import book.java.Book;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_many_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b1=new Book(101,"book1",1000);
		Book b2=new Book(102,"book2",2000);
		Book b3=new Book(103,"book3",2320);
		List<Book> booklist1=new ArrayList<Book>();
		booklist1.add(b3);
		booklist1.add(b2);
		List<Book> booklist2=new ArrayList<Book>();
		booklist2.add(b1);
		
		
		Author a1=new Author(1,"Shubhame",booklist1);
		Author a2=new Author(2,"prashad",booklist2);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
		
		
	}

}
