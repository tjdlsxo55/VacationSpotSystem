package Vacationspot;

import java.util.Scanner;

public abstract class NearTheCity extends Vacationspot {
	public NearTheCity(VacationSpotKind kind) {		
		super(kind);
	}		
	public abstract void getUserInput(Scanner input);
	public void printInfo() {
		String skind = getKindString();
		
		System.out.println("Kind:" + skind + "id:" + id + "name:" + name + "spot:" + spot + "price:" + price +"parant's phone:" + phone);		
	}
	public void setVacationSpotIdwihtYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N')
		{
			
			System.out.print("Do you have an Id? (Y/N):");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				setVacationSpotId(input);
				break;
			}
			else if	(answer == 'N' || answer == 'N') {
				this.setId("");
				break;
			}
			else {
				
			}
		}

}
	public void printInfo2() {
		String skind = getKindString();
		
		System.out.println("Kind:" + skind + "id:" + id + "name:" + name + "spot:" + spot + "price:" + price +"parant's phone:" + phone);		
	}

}
