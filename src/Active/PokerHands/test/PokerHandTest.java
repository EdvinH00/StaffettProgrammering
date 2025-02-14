package Active.PokerHands.test;

import Active.PokerHands.Card;
import Active.PokerHands.PokerHand;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PokerHandTest {

    @org.junit.jupiter.api.Test
    void getHighestCard() {
        List<Card> cards = List.of(new Card("H", 5), new Card("S", 4), new Card("D", 3), new Card("H", 2), new Card("C", 1));
        PokerHand pokerHand = new PokerHand(cards);
        assertEquals(5, pokerHand.getHighestCard());
    }
}