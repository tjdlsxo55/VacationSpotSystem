package Vacationspot;

import java.util.Scanner;

public class Restaurant extends NearTheCity {
	public Restaurant(VacationSpotKind kind) {		
		super(kind);
	}		
	
	public void getUserInput(Scanner input) {
			setVacationSpotId(input);
			setVacationSpotName(input);
			setVacationSpotLocation(input);
			setVacationSpotPrice(input);
			setVacationSpotPhoneNumber(input);
		}
}
