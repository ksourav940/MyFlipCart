import java.util.ArrayList;
import java.util.HashMap;

public class ProductCatalogue implements Searchable {
	private HashMap<String,ArrayList<Product>> categoryProductMap;
	private HashMap<String,ArrayList<Seller>> productSellerMap;
      private ArrayList<Product> productList;
      private ArrayList<Category> categoryList;
      
      
	public HashMap<String, ArrayList<Product>> getCategoryProductMap() {
		return categoryProductMap;
	}

	public void setCategoryProductMap(HashMap<String, ArrayList<Product>> categoryProductMap) {
		this.categoryProductMap = categoryProductMap;
	}
	
	public ProductCatalogue() {
		productList = new ArrayList<>();
		categoryList = new ArrayList<>();
		
	}

	public void addProduct(Product product) {
		productList.add(product);
		System.out.println("Product is added " + product.toString());
	}
	
	public void addCategory(Category category) {
		categoryList.add(category);
		System.out.println("category is added " + category.toString());
	}

	@Override
	public ArrayList<Category> searchCategory(String categoryName) {
		
		return null;
	}
	
	@Override
	public ArrayList<Product> searchProducts(String productName) {
		
		return null;
	}

	
}
