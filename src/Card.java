
public class Card {
private String card_type;
private int card_number;
public Card(String card_type, int card_number) {
	this.card_number = card_number;
	this.card_type = card_type;
}
public String getCard_type() {
	return card_type;
}
public void setCard_type(String card_type) {
	this.card_type = card_type;
}
public int getCard_number() {
	return card_number;
}
public void setCard_number(int card_number) {
	this.card_number = card_number;
}

}
