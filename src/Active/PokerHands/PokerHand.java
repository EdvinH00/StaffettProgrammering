package Active.PokerHands;

import java.util.ArrayList;
import java.util.List;

public class PokerHand {

    private final List<Card> cards;

    public PokerHand(List<Card> cards) {
        this.cards = cards;
    }

    public int getHighestCard() {
        return cards.stream()
                .map(Card::value)
                .max(Integer::compareTo)
                .get();
    }

    public boolean getPair() {
        // 4 4 5 6 2
        List<Integer> values = new ArrayList<>(cards.stream()
                .map(card -> card.value())
                .toList());
        values.sort(Integer::compareTo);
        // 2 4 4 6 6

        for (int i = 0; i < values.size() - 1; i++) {
            if (values.get(i).equals(values.get(i + 1))) {
                return true;
            }
        }

        return false;
    }

    public boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    public boolean isFullHouse() {
        return false;
    }

    public boolean isFlush() {
        return false;
    }

    public boolean isStraight() {
        return false;
    }

    public boolean isTwoPair() {
        return false;
    }

    public boolean isThreeOfAKind() {
        return false;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
