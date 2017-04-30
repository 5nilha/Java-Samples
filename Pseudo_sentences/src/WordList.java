import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class WordList {
	
	private static String NOUNFILE = "files/noun.txt";
	private static String ADJECTIVEFILE = "files/adj.txt";
	private static String VERBFILE = "files/verb.txt";
	private static String ADVERBFILE = "files/adv.txt";
	
	public static ArrayList<String> readNoun() {

		
		try {
			Scanner scan = new Scanner(new File(NOUNFILE));
			ArrayList<String> nouns = new ArrayList<String>();	
			
			while(scan.hasNext()) {
				nouns.add(scan.nextLine());
			}
			scan.close();
			return nouns;
			
			
		} catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
		
		return null;
	}
	
	
	public static ArrayList<String> readAdjective() {
		
		try {
			
			Scanner scan = new Scanner (new File(ADJECTIVEFILE));
			
			ArrayList<String> adjectives = new ArrayList<String>();
			
			while(scan.hasNext()) {
				adjectives.add(scan.nextLine());
			}
			scan.close();
			return adjectives;
			
		} catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
		
		return null;
	}
	
	
	public static ArrayList<String> readVerb() {
		
		try {

			Scanner scan = new Scanner (new File(VERBFILE));
			
			ArrayList<String>verbs = new ArrayList<String>();
			
			while (scan.hasNext()) {
				verbs.add(scan.nextLine());
			}
			scan.close();
			
			return verbs;
		
		} catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
		
		return null;
		
	}
	
	public static ArrayList<String> readAdverb() {		
		
		try {
			Scanner scan = new Scanner(new File(ADVERBFILE));
			
			ArrayList<String>adverbs = new ArrayList<String>();
			
			
			while(scan.hasNext()){
				adverbs.add(scan.nextLine());
			}
			scan.close();
			
			return adverbs;
		
			
		
			
		} catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
		
		return null;
	
		
	}
	
	
	
	
	public static String randomWordStartingWith ( String letter, ArrayList<String> arrayList ) {
		
		
		int count = 1;
		
		
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(arrayList.size() - 1);
		
		String word = arrayList.get(randomNumber);
		
		while (word.charAt(0) != letter.charAt(0)){
			count += 1;
			randomNumber = rand.nextInt(arrayList.size() - 1);
			word = arrayList.get(randomNumber);
		}
		

		return word;
		
	}

}

