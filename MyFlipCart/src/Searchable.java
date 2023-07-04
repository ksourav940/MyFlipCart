import java.util.ArrayList;

public interface Searchable {
     
	ArrayList<Category> searchCategory(String categoryName);

	ArrayList<Product> searchProducts(String productName);
}
