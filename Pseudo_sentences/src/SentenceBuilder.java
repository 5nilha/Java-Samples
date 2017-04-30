import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class SentenceBuilder {

	
	public static String pronoun() {
		Random rand = new Random();
		
		ArrayList<String>pronouns = new ArrayList<String>();
		
		pronouns.add("that");
		pronouns.add("the");
		pronouns.add("my");
		pronouns.add("your");
		pronouns.add("his");
		pronouns.add("her");
		pronouns.add("a / an");
		pronouns.add("their");
		pronouns.add("our");
		pronouns.add("each");
		
		
		int randomNumber = rand.nextInt(pronouns.size() - 1);
		
		return pronouns.get(randomNumber);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letter = " ";
		int i = 1;
		int sentenceQnt = 0;
		String adverb;
		String verb;
		String adjective;
		String noun;
		
		System.out.print("Insert the number of Sentences to print out:  ");
		 sentenceQnt = scan.nextInt();
		 
		 if (sentenceQnt < 1) {
			 return;
		 }
		
		System.out.println("Opening file... ");
		System.out.println("");
		
		System.out.print("Insert a Word: ");
		 letter = scan.next();
		
		while (i <= sentenceQnt) {


			adverb = WordList.randomWordStartingWith(letter, WordList.readAdverb());
			verb = WordList.randomWordStartingWith(letter, WordList.readVerb());
			adjective = WordList.randomWordStartingWith(letter, WordList.readAdjective());
			noun = WordList.randomWordStartingWith(letter, WordList.readNoun());
			
			
			System.out.println(i + ". " + pronoun() + " " + noun + " " + adverb + " " + verb + " " + pronoun() +  " "  + adjective + " " + noun);
			System.out.println("");	
			i++;
		}
	
	}

}
