
public class Vacationspot {
	int id;
	String name;
	String spot;
	int price;
	String phone;
	
	public Vacationspot() {		
	}
	
	public Vacationspot(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public Vacationspot(int id,String name,String spot,int price,String phone) {
		this.id = id;
		this.name = name;
		this.spot = spot;
		this.price = price;
		this.phone = phone;
	}
	public void printInfo() {
		System.out.println("id:" + id + "name:" + name + "spot:" + spot + "price:" + price +"phone:" + phone);
		
		
	}
}
