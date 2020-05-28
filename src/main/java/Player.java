import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public int getCardsSize() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }


}
