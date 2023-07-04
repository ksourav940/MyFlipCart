import java.util.ArrayList;

public class Cart {
   private ArrayList<Iteam> iteams;
   private double amount=0;


public Cart() {
	this.iteams = new ArrayList<>();
}
public void totalAmount() {
	for(Iteam i: iteams)
	this.amount += i.getPrice();   
}

public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public void addIteam(Iteam iteam) {
	iteams.add(iteam);
	System.out.println("Iteam is added "+ iteam.toString());
	   
   }
public void removeIteam(Iteam iteam) {
	iteams.remove(iteam);
}

public ArrayList<Iteam> getIteams() {
	return iteams;
}

public void setIteams(ArrayList<Iteam> iteams) {
	this.iteams = iteams;
}
}
