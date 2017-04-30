import java.util.ArrayList;

//files/numbers.txt
public class DataAnalysis {

	public static void main(String[] args) {
		/*---Create an array with all data got from a file---*/
		
		DataSource dataSource = new DataSource();
		DescriptiveStats stats = new DescriptiveStats();
		ArrayList<Double> data = new ArrayList<Double>();
		
		data = dataSource.GetDataFromFile();
		stats.setData(data);
		
		stats.PrintDataSize();
		stats.PrintExtremes();
		stats.PrintCenterMeasuring();
		stats.PrintQuartiles();
		stats.PrintStandardDeviation();
		stats.PrintFiveNumberSummary();
					

	}
}
