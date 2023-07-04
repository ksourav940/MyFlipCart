import java.util.ArrayList;
import java.util.Scanner;

public class MyFlipCart {
    ArrayList<User> user;
    static ArrayList<Product> productList = new ArrayList<>();
    static ProductCatalogue productCatalogue;
   // static Cart cart = new Cart();
    public static void main(String args[]) {
    Customer vikram = new Customer("vikram","jharia","vikram","admin","9898989899");
    Seller sourav = new Seller("soruav", "jharia","ksourav","admin","899778888");
    Product phone = new Product("phone","smart phone","5000","100");
    Product laptop = new Product("laptop","smart laptop","50000","100");
    Product soap = new Product("soap","soap","50","1000");
    Product facewash = new Product("facewash","face wash","100","100");
    Category category1 = new Category("Electronic","Electronic product");
    Category category2 = new Category("PersonalCare","all personal care product");
    phone.setSeller(sourav);
    laptop.setSeller(sourav);
    soap.setSeller(sourav);
    facewash.setSeller(sourav);
    phone.setCategory(category1);
    laptop.setCategory(category1);
    soap.setCategory(category2);
    facewash.setCategory(category2);

   
    productList.add(facewash);
    productList.add(phone);
    productList.add(soap);
    productList.add(laptop);
    sourav.setProduct(productList);
    productCatalogue = new ProductCatalogue();
    productCatalogue.addCategory(category1);
    productCatalogue.addCategory(category2);
    productCatalogue.addProduct(phone);
    productCatalogue.addProduct(laptop);
    productCatalogue.addProduct(soap);
    productCatalogue.addProduct(facewash);
    
    Iteam iteam1 = new Iteam(phone,6);
    Iteam iteam2 = new Iteam(laptop,2);
    Iteam iteam3 = new Iteam(soap,6);
    
    vikram.addToCart(iteam1);
    vikram.addToCart(iteam2);
    vikram.addToCart(iteam3);
    vikram.placedOrder();
    vikram.getCurrentOrder().getLogs();
    
    
    
    

    
    

    }
}
