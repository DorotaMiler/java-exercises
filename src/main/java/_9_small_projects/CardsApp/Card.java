package _9_small_projects.CardsApp;

import java.util.Scanner;

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

    public void suitChoice() {
        System.out.println("Please follow below instructions:\n");
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("-----  Please choose one suit from below 4 options:-----\n");
        System.out.println("***    1. Clubs                                      ***");
        System.out.println("***    2. Diamonds                                   ***");
        System.out.println("***    3. Hearts                                     ***");
        System.out.println("***    4. Spades                                     ***");
        System.out.println("---------------------------------------------------------");
    }

    public void rankChoice() {
        System.out.println(":) thank you\n");
        System.out.println("------------------------------------------------------------");
        System.out.println("-----  Now please choose one rank from below 4 options:-----\n");
        System.out.println("***    1. Ace                                            ***");
        System.out.println("***    2. King                                           ***");
        System.out.println("***    3. Queen                                          ***");
        System.out.println("***    4. Jack                                           ***");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
    }

public int scanChoice(){
        Scanner scan = new Scanner(System.in);
        int chosenOption = scan.nextInt();
        return chosenOption;
}

@Override
    public String toString() {
        return Suit.
                "ran=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
