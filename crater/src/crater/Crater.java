package crater;
import java.util.Scanner;

public class Crater {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cr1 = 18;
		int cd1 = 9;
		double PI = 3.14159;
		double mass;
		double volume;
		double kineticEnergy;
		double kilotonsOfTNT;
		int impactorDensity;
		int impactorVelocity;
		int impactorDiameter;
		
		System.out.println("Terrestrial Impact Crater");
		
		System.out.print("Impactor diameter (m): ");
		impactorDiameter = scan.nextInt();
		
		System.out.print("Impactor density:  ");
		impactorDensity = scan.nextInt();
		
		System.out.print("Impactor velocity: ");
		impactorVelocity = scan.nextInt();
		
		System.out.print("Graze angle: ");
		double grazeAngle = scan.nextInt();
			
		int iV = impactorVelocity * 1000;
		volume = (PI * Math.pow(impactorDiameter, 3)) / 6;
		double gf = Math.pow( Math.sin( grazeAngle/ 180.0 * Math.PI ), 0.333 );		
		mass = 1000 * impactorDensity * volume;
		kineticEnergy = 0.5 * mass * iV * iV;		
		kilotonsOfTNT = kineticEnergy / 4.2E+12;
		
		
		System.out.println("");
		System.out.println("----------------------Impactor Parameters -----------------------");
		
		System.out.println("Volume............................" + volume + "  m ^ 3");
		System.out.println("Mass.............................." + mass + "  kg");
		System.out.println("Kinetic Energy...................." + kineticEnergy + "  J");
		System.out.println("Force in Kilotons of TNT.........." + kilotonsOfTNT + "  kT" );
		
		
		double actualDiameter;
		double apparentDiameter;
		
		actualDiameter = 2 * cr1 *  Math.pow(kilotonsOfTNT, 0.3) * gf;
		apparentDiameter = actualDiameter * 1.25;
		
		double actualDepth;
		double apparentDepth;
		
		actualDepth = cd1  * Math.pow(kilotonsOfTNT, 0.3) * gf;
		apparentDepth = actualDepth * 1.25;
		
		double targetRemoved;
		targetRemoved = (0.5 * Math.PI * actualDiameter * actualDiameter) / (4 * actualDepth);
		
		double ejectSpread;
		ejectSpread = 2.15 * actualDiameter;
		
		
		System.out.println("------------------------Crater Parameters -----------------------");
		System.out.println("Volume -----------------");
		System.out.println("Actual (m)............................." + actualDiameter);
		System.out.println("Apparent (m)..........................." + apparentDiameter);
		System.out.println("");
		
		System.out.println("Depth-------------------");
		System.out.println("Actual (m)............................." + actualDepth);
		System.out.println("Apparent (m)..........................." + apparentDepth);
		
		System.out.println("");
		System.out.println("Target Removed (m ^ 3)....................." + targetRemoved);
		System.out.println("Eject spread (m)......................." + ejectSpread);
	}
	

}
