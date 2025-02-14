package Active.PokerHands;

import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit,
                   int value) {
    static List<String> valueList = List.of(
            "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"
    );
    public Card {

    }

    public Card (Suit suit, String character){
        this(suit, valueList.indexOf(character)+2);
    }
}
