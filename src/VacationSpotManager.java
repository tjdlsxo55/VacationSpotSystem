import java.util.Scanner;

public class VacationSpotManager {
	Vacationspot vacationspot;
	Scanner input;
	
	VacationSpotManager(Scanner input){
		this.input = input;
	}
	public void addVacationSpot() {				
		
		vacationspot = new Vacationspot();
		System.out.print("Recommanded Vacation Spot System ID:");
		vacationspot.id = input.nextInt();
		System.out.print("Recommanded Vacation Spot Name:");
		vacationspot.name = input.next();
		System.out.print("Location of Recommanded Vacation Spot:");
		vacationspot.spot = input.next();
		System.out.print("Recommanded Vacation Spot Price:");
		vacationspot.price = input.nextInt();
		System.out.print("Phone number:");
		vacationspot.phone = input.next();
	}
	public void deleteVacationSpot() {				
		System.out.print("Recommanded Vacation Spot System ID:");
		int vacationspotid = input.nextInt();
		if (vacationspot == null) {
			System.out.println("the vacation sopt has not been registered");
			return;
		}
		if (vacationspot.id == vacationspotid) {
			vacationspot = null;
			System.out.println("the vacation spot is deleted");
		}
	}
	public void editVacationSpot() {				
		System.out.print("Vacation Spot System ID:");
		int vacationspotid = input.nextInt();
		if (vacationspot.id == vacationspotid) {
			System.out.println("the vacation spot to be edited is " + vacationspotid);
		
		}
		
	}
	public void viewVacationSpotList() {				
		System.out.print("Recommanded Vacation Spot System ID:");
		int vacationspotid = input.nextInt();
		if (vacationspot.id == vacationspotid) {
			vacationspot.printInfo();
			
		}
	}


	
	}


