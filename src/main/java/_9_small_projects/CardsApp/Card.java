package _9_small_projects.CardsApp;

import java.util.Scanner;
import java.util.StringJoiner;

public class Card {
    private Rank rank;
    private Suit suit;

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getDescription(Rank rank, Suit suit) {

        StringJoiner joiner = new StringJoiner(" - ", "{", "}");
        String result = joiner.add("Dorota").add("is").add("ill").add("and").add("stays").add("home").toString();
        System.out.println(result);
    }


    public String suitChoice() {
        suitMenu();

        boolean isCorrect = true;
        while (isCorrect) {
            int firstChoice = scanChoice();
            switch (firstChoice) {
                case 1:
                    return Suit.CLUBS.name();
                break;
                case 2:
                    return Suit.DIAMONDS.name();
                break;
                case 3:
                    return Suit.HEARTS.name();
                break;
                case 4:
                    return Suit.SPADES.name();
                break;
            }
        }
        return (rank.toString() + " - " + suit.name().)
    }

    getRankChoice() {
        rankMenu();
        boolean isCorrect = true;
        while (isCorrect) {
            int secondChoice = scanChoice();
            switch (secondChoice) {
                case 1:
                    return Rank.ACE.name();
                break;
                case 2:
                    return Rank.KING.name();
                break;
                case 3:
                    return Rank.QUEEN.name();
                break;
                case 4:
                    return Rank.JACK.name();
                break;
            }
            return (rank.toString() + " - " + rank.name().)
        }
    }

    public void suitMenu() {
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

    public void rankMenu() {
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

    public int scanChoice() {
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