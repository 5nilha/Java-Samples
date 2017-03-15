package insects;


/*A given insect population doubles every week. If 2 insects exist on the first week, how many weeks will pass until the insect population exceeds 10,000 insects? Use a while loop to output the insect population each week until the population exceeds 10,000 insects.

Researchers have discovered that every 4 weeks a disease is killing 40% of the insect population after the population has reproduced. If 2 insects exist on the first week, how many weeks will pass until the insect population exceeds 10,000 insects? Write a second do-while loop that outputs the insect population each week until the population exceeds 10,000 insects. Decimal places will appear in the number of insects after removing 40% of the population on week 4.
*/


public class InsectLifeTime {

	static public void main (String[] args) {
		
		double numInsects = 2;
		int totalWeeks = 0;

		
		do {
			int week = 0;
			do {
				numInsects += 2;
				week += 1;
				
			} while (week <= 4);
//				
	        numInsects = numInsects;	
			numInsects = numInsects - (numInsects * 0.40); 
			totalWeeks += week;
			System.out.println(numInsects);
			
		} while (numInsects <= 10000);
		
		System.out.println("Weeks : " + totalWeeks );
	}
	
}
