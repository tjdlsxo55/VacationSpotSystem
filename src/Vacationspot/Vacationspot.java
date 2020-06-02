package Vacationspot;

import java.io.Serializable;
import java.util.Scanner;

import Exceptions.PhoneFormatException;

public abstract class Vacationspot implements VacationSpotInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4754961464484118707L;
	protected VacationSpotKind kind = VacationSpotKind.Museum;
	protected String id;
	protected String name;
	protected String spot;
	protected int price;
	protected String phone;

	
	
	public Vacationspot() {		

	}
	public Vacationspot(VacationSpotKind kind) {		
		this.kind = kind;
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
	public Vacationspot(VacationSpotKind kind,String id,String name,String spot,int price,String phone) {
		this.kind = kind;
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

	public void setPhone(String phone) throws PhoneFormatException {
		if (!phone.contains("-")) {
			throw new PhoneFormatException();
		}
		this.phone = phone;
	}

	public abstract void printInfo();
	
	public void setVacationSpotId(Scanner input) {
		System.out.print("Recommanded Vacation Spot System ID:");
		String id = input.next();
		this.setId(id);
	}
	public void setVacationSpotName(Scanner input) {
		System.out.print("Recommanded Vacation Spot Name:");
		String name = input.next();
		this.setName(name);
	}
	public void setVacationSpotLocation(Scanner input) {
		System.out.print("Location of Recommanded Vacation Spot:");
		String spot = input.next();
		this.setSpot(spot);
	}
	public void setVacationSpotPrice(Scanner input) {
		System.out.print("Recommanded Vacation Spot Price:");
		int price = input.nextInt();
		this.setPrice(price);
	}
	public void setVacationSpotPhoneNumber(Scanner input) {
		String phone = " ";
		System.out.print("Phone number:");
		phone = input.next();
		    try {
				this.setPhone(phone);
			} catch (PhoneFormatException e) {
				System.out.println("Incorrect Phone Number Format,put the Phone Number that contains -");
			}
		}
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Museum:
			skind = "Museum.";
			break;
		case Restaurant:
			skind = "Restaurant.";
			break;
		case sea:
			skind = "Sea.";
			break;
		case Mountain:
			skind = "Mountain.";
			break;
		default:			
		}
		return skind;
	}
}