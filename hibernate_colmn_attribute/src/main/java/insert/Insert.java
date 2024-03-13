package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_class.Employee;

public class Insert {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("column_attribute");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emp=new Employee();
		emp.setId(45);
		emp.setName("ankit");
		emp.setCompany_name("qspider");
	    emp.setAge(18);
	    emp.setPhone(2341267l);
	    Employee emp2=new Employee();
		emp2.setId(46);
		emp2.setName("Sagar");
		emp2.setCompany_name("j-spider");
	    emp2.setAge(45);
	    emp2.setPhone(2341267l);
		
		et.begin();
//		em.persist(emp);
		em.persist(emp2);
		et.commit();
	
		
		
		
	}

}

