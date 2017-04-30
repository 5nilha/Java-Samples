
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int studentsNumber = 0;
		int remainderRounding = 0;
		
		studentsNumber = scan.nextInt();
		
		int[] grade = new int[studentsNumber];
		
		for (int i = 0; i < studentsNumber; i++) {
			
			grade[i] = scan.nextInt();

		}
		
		
		scan.close();
		
		for (int i = 0 ; i < studentsNumber; i++) {
			
			
			if (grade[i] >= 38){
				
				remainderRounding =  5 - (grade[i] % 5);
				
			
				
				if (remainderRounding < 3){
					grade[i] += remainderRounding;
				}
			}
			
			System.out.println (grade[i]);
		}
	
	}

}
