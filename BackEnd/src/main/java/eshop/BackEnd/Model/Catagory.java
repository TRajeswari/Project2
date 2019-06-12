package eshop.BackEnd.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catagory
{
	@Id
		
		private int catagoryId;
		
		 private String catagoryName;
		
		 private String catagoryDiscription;
		public void setCatagoryId(int catagoryId)
		{
			this.catagoryId = catagoryId;
		}
		
		public int getCatagoryId()
		{
			return catagoryId;
		}
		public void setCatagoryName(String catagoryName) 
		{
			this.catagoryName = catagoryName;
		}
		
		public String getCatagoryName() 
		{
			return catagoryName;
		}
		public void setCatagoryDiscription(String catagoryDiscription) 
		{
			this.catagoryDiscription = catagoryDiscription;
		}
		
		
		public String getCatagoryDiscription()
		{
			return catagoryDiscription;
		}
		
			

	}



