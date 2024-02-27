package fetch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import entityclasses.Student;
import entityclasses.Subject;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		// fetching the subject which is associated with sutudent id 2
		Student student=em.find(Student.class, 2);
		List<Subject> subjects =student.getSubject();
		for(Subject s:subjects)
		{
			System.out.println(s);
		}
	
		
		
	}
}
