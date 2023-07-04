import java.util.Date;

public class Shipment {
 private Order order;
 private int shipmentNumber;
 private Date estimatedArrival;
 
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
@Override
public String toString() {
	return "Shipment [order=" + order + ", shipmentNumber=" + shipmentNumber + ", estimatedArrival=" + estimatedArrival
			+ "]";
}
public int getShipmentNumber() {
	return shipmentNumber;
}
public void setShipmentNumber(int shipmentNumber) {
	this.shipmentNumber = shipmentNumber;
}
public Date getEstimatedArrival() {
	return estimatedArrival;
}
public void setEstimatedArrival(Date estimatedArrival) {
	this.estimatedArrival = estimatedArrival;
}
 
}
