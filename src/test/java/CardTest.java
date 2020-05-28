import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before() {
        card = new Card(CardSuit.CLUBS, CardValue.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals(CardSuit.CLUBS, card.getSuit());
    }

    @Test
    public void canGetValue() {
        assertEquals(CardValue.ACE, card.getValue());
    }

}
