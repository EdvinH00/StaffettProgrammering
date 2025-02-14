package Active.PokerHands;

import java.util.ArrayList;
import java.util.List;

public class PokerHand {

    private List<Card> cards;

    public PokerHand(List<Card> cards) {
        this.cards = cards;
    }

    public int getHighestCard() {
        List<Integer> values = cards.stream().map(card -> card.value).toList();
        return values.stream().max(Integer::compareTo).get();
    }

    public boolean getPair() {
        // 4 4 5 6 2
        List<Integer> values = new ArrayList<>(cards.stream().map(card -> card.value).toList());
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
}
