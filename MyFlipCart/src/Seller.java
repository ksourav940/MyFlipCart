import java.util.ArrayList;

public class Seller extends User {
  
	ArrayList<Product> product;
	public Seller(String name, String address, String username, String password, String phone) {
		super(name, address, username, password, phone);
		super.setId(id++);
		product  = new ArrayList<>();
		System.out.println("register is calling" + toString());
	}
	
	
	

    public ArrayList<Product> getProduct() {
		return product;
	}
	public void setProduct(ArrayList<Product> product) {
		this.product = product;
		System.out.println("Product is setting" + product.toString());

	}
	
	public void registerProduct() {
		
	}
}
