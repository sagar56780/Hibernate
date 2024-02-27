package hql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

public class HqlDemo3 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query queryy=em.createQuery("select e from Employee e where e.id=3");
		List<String> data=queryy.getResultList();
		System.out.println(data);
		System.out.println("=====================");
		Query querry2=em.createQuery("select e from Employee e where e.id=1 or e.id=3");
		List<String> da=querry2.getResultList();
		System.out.println(da);
		
		
	}

}
