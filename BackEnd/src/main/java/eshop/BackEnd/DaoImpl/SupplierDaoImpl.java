package eshop.BackEnd.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import eshop.BackEnd.Model.Supplier;

@Component
public class SupplierDaoImpl 
{
	@Autowired	
	SessionFactory sessionFactory;
		public void saveSupplier(Supplier supplier)
		{
		   Session session=sessionFactory.openSession();
		   if(supplier.getSupplierId()==0)
			{
				
		   int id=(int)(Math.random()*1000);
			supplier.setSupplierId(id);
			}
			session.saveOrUpdate(supplier);
		   
		   Transaction transaction=session.beginTransaction();
		   transaction.commit();
		 session.close();
		}
		
		
		public List<Supplier> retriveAllSupplier()
		{
	       Session session=sessionFactory.openSession();
	       Query query=session.createQuery("from Supplier");
	   	List<Supplier> list= query.list();
	       return list;
		}
		
		public void deleteSupplier(int supplierId)
		{
		Session session=sessionFactory.openSession();
		Supplier supp=session.get(Supplier.class, supplierId);

		System.out.println(supp);
		session.delete(supp);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
		}
		public Supplier get(int supplierId)
		{
		     Session session=sessionFactory.openSession();
		     Supplier supplier=session.get(Supplier.class,supplierId);
		    
		      System.out.println("supplier.."+supplier);
		    
		      session.close();
		          return supplier;        
		}
}
