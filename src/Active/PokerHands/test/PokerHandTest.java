package Active.PokerHands.test;

import Active.PokerHands.Card;
import Active.PokerHands.PokerHand;
import Active.PokerHands.Suit;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerHandTest {

    @Test
    void getHighestCard() {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, 5),
                new Card(Suit.SPADES, 4),
                new Card(Suit.DIAMONDS, 3),
                new Card(Suit.HEARTS, 2),
                new Card(Suit.CLUBS, 1));
        PokerHand pokerHand = new PokerHand(cards);
        assertEquals(5, pokerHand.getHighestCard());
    }

    @Test
    void getHighestCardWithSuitedValue() {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, 'K'),
                new Card(Suit.SPADES, 4),
                new Card(Suit.DIAMONDS, 3),
                new Card(Suit.HEARTS, 2),
                new Card(Suit.CLUBS, 1));
        PokerHand pokerHand = new PokerHand(cards);
        assertEquals(13, pokerHand.getHighestCard());
    }
}