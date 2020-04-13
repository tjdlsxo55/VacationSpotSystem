import java.util.ArrayList;
import java.util.Scanner;

public class VacationSpotManager {
	ArrayList<Vacationspot> vacationspots = new ArrayList<Vacationspot>();
	Scanner input;
	
	VacationSpotManager(Scanner input){
		this.input = input;
	}
	public void addVacationSpot() {				
		
		Vacationspot vacationspot = new Vacationspot();
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
		vacationspots.add(vacationspot);
	}
	public void deleteVacationSpot() {				
		System.out.print("Recommanded Vacation Spot System ID:");
		int vacationspotid = input.nextInt();
		int index = -1;
		for (int i = 0; i<vacationspots.size(); i++) {
			if (vacationspots.get(i).id == vacationspotid) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			vacationspots.remove(index);
			Vacationspot.numVacationSpotsRegistered--;
			System.out.println("the vacation spot is deleted");
		}
		else {
			System.out.println("the vacation sopt has not been registered");
			return;
		}
	}

	
	public void editVacationSpot() {				
		System.out.print("Vacation Spot System ID:");
		int vacationspotid = input.nextInt();
		for (int i = 0; i<vacationspots.size(); i++) {
			Vacationspot vacationspot = vacationspots.get(i);
			if (vacationspot.id == vacationspotid) {
				int num = -1;
				while (num != 6 ) {
					System.out.println("*** Vacation Spot Info Edit Menu ***");
					System.out.println("1.Edit Id");			
					System.out.println("2.Edit Name");
					System.out.println("3.Edit Spot");
					System.out.println("4.Edit Price");
					System.out.println("5.Edit Phone");
					System.out.println("6.Exit");
					num = input.nextInt();
					if (num ==1 ) {
						System.out.print("Recommanded Vacation Spot System ID:");
						vacationspot.id = input.nextInt();
					}
					else if (num ==2 ) {
						System.out.print("Recommanded Vacation Spot Name:");
						vacationspot.name = input.next();
					}
					else if (num ==3 ) {
						System.out.print("Location of Recommanded Vacation Spot:");
						vacationspot.spot = input.next();
					}
					else if (num ==4 ) {
						System.out.print("Recommanded Vacation Spot Price:");
						vacationspot.price = input.nextInt();
						
					}
					else if (num ==5 ) {
						System.out.print("Phone number:");
						vacationspot.phone = input.next();}
					else {
						continue;
						} //if
				} //while
				break;
			} // if
		} // for
	}
		
		
		
	
	public void viewVacationSpotList() {				
//		System.out.print("Recommanded Vacation Spot System ID:");
//		int vacationspotid = input.nextInt();
		System.out.println("number of registered vacationspots: " + Vacationspot.numVacationSpotsRegistered);
		for (int i = 0; i<vacationspots.size(); i++) {
			vacationspots.get(i).printInfo();
		}	
	}
}

