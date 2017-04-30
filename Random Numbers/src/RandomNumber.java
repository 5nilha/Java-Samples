import java.util.Random;

public class RandomNumber {

	public static void main (String[] args) {
		
		Random randGen = new Random();
		int randNumber = randGen.nextInt(10);
		
		System.out.println(randNumber);
		
	}
	
	
}
