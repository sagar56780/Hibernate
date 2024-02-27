package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_many_to_one_uni.Product;
import hibernate_many_to_one_uni.Review;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emp=Persistence.createEntityManagerFactory("many_to_one_uni");
		EntityManager em=emp.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		System.out.println(emp);
		Product p1=new Product(1,"samsung",80000);
		Product p2=new Product(2,"nokia",10000);
		Product p3=new Product(3,"iphone",1000000);
		Review r1=new Review(101,4.5,"good",p1);
		Review r2=new Review(102,4.0,"Excelent",p1);
		Review r3=new Review(103,4.2,"Poor",p2);
		et.begin();
		 em.persist(p1);
		 em.persist(p2);
		 em.persist(p3);
		 em.persist(r1);
		 em.persist(r2);
		 em.persist(r3);
		et.commit();
		 
		
		
		
	}
}
