import java.util.ArrayList;

public class CreatePlayer {

	static ArrayList<String> players = new ArrayList<String>();
	
	static void setPlayer(String name) {
		players.add(name);
	}
	
	static String getPlayer() {
		
		if(players.size() < 1) {
			return null;
		}
		for(int i = 0 ; i < players.size(); i++){
			players.get(i);
			System.out.print("#" + i + " " + players + ", ");
		}
		
	}
	
	static void teamOne() {
		ArrayList<String>teamPlayers = new ArrayList<String>();
		
		for (int i = 0; i < 13; i++){
			
		}
		
		
		
		
		
		
		
		
		
		
	
}
