package hql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HqlDemo2 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query querry=em.createQuery("select e.name,e.salary from Employee e");
		List<Object[]> li=querry.getResultList();
		for(Object obj[]:li)
		{
			System.out.println((obj[0]));
			System.out.println(obj[1]);
		}
	}
	

}
