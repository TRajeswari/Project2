package eshop.BackEnd.DaoImpl;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eshop.BackEnd.Model.User;

@Component
public class UserDaoImpl 
{
	@Autowired
	SessionFactory factory;
	public void saveUser(User user)
	{
		Session session= factory.openSession();
		user.setRole("ROLE_USER");
		user.setEnabled(true);
		session.save(user);
		Transaction transaction=session.beginTransaction();
		transaction.commit();	
	}
	public boolean checkLogin(User user) {
        Session sess=factory.openSession();
         Query query=sess.createQuery("from User where email=:em and password=:pw");
         query.setParameter("em",user.getEmail());
         query.setParameter("pw",user.getMobileNumber());
        Object object=query.uniqueResult();
        User user1=(User)object;
        if(user1==null)
        {
            return true;
        }
        else
        {
            return false;
        }
	
	
	

}
}
