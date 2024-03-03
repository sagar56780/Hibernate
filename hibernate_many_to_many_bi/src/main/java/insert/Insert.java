package insert;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Student;
import entity_classes.Subject;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student student1=new Student(1,"shubham",18,null);
		Student student2=new Student(2,"prashad",22,null);
		
		Subject subject1=new Subject(101,"physics",null);
		Subject subject2=new Subject(102,"chemistry",null);
		Subject subject3=new Subject(103,"maths",null);
		Subject subject4=new Subject(104,"biology",null);
		
		List<Subject> subjects=new ArrayList<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject4);
		
		List<Subject> subjects2=new ArrayList<>();
		subjects2.add(subject1);
		subjects2.add(subject2);
		subjects2.add(subject3);
		
		
		student1.setSubjects(subjects2);
		student1.setSubjects(subjects);
		
		
		List<Student> students=new ArrayList<>();
		students.add(student1);
		students.add(student2);
		
		
		et.begin();
		em.persist(subject1);
		em.persist(subject2);
		em.persist(subject3);
		em.persist(subject4);
		em.persist(student1);
		em.persist(student2);
		et.commit();
		

		
		
		
		
		
	}

}

