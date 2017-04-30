import java.util.Scanner;

public class BankAccountReward {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int swipe = 0;
		int rewards = 10;
		int points = 0;
		int total = 0;
		
		for (int i = 0; i < 3; i ++){
			swipe = scan.nextInt();
			
			points = swipe * rewards;
			
			if (points >= 100){
				points = 100;
			}
			
			total += points;
		}
		System.out.println(total);
		scan.close();

	}

}
