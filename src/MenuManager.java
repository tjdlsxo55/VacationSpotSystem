import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VacationSpotManager vacationSpotManager = new VacationSpotManager(input);
		
		
		int num = -1;
		while (num != 5 ) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				vacationSpotManager.addVacationSpot();
				break;
			case 2:
				vacationSpotManager.deleteVacationSpot();
				break;
			case 3:
				vacationSpotManager.editVacationSpot();
				break;
			case 4:
				vacationSpotManager.viewVacationSpotList();
				break;
			default:
				continue;
			}
		}
	}
	public static void showMenu() {
		System.out.println("*** Recommanded Vacation Spot List ***");
		System.out.println("1.Add Recommanded Vacation Spot");			
		System.out.println("2.Delete Recommanded Vacation Spot");
		System.out.println("3.Edit Recommanded Vacation Spot");
		System.out.println("4.View List");
		System.out.println("5.Log Out");
		System.out.println("Select one number between 1 - 5:");
	
	}
}

	