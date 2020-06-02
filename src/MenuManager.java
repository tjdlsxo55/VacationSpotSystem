import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VacationSpotManager vacationSpotManager = getObject("vacationSpotManager.ser");
		if (vacationSpotManager == null) {
			vacationSpotManager = new VacationSpotManager(input);
		}
		
		selectMenu(input, vacationSpotManager);
		putObject(vacationSpotManager,"vacationSpotManager.ser");
	}
	
	public static void selectMenu(Scanner input,VacationSpotManager vacationSpotManager) {
		int num = -1;
		while (num != 5 ) {
			try {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				vacationSpotManager.addVacationSpot();
				logger.log("add a VacationSpot");
				break;
			case 2:
				vacationSpotManager.deleteVacationSpot();
				logger.log("delete a VacationSpot");
				break;
			case 3:
				vacationSpotManager.editVacationSpot();
				logger.log("edit a VacationSpot");
				break;
			case 4:
				vacationSpotManager.viewVacationSpotList();
				logger.log("view a VacationSpotlist");
				break;
			default:
				continue;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
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
	public static VacationSpotManager getObject(String filename) {
		VacationSpotManager vacationSpotManager = null;

		try {
			
			FileInputStream  file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			vacationSpotManager = (VacationSpotManager) in.readObject();
			in.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			return vacationSpotManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vacationSpotManager;
	}
	
	public static void putObject(VacationSpotManager vacationSpotManager, String filename) {
		try {
			
			FileOutputStream  file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(vacationSpotManager);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	