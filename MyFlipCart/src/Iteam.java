
public class Iteam {
     private Product product;
     private double price;
     private int count;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Iteam(Product product, int count) {
		this.product = product;
		this.price = Double.parseDouble(product.getPrice())*count;
		this.count = count;
		System.out.println("all item are set");
	}
	@Override
	public String toString() {
		return "Iteam [product=" + product + ", price=" + price + ", count=" + count + "]";
	}
	
}
