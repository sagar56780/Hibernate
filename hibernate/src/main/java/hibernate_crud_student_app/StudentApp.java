package hibernate_crud_student_app;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

import hibernate.demo.Employee;


public class StudentApp {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentapp");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s;
		
		while(true)
		{ 
			System.out.println("press 1 for add Student ");
			System.out.println("press 2 for remove Student");
			System.out.println("press 3 for find Student");
			System.out.println("press 4 for update Student");
			System.out.println("press 5 for failed Students");
		    choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("enter Student name");
				String name=sc.next();
				System.out.println("enter Student percentage");
				float per=sc.nextFloat();
				System.out.println("enter Student id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter Student age");
				int age=sc.nextInt();
				s=new Student(id,name,age,per);
				et.begin();
				em.persist(s);
				et.commit();
			
				break;
			case 2:
				System.out.println("enter id of the student you want to remove");
			    int delete=sc.nextInt();
			     s= em.find(Student.class, delete);
			     if(s==null)
			     {
			    	 System.out.println("there is no present any data  of the id "+delete);
			    	 break;
			     }
			     System.out.println(s+"this is your data which you want to remove");
			     et.begin();
			     	em.remove(s);
			     et.commit();
			     System.out.println("data removed successfully ");
			    
			    
				break;
			case 3:
			
				System.out.println("Enter on which base you want to find the student");
				System.out.println("press 1 on the basis of id");
				System.out.println("press 2 on the basis of name");
				System.out.println("press 3 on the basiss of percentage");
				switch(sc.nextInt())
				{	
				
				case 1:
					System.out.println("enter id of the student you want to find");
					int find=sc.nextInt();
					Student e=em.find(Student.class, find);
					if(e==null)
					{
						System.out.println("data is not present for particular id no "+find);
					}
					System.out.println(e);
					break;
				case 2:
					System.out.println("enter name of the student you want to find");
					String fname=sc.next();
					Query query=em.createQuery("select s from Student s where s.name=?1");
					query.setParameter(1, fname);
					List<Student> sl=query.getResultList();
					System.out.println(sl);
				    
					break;
				case 3:
					System.out.println("students will be visible with less percentage enter by you");
					float percentage=sc.nextFloat();
				    Query query2=em.createQuery("select s from Student s where s.percentage<:per");
					query2.setParameter("per", percentage);
					List<Student> s2=query2.getResultList();
					System.out.println(s2);
					
					break;
				
				}
				break;
				
				
			case 4:
				System.out.println("Enter the id of the student which you want to update");
				 s=em.find(Student.class, sc.nextInt());
				 System.out.println(s+" this is your data you want to update");
				 if(s==null)
				 {
					 System.out.println("data is not present for this id");
					 break;
				 }	
				System.out.println("choose option what you want to update in student ");
				System.out.println("enter 1 for updating name");
				System.out.println("enter 2 for updating age");
				System.out.println("enter 3 for updating percentage");
				switch(sc.nextInt() ) {
				
				
				case 1:
					
					System.out.println("Enter new  name");
					s.setName(sc.next());
					
					et.begin();
					em.merge(s);
					et.commit();
					System.out.println("name updated");
					break;
				case 2:
					System.out.println("Enter new age");
					s.setAge(sc.nextInt());
					et.begin();
					em.merge(s);
					et.commit();
					System.out.println("age updated ");
					break;
				case 3:
					System.out.println("Enter new percentage");
					s.setPercentage(sc.nextFloat());
					et.begin();
					em.merge(s);
					et.commit();
					System.out.println("percentage updated");
					break;
				default:
					break;
				
				}
				break;
			case 5:
				Query query3=em.createQuery("select s from Student s where s.percentage < ?1");
				query3.setParameter(1, 34f);
				List<Student> fsl=query3.getResultList();
				for(Student ss:fsl)
				{
					System.out.println(ss);
					
				}
				
				break;
			default:
				break;
			
			}
			
		}
		
	}
	   
		
	

}
