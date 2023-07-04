import java.util.Date;

public class OrderLog {
   private OrderStatus status;
   private Date creationTimeStamp;
public OrderStatus getStatus() {
	return status;
}
@Override
public String toString() {
	return "OrderLog [status=" + status + ", creationTimeStamp=" + creationTimeStamp + "]";
}
public OrderLog(OrderStatus status, Date creationTimeStamp) {
	this.status = status;
	this.creationTimeStamp = creationTimeStamp;
}
public void setStatus(OrderStatus status) {
	this.status = status;
}
public Date getCreationTimeStamp() {
	return creationTimeStamp;
}
public void setCreationTimeStamp(Date creationTimeStamp) {
	this.creationTimeStamp = creationTimeStamp;
}
   
}
