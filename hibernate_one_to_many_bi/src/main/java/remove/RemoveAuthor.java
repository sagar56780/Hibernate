package remove;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Author;
import entity_classes.Book;

public class RemoveAuthor {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_many_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Author author=em.find(Author.class, 1);
		List<Book> books =author.getBooks();
		for(Book b:books)
		{
			b.setAuthor(null);
		}
		et.begin();
		for(Book b:books)
		{
			em.merge(b);
		}
		em.remove(author);
		
		et.commit();
	}
	

}
