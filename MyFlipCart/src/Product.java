
public class Product {
  
   private String name;
    private String description;
   private String price;
   private String availableCount;
   
   private Category category;
   private Seller seller;
public Product(String name, String description, String price, String availableCount) {
	this.name = name;
	this.description = description;
	this.price = price;
	this.availableCount = availableCount;
	System.out.println("Product are calling");
	
}
public Product() {
	// TODO Auto-generated constructor stub
}
public void setName(String name) {
	this.name = name;
}
public void setDescription(String description) {
	this.description = description;
}
public void setPrice(String price) {
	this.price = price;
}
public void setAvailableCount(String availableCount) {
	this.availableCount = availableCount;
}
public void setCategory(Category category) {
	this.category = category;
}
public void setSeller(Seller seller) {
	this.seller = seller;
}
@Override
public String toString() {
	return "Product [name=" + name + ", description=" + description + ", price=" + price + ", availableCount="
			+ availableCount + ", category=" + category + ", seller=" + seller + "]";
}
public String getName() {
	return name;
}
public String getDescription() {
	return description;
}
public String getPrice() {
	return price;
}
public String getAvailableCount() {
	return availableCount;
}
public Category getCategory() {
	return category;
}
public Seller getSeller() {
	return seller;
}
   
    
}
