import java.util.ArrayList;

public class Deck {
	
	public ArrayList<Card> getDeck() {
		return deck;
	}

	private ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>();
		setDeck();
	}
	
	private void setDeck() {
		for (int i=1; i<14; i++) {
			deck.add(new Card(Constants.Card_Diamond, i));
			deck.add(new Card(Constants.Card_Club, i));
			deck.add(new Card(Constants.Card_Spade, i));
			deck.add(new Card(Constants.Card_Heart, i));
		}
		deck.add(new Card(Constants.Card_Red_Joker, 14));
		deck.add(new Card(Constants.Card_Black_Joker, 14));
	}
}
