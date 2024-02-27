package remove;


import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import book.java.*;

public class Remove {
    public static void main(String[] args) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_many_uni");
    	EntityManager em=emf.createEntityManager();
    	EntityTransaction et=em.getTransaction();
    	Author a1=em.find(Author.class, 1);
    	List<Book> books=a1.getBooks();
    	
    	Iterator<Book> itb=books.iterator();
    	Book b=new Book();
    	b=null;
    	while(itb.hasNext())
    	{
    		Book b1 =itb.next();
    		if(b1.getId()==102)
    		{	b=b1;
    			itb.remove();
    		}
    		
    		
    	}
    	et.begin();
    	em.merge(a1);
    	em.remove(b);
    	
    	et.commit();
    	
    	
    	
    	
	}
}
