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
					continue;}
			}
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


