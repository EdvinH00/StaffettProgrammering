package Active.PokerHands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            List<Card> cards = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                var card = sc.nextLine();
                cards.add(new Card(
                        Suit.getSuit(card.charAt(1)),
                        card.charAt(0))
                );
            }
            PokerHand black = new PokerHand(cards);
            System.out.println(black);
        }
    }
}
