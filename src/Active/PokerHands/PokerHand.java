package Active.PokerHands;

import java.util.ArrayList;
import java.util.List;

public class PokerHand {

    private final List<Card> cards;
    private Ranking ranking;

    public PokerHand(List<Card> cards) {
        this.cards = cards;
        calcRanking();
    }

    private void calcRanking() {
        if (this.isStraightFlush()) {
            ranking = Ranking.STRAIGHT_FLUSH;
        }
        else if (this.isFourOfAKind()) {
            ranking = Ranking.FOUR_OF_A_KIND;
        }
        else if (this.isFullHouse()) {
            ranking = Ranking.FULL_HOUSE;
        }
        else if (this.isFlush()) {
            ranking = Ranking.FLUSH;
        }
        else if (this.isStraight()) {
            ranking = Ranking.STRAIGHT;
        }
        else if (this.isThreeOfAKind()) {
            ranking = Ranking.THREE_OF_A_KIND;
        }
        else if (this.isTwoPair()) {
            ranking = Ranking.TWO_PAIR;
        }
        else if (this.isPair()) {
            ranking = Ranking.PAIR;
        }
        else {
            ranking = Ranking.HIGH_CARD;
        }

    }

    public int getHighestCard() {
        return cards.stream()
                .map(Card::value)
                .max(Integer::compareTo)
                .get();
    }

    public boolean isPair() {
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

    public boolean isFourOfAKind() {
        List<Integer> values = new ArrayList<>(cards.stream()
                .map(card -> card.value())
                .toList());

        // glhf
    }

    public boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
