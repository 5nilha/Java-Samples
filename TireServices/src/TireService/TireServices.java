package TireService;
import java.util.Scanner;

public class TireServices {
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		boolean tireIsLow = false;
		

        
        System.out.print("Please Enter (TR) to Tire Repair or (RM) to Regular maintenance: ");
		String userInput = scan.nextLine();
		
		if (userInput.contentEquals("TR") || userInput.contentEquals("tr")){
			tireIsLow = true;
		}
		else if (userInput.contentEquals("RM") || userInput.contentEquals("rm")) {
			tireIsLow = false;
		}
		else {
			System.out.println("Invalid input");
		}
		
	
		if (tireIsLow) {
			TireRepair.tireAnalysis();
		}
		else {
			System.out.println("The tire is good");
		}
		
		return;
		
	}
	

}
