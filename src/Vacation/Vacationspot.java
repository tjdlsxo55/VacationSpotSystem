package Vacation;

import java.util.Scanner;

public class Vacationspot {

	protected VacationSpotKind kind = VacationSpotKind.Museum;
	protected String id;
	protected String name;
	protected String spot;
	protected int price;
	protected String phone;

	
	public Vacationspot() {		

	}
	
	public Vacationspot(String id,String name) {
		this.id = id;
		this.name = name;

	}
	
	public Vacationspot(String id,String name,String spot,int price,String phone) {
		this.id = id;
		this.name = name;
		this.spot = spot;
		this.price = price;
		this.phone = phone;

	}
	public VacationSpotKind getKind() {
		return kind;
	}

	public void setKind(VacationSpotKind kind) {
		this.kind = kind;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpot() {
		return spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void printInfo() {
		System.out.println("id:" + id + "name:" + name + "spot:" + spot + "price:" + price +"phone:" + phone);
				
	}
	public void getUserInput(Scanner input) {
		
		System.out.print("Recommanded Vacation Spot System ID:");
		String id = input.next();
		this.setId(id);
		
		System.out.print("Recommanded Vacation Spot Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Location of Recommanded Vacation Spot:");
		String spot = input.next();
		this.setSpot(spot);
		
		System.out.print("Recommanded Vacation Spot Price:");
		int price = input.nextInt();
		this.setPrice(price);
		
		System.out.print("Phone number:");
		String phone = input.next();
		this.setPhone(phone);
	}
}
