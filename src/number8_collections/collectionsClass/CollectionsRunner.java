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

    public static class Card implements Comparable<Card> {


        private enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS}

        private enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

        private final Suit suit;

        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {
            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);
            if (faces.indexOf(this.face) < faces.indexOf(card.face)) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.face)) {
                return +1;
            } else if (faces.indexOf(this.face) == faces.indexOf(card.face)) {
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
            }
            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }

    public static class CardComparator implements Comparator<Card> {
        List<Card.Face> faces = Arrays.asList(Card.Face.values());

        @Override
        public int compare(Card card1, Card card2) {
            if (faces.indexOf(card1.getFace()) < faces.indexOf(card2.getFace())) {
                return 1;
            } else if (faces.indexOf(card1.getFace()) > faces.indexOf(card2.getFace())) {
                return -1;
            } else if (faces.indexOf(card1.getFace()) == faces.indexOf(card2.getFace())) {
                return String.valueOf(card1.getSuit()).compareTo(String.valueOf(card2.getSuit()));
            }
            return 0;
        }
    }
}
