import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DataSource {
	
	/* getFilePath()
	 * Get a file path from a user input
	 * return the file Path
	 */
	private static String GetFilePath () {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a File Path: ");
		String filePath = scan.nextLine();
		System.out.println("");
		
		scan.close();
		
		return filePath;
	}
	
	
	/* Data()
	 * Open a file. If the file does not exist, it Exit the program
	 * Search for the data
	 * If the file is empty, it return null
	 * if the data exist, add the data to an ArrayList
	 * Sort the array in crescent order
	 * return the arrayList Sorted
	 */
	protected ArrayList<Double>  GetDataFromFile (){
		
		String filePath = GetFilePath();
		File file = new File (filePath);	
		
		ArrayList<Double> Data = new ArrayList<Double>();
		
		try {
			Scanner scanFile = new Scanner(file); 
			
			if (scanFile.hasNext() == false) {
				System.out.println("No data in the List");
				/*---Add a list of array type Integer to an ArrayList<Integer> ---*/ 
			//	numbers.addAll(Arrays.asList(list));
			}
			
			while (scanFile.hasNext()){
				Data.add(scanFile.nextDouble());
			}
			
			scanFile.close();
			
			/*---the method below sort the array in crescent order---*/
			Collections.sort(Data);
			
		}
		catch(IOException excpt) {
			System.out.println("File does not exist! Caught IOException: " + excpt.getMessage());
		}
		return Data;
	}
}
