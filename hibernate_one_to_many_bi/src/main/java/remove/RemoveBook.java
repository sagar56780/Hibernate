package remove;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Author;
import entity_classes.Book;

public class RemoveBook {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_many_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Book book =em.find(Book.class, 102);
		Author author=book.getAuthor();
		List<Book> books=author.getBooks();
		Iterator<Book> itr=books.iterator();
		while(itr.hasNext())
		{
			Book tempbook=itr.next();
			if(tempbook.getId()==102)
			{
				itr.remove();
				break;
				
			}
		}
		
		author.setBooks(books);
		
		et.begin();
		em.persist(author);
		em.remove(book);
		et.commit();
		
		
		
		
	}

}
