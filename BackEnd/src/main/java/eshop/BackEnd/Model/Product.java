package eshop.BackEnd.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;
@Entity
public class Product 
{
	@Id
	    int productId;
	    @Column
	    String productName;
	    @Column
	    String productDiscription;
	    @Column
	    int productPrice;
	    @Column
	    String productCategory;
	    @Column
	    String productSupplier;
	  @Transient  
	  private MultipartFile proImage;
	  
	
	  
	    public MultipartFile getProImage() {
		return proImage;
	}
	public void setProImage(MultipartFile proImage) {
		this.proImage = proImage;
	}
		public int getProductId() {
	        return productId;
	    }
	    public void setProductId(int productId) {
	        this.productId = productId;
	    }
	    public String getProductName() {
	        return productName;
	    }
	    public void setProductName(String productName) {
	        this.productName = productName;
	    }
	    public String getProductDiscription() {
	        return productDiscription;
	    }
	    public void setProductDiscription(String productDiscription) {
	        this.productDiscription = productDiscription;
	    }
	    public int getProductPrice() {
	        return productPrice;
	    }
	    public void setProductPrice(int productPrice) {
	        this.productPrice = productPrice;
	    }
	    public String getProductCategory() {
	        return productCategory;
	    }
	    public void setProductCategory(String productCategory) {
	        this.productCategory = productCategory;
	    }
	    public String getProductSupplier() {
	        return productSupplier;
	    }
	    public void setProductSupplier(String productSupplier) {
	        this.productSupplier = productSupplier;
	    }

}
