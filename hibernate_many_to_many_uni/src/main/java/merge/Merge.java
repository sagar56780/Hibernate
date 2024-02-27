package merge;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entityclasses.Student;
import entityclasses.Subject;

public class Merge {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Subject s=em.find(Subject.class, 102);
		Student student=em.find(Student.class,2);
		List<Subject> sublist=student.getSubject();
		sublist.add(s);
		et.begin();
		em.merge(student);
		et.commit();
		
	}

}
