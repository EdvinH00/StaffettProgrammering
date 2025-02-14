package Active.PokerHands;

public enum Ranking {
    STRAIGHT_FLUSH(9),
    FOUR_OF_A_KIND(8),
    FULL_HOUSE(7),
    FLUSH(6),
    STRAIGHT(5),
    THREE_OF_A_KIND(4),
    TWO_PAIR(3),
    PAIR(2),
    HIGH_CARD(1);

    private final int value;

    Ranking(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
