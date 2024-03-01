package insert;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Author;
import entity_classes.Book;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_many_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b1= new Book(101,"book 1",1000,null);
		Book b2= new Book(102,"book 2",2999,null);
		Book b4= new Book(103,"book 3",4000,null);
		Book b3= new Book(104,"book 4",5000,null);
		
		List<Book> books=new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
	
		
		Author author=new Author(1,"shubham", books);
		b2.setAuthor(author);
		b3.setAuthor(author);
		b4.setAuthor(author);
		b1.setAuthor(author);
		
		et.begin();
		em.merge(b1);
		em.merge(b2);
		em.merge(b3);
		em.merge(b4);
		et.commit();
		
		
	}

}
