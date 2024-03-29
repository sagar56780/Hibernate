package remove;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_many_to_one_uni.Review;

public class Remove {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one_uni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query query=em.createQuery("select r from Review r ");
		List<Review> rl=query.getResultList();
		
		Iterator<Review> itr=rl.iterator();
		while(itr.hasNext())
		{
			Review r=itr.next();
			if(r.getP().getId()!=2)
			{
				itr.remove();
			}
			else
			{
				r.setP(null);
			}
		
		}
		
	}

}
