import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

        private Deck deck, deck2;
        private Card card;

        @Before
        public void before() {
            deck = new Deck();
            deck2 = new Deck();
            card = new Card(CardSuit.CLUBS, CardValue.ACE);
        }

        @Test
        public void canGetDeckSizeStartAtZero() {
            assertEquals(0, deck.getDeckSize());
        }

        @Test
        public void canGetDeckSizeFullDeck() {
            deck.addCards();
            assertEquals(52, deck.getDeckSize());
        }

        @Test
         public void canDealACard() {
            deck.addCards();
            deck.dealCard();
            assertEquals(51, deck.getDeckSize());
        }


}
