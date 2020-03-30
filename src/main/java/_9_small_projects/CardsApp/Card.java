package _9_small_projects.CardsApp;

public class Card {
    private Rank rank;
    private Suit suit;

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    getDescription(Rank rank, Suit suit) {
        return (rank.toString() + " - " + suit.name().)

    }

    public void rankChoice() {
        System.out.println("Please follow below instructions:\n");
        System.out.println("--------------------------------------------------------");
        System.out.println("-----  Please choose one suit from below 4 options:-----\n");
        System.out.println("***    1. Clubs                                      ***");
        System.out.println("***    2. Diamonds                                   ***");
        System.out.println("***    3. Hearts                                     ***");
        System.out.println("***    4. Spades                                     ***");
        System.out.println("---------------------------------------------------------");
    }

}
