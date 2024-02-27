package hql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate.demo.Employee;

public class HqlDemo4 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query query=em.createQuery("select e from Employee e where e.id=?1 or e.id=?2");
		
		query.setParameter(1, 1);
		query.setParameter(2, 3);
		List<Employee> li=query.getResultList();
		for(Employee e:li)
		{
			System.out.println(e);
		}
		
		
	}
}
