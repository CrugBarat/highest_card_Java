import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void before() {
        player = new Player("Jane Doe");
        card = new Card(CardSuit.CLUBS, CardValue.ACE);
    }

    @Test
    public void canGetName() {
        assertEquals("Jane Doe", player.getName());
    }

    @Test
    public void canCardsSizeToStartAtZero() {
        assertEquals(0, player.getCardsSize());
    }

    @Test
    public void canAddACard() {
        player.addCard(card);
        assertEquals(1, player.getCardsSize());
    }

}
