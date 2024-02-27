package schoolAdmin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import school.Student;
import school.StudentId;

public class Admin {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("school");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		StudentId si=em.find(StudentId.class,123543);
		Student s=em.find(Student.class, 1);
		
		s.setSi(si);
		et.begin();
			em.merge(s);
			
		et.commit();
		
	}
	

}
