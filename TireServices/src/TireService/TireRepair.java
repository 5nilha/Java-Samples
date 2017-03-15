package TireService;
import java.util.Scanner;

public class TireRepair {

	public static double servicePrices(int serviceNumber) {
		Scanner scan = new Scanner(System.in);
		
		final double FIX_PLUG = 5.00;
		final double FIX_PATCH = 15.00;
		final double FIX_BEAD_SEALER = 25.00;
		final double USED_TIRE = 50.00;
		final double NEW_TIRE = 115.00;
		
		double serviceCost = 0.0;
		
		
		System.out.println("");
		System.out.println("                   PRICES 2017:");
		System.out.println("***************************************************");
		System.out.printf("Fix Tire with a Plug:                       $%.2f\n", FIX_PLUG);
		System.out.printf("Fix Tire with a Patch:                      $%.2f\n", FIX_PATCH);
		System.out.printf("Fix Tire with Bead Sealer:                  $%.2f\n", FIX_BEAD_SEALER);
		System.out.printf("New Tire:                                   $%.2f\n", NEW_TIRE);
		System.out.printf("Used Tire:                                  $%.2f\n", USED_TIRE);
		System.out.println("***************************************************");
		
		
		
		if (serviceNumber == 1) {
			serviceCost = FIX_PLUG;
		}
		else if (serviceNumber == 2) {
			serviceCost = FIX_PATCH;
		}
		else if (serviceNumber == 3) {
			serviceCost = FIX_BEAD_SEALER;
		}
		else {
			System.out.println("Select (New) to New Tire or (Used) to Used Tire: ");
			String tireInput = scan.next();
			
			if (tireInput.contains("N") || tireInput.contains("n") ){
				serviceCost = NEW_TIRE;
			}
			else if (tireInput.contains("U") || tireInput.contains("U") ) {
				serviceCost = USED_TIRE;
			}
			
		}
		
		
		return serviceCost;
		
		
		
	}
	

	
	public static void tireAnalysis() {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Starting Analysis..............");
		
		System.out.println("");
		System.out.println("PLEASE ENTER THE VALUE REQUIRED");
		System.out.println("Tire has a Nail.............................Enter#: (1)");
		System.out.println("Tire has a Harsh Cut........................Enter#: (2)");
		System.out.println("Tire Bead Pressure Leaking .................Enter#: (3)");
		System.out.println("Tire is unrepairable........................Enter#: (4)");
		
		int userInput = scan.nextInt();
		
		
		int serviceNumber = 0;
		
		switch (userInput) {
		
		case 1:
			System.out.println("Need to get a plug to fix");
			serviceNumber = 1;
			break;
			
		case 2: 
			System.out.println("Need a patch to fix");
			serviceNumber = 2;
			break;
			
		case 3:
			System.out.println("Need bead Sealer to fix");
			serviceNumber = 3;
			break;
			
		default:
			System.out.println("Need to buy a Tire");
			serviceNumber = 4;
			break;
		}
		
		double serviceCost = servicePrices(serviceNumber);
		double tax = (serviceCost * 0.07);
		double totalCost = (serviceCost + tax);
		
		System.out.println("Service cost:.......... $" + serviceCost);
		System.out.println("Sales Tax (7%):........ $" + tax);
		System.out.println("Total Cost: ............$" + totalCost);
		
	}
	
}
