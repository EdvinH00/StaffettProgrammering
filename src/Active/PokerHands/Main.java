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
                        card.substring(0, 1))
                );
            }
            PokerHand black = new PokerHand(cards);
            System.out.println(black);

            List<Card> cards2 = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                var card = sc.nextLine();
                cards2.add(new Card(
                        Suit.getSuit(card.charAt(1)),
                        card.substring(0, 1))
                );
            }
            PokerHand white = new PokerHand(cards2);
            System.out.println(white);
            determineWinner(black, white);
            break;
        }
    }

    private static PokerHand determineWinner(PokerHand black, PokerHand white) {
        if (white.isStraight()) {

        }
        return black;
    }
}
