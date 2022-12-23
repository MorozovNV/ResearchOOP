package number8_collections.collectionsClass;

import java.util.*;

public class CollectionsRunner {
    //интерфейс и класс - разные вещи
    public static void main(String[] args) {
        /* List<String> colors = new ArrayList<>();

        colors.add("yellow");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("red");

        System.out.println("List befor sorting " + colors);
        Collections.sort(colors); // естестевнная сортировка
        System.out.println("List after sorting " + colors);
         */

        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

        System.out.println("Original deck of cards");
        extracted(deckOfCards);

        Collections.shuffle(deckOfCards);

        System.out.println("\n\nCards after shuffle");
        extracted(deckOfCards);

        Collections.sort(deckOfCards, new CardComparator());

        System.out.println("\n\nCards after sort");
        extracted(deckOfCards);

    }

    private static void extracted(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}
