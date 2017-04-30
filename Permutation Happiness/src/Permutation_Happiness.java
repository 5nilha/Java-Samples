import java.util.Scanner;

//There are  people numbered with distinct IDs from 1 to n standing in a line. A person in the line is happy if the person immediately in front of and/or behind them has a higher ID number.
public class Permutation_Happiness {

	static int query(int n, int k){
        if (n > k){
        	
        }
    }
	
	
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        for(int i = 0; i < q; i++){
	        	
	            int n = scan.nextInt();
	            int k = scan.nextInt();
	     
	            
	            
	            int result = query(n, k);
	            System.out.println(result);
	        }

	        scan.close();
	}
	
	

}
