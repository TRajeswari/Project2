package eshop.BackEnd.Model;

public class Cart
	{
	
	int cartId;

	int productId;
	String productName;
	int productPrice;
	String productSupplier;
	int productQuantity;
	int total;

	public void setCartId(int cartId)
	{
		this.cartId = cartId;
	}

	public int getCartId()
	{
		return cartId;
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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductSupplier() {
		return productSupplier;
	}

	public void setProductSupplier(String productSupplier) {
		this.productSupplier = productSupplier;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getTotal()
	{
		return total;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}



	}



