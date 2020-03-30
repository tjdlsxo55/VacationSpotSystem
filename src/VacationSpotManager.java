import java.util.Scanner;

public class VacationSpotManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 4;

		while (num != 5 ) {
			System.out.println("*** Recommanded Vacation Spot List ***");
			System.out.println("1.Add Recommanded Vacation Spot");			
			System.out.println("2.Delete Recommanded Vacation Spot");
			System.out.println("3.View List");
			System.out.println("4.show a menu");
			System.out.println("5.Log Out");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if (num ==1 ) {
				addVacationSpot();
			}
			else if (num ==2 ) {
				deleteVacationSpot();
			}
			else if (num ==3 ) {
				viewVacationSpotList();
			}
			else {
				continue;
			}
		}
	}
	public static void addVacationSpot() {				
		Scanner input = new Scanner(System.in);
		System.out.print("Recommanded Vacation Spot System ID:");
		int vacationSpot = input.nextInt();
		System.out.print("Recommanded Vacation Spot Name:");
		String vacationSpotName = input.next();
		System.out.println(vacationSpotName);
		System.out.print("Location of Recommanded Vacation Spot:");
		String VacationSpotLocation = input.next();
		System.out.println(VacationSpotLocation);
		System.out.print("Recommanded Vacation Spot Price:");
		int vacationSpotPrice = input.nextInt();
		System.out.println(vacationSpotPrice);
		System.out.print("Phone number:");
		String vacationSpotPhonenumber = input.next();
		System.out.println(vacationSpotPhonenumber);
	}
	public static void deleteVacationSpot() {				
		Scanner input = new Scanner(System.in);
		System.out.print("Recommanded Vacation Spot System ID:");
		int vacationSpot = input.nextInt();
	}
	public static void viewVacationSpotList() {				
		Scanner input = new Scanner(System.in);
		System.out.print("Recommanded Vacation Spot System ID:");
		int vacationSpot = input.nextInt();
	}

}