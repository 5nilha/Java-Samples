import java.util.Scanner;


public class Tictactoe {

	public static void main (String[] args){
	
		Scanner scan = new Scanner(System.in);
		final int NUM_COL_X_ROW = 5;
		char[][] tableArr = { {'-','-','-'},{'-','-','-'},{'-','-','-'}};
		
		boolean activePlayer1 = false;
		boolean activePlayer2 = false;
		boolean winnerPlayer = false;
		boolean endGame = false;
		int count = 0;
		int rowPosition = 0;
		int colPosition = 0;
		
		System.out.print("");
		
		char player1 = 'o';
		char player2 = 'x';
	
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
		Scanner input = new Scanner(System.in);
		sum += input.nextInt();
		}
		
		
		
		System.out.println("Starting the game....");
		
		
		for (int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(tableArr[i][j]+ " ");
			}
			System.out.println("");
		}
	
		
		while (endGame == false) {

			
			activePlayer1 = true;
			
			if (activePlayer1 == true) {
			
				System.out.print("Choose row position: ");
				rowPosition = scan.nextInt();
				
				System.out.print("Choose col position: ");
				colPosition = scan.nextInt();
				
				tableArr[rowPosition][colPosition] = player1;
				
				for (int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						System.out.print(tableArr[i][j]+ " ");
					}
					System.out.println("");
				}
				
				activePlayer1 = false;
				activePlayer2 = true;
			
			}
			
			
			
			if (activePlayer2 == true) {
				System.out.print("Choose row position: ");
				rowPosition = scan.nextInt();
				
				System.out.print("Choose col position: ");
				colPosition = scan.nextInt();
				
				tableArr[rowPosition][colPosition] = player2;

				
				for (int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						System.out.print(tableArr[i][j]+ " ");
					}
					System.out.println("");
				}
				
				activePlayer1 = true;
				activePlayer2 = false;
			}
			
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (tableArr[i][j] != '-'){
						count++;
					}
				}
			}
			
			if (count == 9){
				endGame = true;
			}		
		}
		

		System.out.println("Game ended");
		
	}
}
