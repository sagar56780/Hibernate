package hql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

import hibernate.demo.Employee;

public class HqlDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	    Query querry = em.createQuery("select emp from Employee emp");
	    List<Employee> li=querry.getResultList();
	    for(Employee e: li)
	    {
	    	System.out.println(e);
	    }
	    
	}
}
