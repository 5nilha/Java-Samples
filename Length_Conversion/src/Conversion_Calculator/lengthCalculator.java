package Conversion_Calculator;
import java.util.Scanner;
import java.lang.Math;

public class lengthCalculator {

		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			double lengthValue = scan.nextDouble();
			
			double inchesValue = (lengthValue % (int)lengthValue);
			int inches = 0;
			int feet = (int)(lengthValue);
			
			if (inchesValue > 0.95){
				inches = (int)(inchesValue * 100);
			}
			else if ( Math.abs(inchesValue - 0.95) < 0.0001){
				inches = (int)(inchesValue * 10);
			}
			else {
				inches = (int)(inchesValue * 10);
			}
			
			
			
				
			System.out.println(feet);
			System.out.println(inches);
			
			
			
			
			double conversion = calcFeetAndInchesToCentimeters(feet, inches);
			
			System.out.printf("%.2f", conversion);
			
		}
		
		public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
			double cm = 0.0;
			final double CM_TO_INCH = 2.54;
			
			if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
				
				double inchesConverted = (feet * 12);
				cm = (inches * CM_TO_INCH) + (inchesConverted * CM_TO_INCH);
				return cm;
			}
			else{
				return -1;
			}
			
			
		}

	
}
