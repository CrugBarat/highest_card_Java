import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public int getDeckSize() {
        return this.deck.size();
    }

    public void addCards() {
        for (int i = 0; i < 13; i++) {
            CardValue value = CardValue.values()[i];
            for (int j = 0; j < 4; j++) {
                Card card = new Card(CardSuit.values()[j], value);
                this.deck.add(card);
            }
        }
    }
}
