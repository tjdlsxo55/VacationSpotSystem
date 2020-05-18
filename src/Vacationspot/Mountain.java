package Vacationspot;

import java.util.Scanner;

import Exceptions.PhoneFormatException;

public class Mountain extends Vacationspot {
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
			
			answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N')
			{
				
				System.out.print("Do you have a parent's Phone Number? (Y/N):");
				answer = input.next().charAt(0);
				try {
					if (answer == 'Y' || answer == 'y') {
				
						System.out.println("parent's Phone Number:");
						String phone = input.next();
						this.setPhone(phone);
						break;
					}
					else if	(answer == 'N' || answer == 'N') {
						this.setPhone("");
						break;
					}
					else {
					}		
				}
				catch(PhoneFormatException e) {
					System.out.println("Incorrect Phone Number,put the - ");
					
				}
			}	
			
			
			setVacationSpotName(input);
			
			setVacationSpotLocation(input);
			
			setVacationSpotPrice(input);
			
	}
			
	public void printInfo() {
		String skind = getKindString();
		
		System.out.println("Kind:" + skind + "id:" + id + "name:" + name + "spot:" + spot + "price:" + price +"parant's phone:" + phone);		
	}

}

