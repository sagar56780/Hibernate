package insert;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.boot.MappingNotFoundException;

import entityclasses.Student;
import entityclasses.Subject;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		Subject s1=new Subject(101,"physics");
		Subject s2=new Subject(102,"chemistry");
		Subject s3=new Subject(103,"maths");
		Subject s4=new Subject(104,"bio");
		List<Subject> subjects=new ArrayList<>();
		subjects.add(s1);
		subjects.add(s2);
		subjects.add(s3);
		List<Subject> subjects2=new ArrayList<>();
		subjects2.add(s1);
		subjects2.add(s3);
		subjects2.add(s4);
		Student student1=new Student(1,"shubham",18,subjects);
		Student student2=new Student(2,"sumit",15,subjects2);
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(student2);
		em.persist(student1);
		et.commit();
		
	
		
		
	}

}
