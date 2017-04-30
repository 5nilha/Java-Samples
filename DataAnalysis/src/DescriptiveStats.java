import java.util.ArrayList;
import java.util.Collections;

public class DescriptiveStats{

	static double minimumNumber;
	static double maximumNumber;
	static ArrayList<Double> FiveNumberSummary;
	ArrayList<Double> Data = new ArrayList<Double>();
	
	
	public void setData (ArrayList<Double> data){
		
		Data = data;
		return;
	}
	
	
	/* SetExtremes() method
	 * Pass a parameter as ArrayList
	 * Find the Lowest number and the highest number in the ArrayList
	 * set the global variables minimumNumber and maximumNumber to its respective value
	 */
	public void SetExtremes (){
		
		double lowestNumber = Data.get(0);
		double highestNumber = Data.get(0);
	
		for (int i = 0; i < Data.size(); i++) {
			if (Data.get(i) < lowestNumber) {
				lowestNumber = Data.get(i);
			}
			else if (Data.get(i) > highestNumber) {
				highestNumber = Data.get(i);
			}
		}
	
		minimumNumber = lowestNumber;
		maximumNumber = highestNumber;
		
	}


	/* Mean method
	 * Pass a parameter as ArrayList
	 * Sum all numbers in the array
	 * Divide the sum of all numbers by the quantity of items in the array
	 * return the Mean Number
	 */
	
	public double Mean () {
		
		double meanNumber = 0;
		int sumNumbers = 0;
		int count = 0;
		
		for (int i = 0; i < Data.size(); i++){
			sumNumbers += Data.get(i);
			count++;
		}
		
		meanNumber = (double) sumNumbers / count;
		
		return meanNumber;
	}
	
	
	/* Median method
	 * Pass only one parameter as ArrayList
	 * return the Median Number
	 */
	public double Median (ArrayList<Double> numbers){
		
		double median = 0;
		int size = numbers.size();
		
		if (size % 2 == 0){
			Double number1 = 0.0;
			Double number2 = 0.0;
			int indexMedian1 = 0;
			int indexMedian2 = 0;
			
			indexMedian1 = (size / 2) - 1 ;
			indexMedian2 = (size / 2);
			
			number1 = numbers.get(indexMedian1);
			number2 = numbers.get(indexMedian2);
			
			median = (double) (number1 + number2) / 2;
		}
		else {
			int indexMedian = 0;
			
			indexMedian = (size / 2);
			median = numbers.get(indexMedian);
		}
		
		return median;
	}

	/* Median() method overloading
	 * Pass no parameter 
	 * set the global variable Median to the median value
	 */
	public double Median (){
		
		double median = 0;
		int size = Data.size();
		
		if (size % 2 == 0){
			Double number1 = 0.0;
			Double number2 = 0.0;
			int indexMedian1 = 0;
			int indexMedian2 = 0;
			
			indexMedian1 = (size / 2) - 1 ;
			indexMedian2 = (size / 2);
			
			number1 = Data.get(indexMedian1);
			number2 = Data.get(indexMedian2);
			
			median = (double) (number1 + number2) / 2;
		}
		else {
			int indexMedian = 0;
			
			indexMedian = (size / 2);
			median = Data.get(indexMedian);
		}
		
		return median;
	}
	
	
	/* Mode method
	 * Pass a parameter as ArrayList
	 * Find the the item(s) that occurs most often in the sequence
	 * sum the equal items and print the item and its quantity.
	 */
	public double Mode (){
		
		int count = 1;
		Double mostOccur = 0.0;
		int mostOccurCount = 1;
		
		Collections.sort(Data); //sort the ArrayList in crescent order

		mostOccur = Data.get(0);
		Double numOccur = Data.get(0);
		
		for (int i = 1; i < Data.size(); i++) {
			
			if (Data.get(i) == numOccur){
				
				count += 1;
				
				if (count > mostOccurCount) {
					mostOccurCount = count;
					mostOccur = numOccur;
				}
			}
			else if (Data.get(i) != numOccur){
				
				numOccur = Data.get(i);
				count = 1;
			}
		
		}
	
		return mostOccur;
	}

	
	/* Range() method
	 * Return the difference between the lowest and highest value
	 */
	public double Range (){
		
		double range = 0;

		range = maximumNumber - minimumNumber;
		
		return range;
	}
	

	/* FirstQuartile() Method
	 * Pass a parameter as ArrayList
	 * find the mid point of the the ArrayList
	 * Work with the data on the left side of the ArrayList
	 * Create an Array list with all data of the left side.
	 * Call the Median() Method to find the mid point of the left side
	 * Return the mid point of the left side called firstQuartile.
	 */
	public double FirstQuartile () {
		
		ArrayList<Double> firstHalfNumbers = new ArrayList<Double>();
		double firstQuartile = 0;
		int index = 0;
		
		int median = (int) Median(Data);
		
		while (Data.get(index) < median) {
			
			firstHalfNumbers.add(Data.get(index));
			index++;
		}
		
		firstQuartile = Median(firstHalfNumbers);
	
		return firstQuartile;
	}
	
	
	
	/* ThirdQuartile() Method
	 * Pass a parameter as ArrayList
	 * find the mid point of the the ArrayList
	 * Work with the data on the right side of the ArrayList
	 * Create an Array list with all data of the right side of the mid point
	 * Call the Median() Method to find the mid point of the right side
	 * Return the mid point of the right side called ThirdQuartile.
	 */
	public double ThirdQuartile () {
		
		ArrayList<Double> secondHalfNumbers = new ArrayList<Double>();
		double thirdQuartile = 0;
		int index = 0;
	
		if (Data.size() % 2 == 0){
			index = (Data.size() / 2);
		}
		else {
			index = (Data.size() / 2) + 1;
		}
		
		while (index < Data.size() ) {
			
			secondHalfNumbers.add(Data.get(index));
			index++;
		}

		thirdQuartile = Median(secondHalfNumbers);
		
		 return thirdQuartile;
	}
	
	
	
	public ArrayList<Double> FiveNumberSummary(){
		
		ArrayList<Double>fiveNumberSummary = new ArrayList<Double>();
		double firstQuartile = FirstQuartile();
		double thirdQuartile = ThirdQuartile(); 
		double median = Median();
		
		fiveNumberSummary.add(minimumNumber);
		fiveNumberSummary.add(firstQuartile);
		fiveNumberSummary.add(median);
		fiveNumberSummary.add(thirdQuartile);
		fiveNumberSummary.add(maximumNumber);
		
		return fiveNumberSummary;
	}
	
	
	public double StandardDeviation() {
		double deviation;
		int N = Data.size();
		Double mean = Mean();
		double summation = 0.0;
		
		for (int i = 0; i < N; i++){
			summation += (Math.pow((Data.get(i) - mean), 2));
		}
		
		deviation = Math.sqrt(summation / N);
		
		return deviation;
	}
	
	
	/* InterQuartileRange() Method
	 * Is distance between the ThirdQuartile and FirstQuartile
	 * IQR represents the boxed area in a graphic representation
	 */
	public Double InterQuartileRange() {
		
		double firstQuartile = FirstQuartile();
		double thirdQuartile = ThirdQuartile();
		double IQR = 0.0;
		
		IQR = thirdQuartile - firstQuartile;
		
		return IQR;
	}
	
	
	
	/*----------Print out all the statistics data ---------------*/
	
	
	public void PrintCenterMeasuring(){
		
		double median = Median();
		double mean = Mean();
		double mode = Mode();
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.printf("Mean : %.1f\n", mean);
		System.out.printf("Median : %.1f\n", median);	
		System.out.println("Mode : " + mode);
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public void PrintStandardDeviation() {
		double mean = Mean();
		double standardDeviation = StandardDeviation();
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.printf("Deviation : %.2f\n", standardDeviation);
		System.out.printf("One Standard Deviation Below the Mean : %.2f\n", mean - standardDeviation);
		System.out.printf("One Standard Deviation Above the Mean : %.2f\n", mean + standardDeviation);
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public void PrintQuartiles() {
		
		double firstQuartile = FirstQuartile();
		double thirdQuartile = ThirdQuartile();
		double interQuartileRange = InterQuartileRange();
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.printf("FirtQuartile: %.2f\n", firstQuartile);
		System.out.printf("ThirdQuartile: %.2f\n", thirdQuartile);
		System.out.printf("Interquartile Range : %.2f\n", interQuartileRange);
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public void PrintFiveNumberSummary() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("FiveNumberSummary : " + FiveNumberSummary());
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public void PrintExtremes(){
		SetExtremes();
		double range = Range();
		double minimum = minimumNumber;
		double maximum = maximumNumber;
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Minimum : " + minimum);
		System.out.println("Maximum : " + maximum);
		System.out.println("Range : " + range);
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public void PrintDataSize(){
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Data Count : " + Data.size());
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
}


