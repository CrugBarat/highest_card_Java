import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private Player player, player2;
    private Deck deck;
    private Card card1, card2;

    @Before
    public void before() {
        dealer = new Dealer("Jane Doe");
        player = new Player("Maverick");
        player2 = new Player("John");
        card1 = new Card(CardSuit.CLUBS, CardValue.ACE);
        card2 = new Card(CardSuit.CLUBS, CardValue.TEN);
        deck = new Deck();
        deck.addCards();
        deck.shuffleCards();
    }

    @Test
    public void canGetName() {
        assertEquals("Jane Doe", dealer.getName());
    }

    @Test
    public void canDealCard() {
        dealer.deal(player, deck);
        assertEquals(51, deck.getDeckSize());
        assertEquals(1, player.getCardsSize());
    }

    @Test
    public void canDeclareAWinnerPlayer1() {
        player.addCard(card1);
        player2.addCard(card2);
        assertEquals(player, dealer.declareWinner(player, player2));
    }

    @Test
    public void canDeclareAWinnerPlayer2() {
        player.addCard(card2);
        player2.addCard(card1);
        assertEquals(player2, dealer.declareWinner(player, player2));
    }



}
