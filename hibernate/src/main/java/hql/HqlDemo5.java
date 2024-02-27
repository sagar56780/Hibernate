package hql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate.demo.Employee;

public class HqlDemo5 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query query=em.createQuery("select e from Employee e where e.id=:id1 or e.name=:name");
		query.setParameter("id1", 1);
		query.setParameter("name","ganesh");
		
		List<Employee> li=query.getResultList();
		for(Employee e: li)
		{
			System.out.println(e);
		}
	}

}
