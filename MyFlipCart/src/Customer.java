
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {

	
   public Customer( String name, String address, String username, String password, String phone) {
		super( name, address, username, password, phone);
		super.setId(id++);
		this.cart = new Cart();
		this.orderHistory = new ArrayList<>();
		System.out.println("register is calling" + toString());	
	}
   
   public void addToCart(Iteam iteam) {
	   cart.addIteam(iteam);   
   }
   
   public void placedOrder() {
	    currentOrder = new Order();
	   currentOrder.setIteam(cart.getIteams());
	   cart.totalAmount();
	  currentOrder.setAmount(cart.getAmount());
	   currentOrder.setShipmentAddress(getAddress());
	   currentOrder.setOrderStatus(OrderStatus.UNSHIPPED);
		System.out.println("Order is creating " + currentOrder.toString());   
   }

	public Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

	private Cart cart;
	private Order currentOrder;
	public Order getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}

	public ArrayList<Order> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(ArrayList<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	private ArrayList<Order> orderHistory;
}
