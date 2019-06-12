package eshop.BackEnd.DaoImpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eshop.BackEnd.Model.Cart;
import eshop.BackEnd.Model.Product;
@Component
public class ProductDaoImpl 
{
	@Autowired 
	SessionFactory factory;
	public void saveProduct(Product product) 
	{

		Session s= factory.openSession();
		s.saveOrUpdate(product);
		 
		Transaction transaction=s.beginTransaction();
		transaction.commit();
		s.close();
	}
	public List<Product> RetriveDataFromProduct()
    {
       Session session=factory.openSession();
       Query query=session.createQuery("from Product");
       List list=query.list();
       session.close();
       return list;
       
    }
	public void deleteProduct(int productId)
	{
	Session session=factory.openSession();
	Product pro=session.get(Product.class,productId);

	System.out.println(pro);
	session.delete(pro);
	Transaction transaction=session.beginTransaction();
	transaction.commit();
	session.close();
	}
	public Product getProduct(int productId)
	{
	     Session sess=factory.openSession();
	      Product pro=sess.get(Product.class,productId);
	    
	      System.out.println("pro...."+pro);
	    
	      sess.close();
	          return pro;
	         
	}
	public Product viewProduct(int productId)
	{
		Session sess=factory.openSession();
	      Product pro=sess.get(Product.class,productId);
	    
	      sess.close();
	          return pro;
	}
	public Cart setCartDetails(Product product, int quantity)
	{
		
		Cart cart =new Cart();
		cart.setCartId((int)(Math.random()*10000));
		
		cart.setProductId(product.getProductId());
		cart.setProductName(product.getProductName());
		cart.setProductPrice(product.getProductPrice());
		cart.setProductSupplier(product.getProductSupplier());
		cart.setProductQuantity(quantity);
		cart.setTotal((product.getProductPrice())*(cart.getProductQuantity()));
		return cart;
	}
	public void saveCart(Cart cart) 
	{
    	Session s= factory.openSession();
		s.save(cart); 
		Transaction transaction=s.beginTransaction();
		transaction.commit();
		s.close();
	}
	public List<Cart> RetriveCartData()
	{
		Session s= factory.openSession();
		Query query = s.createQuery("from Cart");
		List<Cart> list=query.list();
		s.close();
		return list;
		
		
	}
}
