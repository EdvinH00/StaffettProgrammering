package Active.PokerHands;

public enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;

    public static Suit getSuit(char value) {
        return switch (value) {
            case 'H' -> HEARTS;
            case 'D' -> DIAMONDS;
            case 'C' -> CLUBS;
            case 'S' -> SPADES;
            default -> throw new IllegalArgumentException();
        };
    }
}
