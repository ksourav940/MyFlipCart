import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Order {

  private int orderId;
   private Date orderDate;
   private Double amount;
   private String shipmentAddress;
   private OrderStatus orderStatus; 
   
   public String getShipmentAddress() {
	return shipmentAddress;
}
public void setShipmentAddress(String shipmentAddress) {
	this.shipmentAddress = shipmentAddress;
}
   private ArrayList<OrderLog> logs;
   private ArrayList<Iteam> iteams;
   
   public Shipment moveToShipment() {
	  Shipment shipment = new Shipment();
	   return shipment;
   }
public int getOrderId() {
	return orderId;
}
public Order() {
	this.orderId = orderId + 1;
	this.orderDate =  new java.util.Date();
	this.logs = new ArrayList<>();
	addOrderLog(new OrderLog(orderStatus.CREATED,new Date()));
	
}


@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", amount=" + amount + ", shipmentAddress="
			+ shipmentAddress + ", orderStatus=" + orderStatus + ", logs=" + logs + ", iteams="
			+ iteams + "]";
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public ArrayList<OrderLog> getLogs() {
	System.out.println("log is creating " + logs.toString());
	return logs;
	

}
public void setLogs(ArrayList<OrderLog> logs) {
	this.logs = logs;
}
public ArrayList<Iteam> getIteams() {
	return iteams;
}
public void setIteam(ArrayList<Iteam> iteam) {
	this.iteams = iteam;
}
public void addOrderLog(OrderLog orderLog) {
	logs.add(orderLog);
}
public OrderStatus getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(OrderStatus orderStatus) {
	this.orderStatus = orderStatus;
	addOrderLog(new OrderLog(orderStatus,new Date()));
}
public void setIteams(ArrayList<Iteam> iteams) {
	this.iteams = iteams;
}

   
}
