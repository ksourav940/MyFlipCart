
public class Category {
private String name;
private String discription;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
@Override
public String toString() {
	return "Category [name=" + name + ", discription=" + discription + "]";
}
public Category(String name, String discription) {
	super();
	this.name = name;
	this.discription = discription;
}
public Category() {
	// TODO Auto-generated constructor stub
}


}
