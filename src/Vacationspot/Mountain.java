package Vacationspot;

import java.util.Scanner;

public class Mountain extends Vacationspot{
	public Mountain(VacationSpotKind kind) {		
		super(kind);
		}
	protected String parentphone;
	
	public void getUserInput(Scanner input) {
			
			char answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N')
			{
				
				System.out.print("Do you have an Id? (Y/N):");
				answer = input.next().charAt(0);
				if (answer == 'Y' || answer == 'y') {
					System.out.print("Recommanded Vacation Spot System ID:");
					String id = input.next();
					this.setId(id);
					break;
				}
				else if	(answer == 'N' || answer == 'N') {
					this.setId("");
					break;
				}
				else {
					
				}
			}
			
			answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N')
			{
				
				System.out.print("Do you have a parent's Phone Number? (Y/N):");
				answer = input.next().charAt(0);
				if (answer == 'Y' || answer == 'y') {
					System.out.print("parent's Phone Number:");
					String id = input.next();
					this.setId(id);
					break;
				}
				else if	(answer == 'N' || answer == 'N') {
					this.setId("");
					break;
				}
				else {
					
				}
			}
			
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
	public void printInfo() {
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
		System.out.println("Kind:" + skind + "id:" + id + "name:" + name + "spot:" + spot + "price:" + price +"parant's phone:" + phone);
		
	}
}
