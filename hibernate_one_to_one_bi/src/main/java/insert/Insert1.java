package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import entity_classes.PanCard1;
import entity_classes.Person1;

public class Insert1 {
	public static void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person1 p=new Person1(1,"Shubam",1111);
		PanCard1 pan1=new PanCard1(101,"maharashtra","1-1-1999",null);
		
			p.setPan1(pan1);
		
		Person1 p2=new Person1(2,"sumit",2222);
		PanCard1 pan2=new PanCard1(102,"delhi","1-1-1989",null);
			p2.setPan1(pan2);
		
		et.begin();
		 em.merge(p);
		 em.merge(p2);
		et.commit();

		
		
		
	}
	
}
