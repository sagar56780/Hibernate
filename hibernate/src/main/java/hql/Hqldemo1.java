package hql;


import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import hibernate.demo.Employee;

public class Hqldemo1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee e=new Employee();
		
		javax.persistence.Query querry=em.createQuery("select e.name from Employee e");
		List<String> li=querry.getResultList();
		for(String s:li)
		{
			System.out.println(s);
		}
		
	}

}
