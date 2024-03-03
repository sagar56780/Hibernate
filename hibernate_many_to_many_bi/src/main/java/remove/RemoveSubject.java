package remove;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Student;
import entity_classes.Subject;

public class RemoveSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_many_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Subject sub=em.find(Subject.class, 104);
		List<Student> student =sub.getStudents();
		for(Student stu: student)
		{
			Iterator<Subject> itsub=stu.getSubjects().iterator();
			while(itsub.hasNext())
			{
				Subject temp=itsub.next();
				if(temp.getId()==104)
				{
					itsub.remove();
					break;
				}
			}
 		}
		et.begin();
		for(Student s:student)
		{
			em.persist(s);
		}
		
		et.commit();
	}

}
