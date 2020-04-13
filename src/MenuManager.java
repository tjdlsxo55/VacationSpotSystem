import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VacationSpotManager vacationSpotManager = new VacationSpotManager(input);
		
		
		int num = -1;
		while (num != 5 ) {
			System.out.println("*** Recommanded Vacation Spot List ***");
			System.out.println("1.Add Recommanded Vacation Spot");			
			System.out.println("2.Delete Recommanded Vacation Spot");
			System.out.println("3.Edit Recommanded Vacation Spot");
			System.out.println("4.View List");
			System.out.println("5.Log Out");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if (num ==1 ) {
				vacationSpotManager.addVacationSpot();
			}
			else if (num ==2 ) {
				vacationSpotManager.deleteVacationSpot();
			}
			
			else if (num ==3 ) {
				vacationSpotManager.editVacationSpot();
			}
			else if (num ==4 ) {
				vacationSpotManager.viewVacationSpotList();
			}
			else {
				continue;
			}
		}
	}
}
	