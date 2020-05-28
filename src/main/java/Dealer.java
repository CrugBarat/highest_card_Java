public class Dealer {

    private String name;

    public Dealer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void deal(Player player, Deck deck) {
        player.addCard(deck.dealCard());
    }

    public Player declareWinner(Player player1, Player player2) {
        if (player1.handTotal() != player2.handTotal()) {
            if (player1.handTotal() > player2.handTotal()) {
                return player1;
            } else {
                return player2;
            }
        } return null;
    }

}
