
import java.util.Scanner;

public class Zigzag_Array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int entries = 0;
		
		entries = scan.nextInt();
		
		int [] numbers = new int[entries];
		
		
		for (int i = 0; i < entries; i++){
			numbers[i] = scan.nextInt();
		}
		
		scan.close();
		
	
		System.out.println(minimumDelections(numbers, entries));
		
	}
	
	static int minimumDelections(int[] number, int size){
		int firstVal = 0;
		int thirdVal = 0;
		int middleVal = 0;
		int count = 0;
		int totalCount = 0;
		
//		System.out.println(Arrays.toString(number));
		
		for (int i = 2; i < size; i++){
			firstVal = number[i - 2];
			middleVal = number[i - 1];
			thirdVal = number[i];
			
			
			
			if  ((firstVal > middleVal) && (middleVal < thirdVal)){
				count = 0;

			}
			else if ((firstVal < middleVal) && (middleVal > thirdVal)) {

				count = 0;
			}
		
			else {

				count = 1;
			}
			
			totalCount += count;

		}
		return totalCount;
	}

}
