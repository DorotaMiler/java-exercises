package _9_small_projects.CardsApp;

public class CardApp {
    public static void main(String[] args) {

        Card card1 = new Card(Rank.ACE, Suit.DIAMONDS);
        Card card2 = new Card(Rank.KING, Suit.HEARTS);
        System.out.println(Card.getDescription(card1));
        System.out.println(Card.getDescription(card2));

    }
}