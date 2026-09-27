enum Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
    QUEEN, KING, ACE
}

enum Suite {
    DIAMONDS, CLUBS, HEARTS, SPADES
}
class Card {
    private Rank rank;
    private Suite suite;

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }
}

public class CardUtil {
    public static final Rank HIGHEST_RANK = Rank.ACE;
    public static final Suite HIGHEST_SUITE = Suite.SPADES;

    public static boolean isHighestCard(Card c) {
        return (c.getRank() == HIGHEST_RANK) && (c.getSuite() == HIGHEST_SUITE);
    }
}
