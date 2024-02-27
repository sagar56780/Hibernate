package remove;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entityclasses.Student;
import entityclasses.Subject;

public class Remove {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		// removing subject 2 which is chemistry 
		Subject s=em.find(Subject.class, 103);
		Query query=em.createQuery("select s from Student s");
		List<Student> students=query.getResultList();
		
		for(Student stu:students)
		{
			
			Iterator<Subject> its=stu.getSubject().iterator();
			
			while(its.hasNext())
			{
				Subject temp=its.next();
				if(temp.getId()==103)
				{
					its.remove();
				}
			}
		
			
		}
		et.begin();
	    for(Student s1:students)
	    {
	    	em.merge(s1);
	    	
	    }
	    em.remove(s);
		et.commit();
		
		
		
		
		
		
	}

}
