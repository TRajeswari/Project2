package eshop.BackEnd.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eshop.BackEnd.Model.Catagory;

@Component
public class CatagoryDaoImpl 

{
	
	@Autowired
	SessionFactory factory;
	public void saveCatagory(Catagory catagory)
	{
		Session s= factory.openSession();
		if(catagory.getCatagoryId()==0)
		{
			
		int id=(int)(Math.random()*1000);
		catagory.setCatagoryId(id);
		}
		s.saveOrUpdate(catagory);
		Transaction transaction=s.beginTransaction();
		transaction.commit();	
				}

	public List<Catagory> retriveAllCatagory()
	{
		Session session = factory.openSession();
		Query query=session.createQuery("from Catagory");
		List<Catagory> list= query.list();
		
		return list;
	}


	public void deleteCatagory(int CatagoryId)
	{
	Session session=factory.openSession();
	Catagory  catagory=session.get(Catagory.class,CatagoryId);

	System.out.println(catagory);
	session.delete(catagory);
	Transaction transaction=session.beginTransaction();
	transaction.commit();
	session.close();
	}
	public Catagory get(int catagoryId)
	{
	     Session sess=factory.openSession();
	     Catagory catagory=sess.get(Catagory.class,catagoryId);
	    
	      System.out.println("catagory..."+catagory);
	    
	      sess.close();
	          return catagory;        
	}		

}
