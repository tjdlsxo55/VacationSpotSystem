package Vacationspot;

import java.util.Scanner;

public class Museum extends NearTheCity {
	public Museum(VacationSpotKind kind) {		
		super(kind);
	}		
	public void getUserInput(Scanner input) {
		
		setVacationSpotIdwihtYN(input);
		setVacationSpotName(input);
		setVacationSpotLocation(input);
		setVacationSpotPrice(input);
		setVacationSpotPhoneNumber(input);
	}
}
