import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Vacationspot.Mountain;
import Vacationspot.Museum;
import Vacationspot.Restaurant;
import Vacationspot.Sea;
import Vacationspot.VacationSpotInput;
import Vacationspot.VacationSpotKind;
import Vacationspot.Vacationspot;

public class VacationSpotManager {
	ArrayList<VacationSpotInput> vacationspots = new ArrayList<VacationSpotInput>();
	Scanner input;
	
	VacationSpotManager(Scanner input){
		this.input = input;
	}
	public void addVacationSpot() {	
		VacationSpotInput vacationspotinput;
		int kind = 0;
		while (kind <1 || kind > 4 ) {
			try {
			System.out.println("Select Vacation Spot Kind");
			System.out.println("1 for Museum");
			System.out.println("2 for Restaurant");
			System.out.println("3 for Sea");
			System.out.println("4 for Mountain");
			System.out.println("select num 1,2,3 or 4 for Vacation Spot Kind:");
			
			kind = input.nextInt();
			
			
			if (kind == 1) {
				vacationspotinput = new Museum(VacationSpotKind.Museum);
				vacationspotinput.getUserInput(input);
				vacationspots.add(vacationspotinput);				
				break;
			}
			else if (kind == 2) {
				vacationspotinput = new Restaurant(VacationSpotKind.Restaurant);
				vacationspots.add(vacationspotinput);
				vacationspotinput.getUserInput(input);
				break;
			}
			else if (kind == 3) {
				vacationspotinput = new Sea(VacationSpotKind.sea);				
				vacationspots.add(vacationspotinput);
				vacationspotinput.getUserInput(input);
				break;
			}
			else if (kind == 4) {
				vacationspotinput = new Mountain(VacationSpotKind.Mountain);
				vacationspotinput.getUserInput(input);
				vacationspots.add(vacationspotinput);
				break;
			}
			else {
				System.out.print("select num for Vacation Spot Kind between one, two, three and four:");
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}	


	}
	public void deleteVacationSpot() {				
		System.out.print("Recommanded Vacation Spot System ID:");
		String vacationspotid = input.next();
		int index = findIndex(vacationspotid);
		removefromVacationSpots(index,vacationspotid);		
	}
	public int findIndex(String vacationspotid) {
		int index = -1;
		for (int i = 0; i<vacationspots.size(); i++) {
		 	if (vacationspots.get(i).getId() == vacationspotid) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromVacationSpots(int index,String vacationspotid)	 {
		if (index >= 0) {
			vacationspots.remove(index);
			System.out.println("the vacation spot is deleted");
			return 1;
		}
		else {
			System.out.println("the vacation sopt has not been registered");
			return -1;
		}	
	}	
	public void editVacationSpot() {				
		System.out.print("Vacation Spot System ID:");
		String vacationspotid = input.next();
		for (int i = 0; i<vacationspots.size(); i++) {
			VacationSpotInput vacationspot = vacationspots.get(i);
			if (vacationspot.getId() == vacationspotid) {
				int num = -1;
				while (num != 6 ) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						vacationspot.setVacationSpotId( input);
						break;
					case 2:
						vacationspot.setVacationSpotName( input);
						break;
					case 3:
						vacationspot.setVacationSpotLocation(input);
						break;
					case 4:
						vacationspot.setVacationSpotPrice(input);
						break;
					case 5:
						vacationspot.setVacationSpotPhoneNumber(input);
						break;
					default:
						continue;
					} 
				}
				break;
			}
		}
	}	
	public void viewVacationSpotList() {				

		System.out.println("number of registered vacationspots: " + vacationspots.size());
		for (int i = 0; i<vacationspots.size(); i++) {
			vacationspots.get(i).printInfo();
		}	
	}

		
	public void showEditMenu() {
		System.out.println("*** Vacation Spot Info Edit Menu ***");
		System.out.println("1.Edit Id");			
		System.out.println("2.Edit Name");
		System.out.println("3.Edit Spot");
		System.out.println("4.Edit Price");
		System.out.println("5.Edit Phone");
		System.out.println("6.Exit");	
	}
}