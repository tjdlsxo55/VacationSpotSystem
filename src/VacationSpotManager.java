import java.util.ArrayList;
import java.util.Scanner;

import Vacation.Museum;
import Vacation.Vacationspot;

public class VacationSpotManager {
	ArrayList<Vacationspot> vacationspots = new ArrayList<Vacationspot>();
	Scanner input;
	
	VacationSpotManager(Scanner input){
		this.input = input;
	}
	public void addVacationSpot() {	
		Vacationspot vacationspot;
		int kind = 0;
		while (kind != 1 && kind != 2) {
			System.out.print("Select Vacation Spot Kind:");
			System.out.print("1 for Museum:");
			System.out.print("2 for Restaurant:");
			System.out.print("3 for Sea:");
			System.out.print("4 for Mountain:");
			System.out.print("select num for Vacation Spot Kind between one, two, three and four:");
			kind = input.nextInt();
			
			
			if (kind == 1) {
				vacationspot = new Museum();
				vacationspot.getUserInput(input);
				vacationspots.add(vacationspot);				
				break;
			}
			else if (kind == 2) {
				vacationspot = new Vacationspot();
				vacationspots.add(vacationspot);
				vacationspot.getUserInput(input);
				break;
			}
			else if (kind == 3) {
				vacationspot = new Vacationspot();				
				vacationspots.add(vacationspot);
				vacationspot.getUserInput(input);
				break;
			}
			else if (kind == 4) {
				vacationspot = new Vacationspot();
				vacationspot.getUserInput(input);
				vacationspots.add(vacationspot);
				break;
			}
			else {
				System.out.print("select num for Vacation Spot Kind between one, two, three and four:");
			}
		}	


	}

	public void deleteVacationSpot() {				
		System.out.print("Recommanded Vacation Spot System ID:");
		String vacationspotid = input.next();
		int index = -1;
		for (int i = 0; i<vacationspots.size(); i++) {
			if (vacationspots.get(i).getId() == vacationspotid) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			vacationspots.remove(index);

			System.out.println("the vacation spot is deleted");
		}
		else {
			System.out.println("the vacation sopt has not been registered");
			return;
		}
	}

	
	public void editVacationSpot() {				
		System.out.print("Vacation Spot System ID:");
		String vacationspotid = input.next();
		for (int i = 0; i<vacationspots.size(); i++) {
			Vacationspot vacationspot = vacationspots.get(i);
			if (vacationspot.getId() == vacationspotid) {
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
						String id = input.next();
						vacationspot.setId(id);
					}
					else if (num ==2 ) {
						System.out.print("Recommanded Vacation Spot Name:");
						String name = input.next();
						vacationspot.setName(name);
					}
					else if (num ==3 ) {
						System.out.print("Location of Recommanded Vacation Spot:");
						String spot = input.next();
						vacationspot.setSpot(spot);
					}
					else if (num ==4 ) {
						System.out.print("Recommanded Vacation Spot Price:");
						int price = input.nextInt();
						vacationspot.setPrice(price);
					}
					else if (num ==5 ) {
						System.out.print("Phone number:");
						String phone = input.next();
						vacationspot.setPhone(phone);
				}
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
		System.out.println("number of registered vacationspots: " + vacationspots.size());
		for (int i = 0; i<vacationspots.size(); i++) {
			vacationspots.get(i).printInfo();
		}	
	}
}

