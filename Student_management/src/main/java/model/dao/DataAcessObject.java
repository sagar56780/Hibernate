package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.dto.Admin;
import model.dto.Course;
import model.dto.EducationDetails;
import model.dto.PersonalDetails;

public class DataAcessObject {
	
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("schoolmanagement");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
	
	
	public boolean admin_login(String id,String password,String admin_name)
	{
			Query query=em.createQuery("select a from Admin a where a.name=?1 and a.password=?2 and a.login_name=?3");
			query.setParameter(1, id);
			query.setParameter(2, password);
			query.setParameter(3, admin_name);
			List<Admin> admin=query.getResultList();
			System.out.println(admin);
			if(admin!=null)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public boolean addCourse(Course course)
	{
		et.begin();
		em.persist(course);
		et.commit();
		return true;
	}
  
	public static void main(String[] args) {
		DataAcessObject dao=new DataAcessObject();
	}

}
