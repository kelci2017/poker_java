import java.util.ArrayList;
import java.util.Random;

public class Game {
private int cards;
private ArrayList<Player> players;
private Deck deck;
public Game(int cards, Deck deck) {
	players = new ArrayList<Player>();
	this.deck = deck;
	this.cards = cards;
}
public Deck getDeck() {
	return deck;
}
public void setDeck(Deck deck) {
	this.deck = deck;
}
public void setPlayers(ArrayList<Player> players) {
	this.players = players;
}
public int getCards() {
	return cards;
}
public void setCards(int cards) {
	this.cards = cards;
}
public void addPlayer(Player player){
	players.add(player);
}
public ArrayList<Player> getPlayers(){
	return players;
}
public void distributeCards() {
	Random rand = new Random(); 
	if (cards < 1) cards = 5;
	
	for (Player player : players) {
		ArrayList<Card> hand = new ArrayList<Card>();
		for (int j=0; j<cards; j++) {
			Card card = deck.getDeck().remove(rand.nextInt(deck.getDeck().size()));
			hand.add(card);
			System.out.println(player.getName() + " " + card.getCard_type() + " " + card.getCard_number());
		}
		player.setHand(hand);
	}
}
}
