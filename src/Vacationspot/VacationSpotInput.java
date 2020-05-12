package Vacationspot;

import java.util.Scanner;

public interface VacationSpotInput {
	public String getId();
	public void setId(String id);
	public void getUserInput(Scanner input);
	public void setName(String name);
	public void setSpot(String spot);
	public void setPrice(int price);
	public void setPhone(String phone);
	public void printInfo();
	public void setVacationSpotId(Scanner input);
	public void setVacationSpotName(Scanner input);
	public void setVacationSpotLocation(Scanner input);
	public void setVacationSpotPrice(Scanner input);
	public void setVacationSpotPhoneNumber(Scanner input);
}