import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerGame {
 public static void main(String[] args) throws IOException {
	 Deck deck = new Deck();
	 Game game = new Game(3, deck);
	 Player jack = new Player("Jack");
	 Player kelci = new Player("Kelci");
	 Player emma = new Player("Emma");
	 
	 game.addPlayer(jack);
	 game.addPlayer(kelci);
	 game.addPlayer(emma);
	 
	 game.distributeCards();
	 for (int i=0; i<outPutWinner(game.getPlayers()).size(); i++) {
		 System.out.println("The winner is: " + outPutWinner(game.getPlayers()).get(i));
	 }
 }
 
 private static ArrayList<String> outPutWinner(ArrayList<Player> players){
	 ArrayList<String> winners = new ArrayList<String>();
	 HashMap<String, Integer> playerSum = new HashMap<String, Integer>();
	 for (Player player : players) {
		 int sum =0;
		 for (Card card : player.getHand()) {			
			 sum = sum + card.getCard_number();
		 }
		 playerSum.put(player.getName(), sum);
	 }
	 int max = Collections.max(playerSum.values());
	 for(String key : playerSum.keySet()){
	        if(playerSum.get(key) == max){
	        	winners.add(key);
	        }
	    }
	 return winners;
 }
}
