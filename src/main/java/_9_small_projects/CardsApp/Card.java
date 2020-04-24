package _9_small_projects.CardsApp;

import java.util.Scanner;
import java.util.StringJoiner;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public static String getDescription(Card card) {
        StringJoiner joiner = new StringJoiner(" - ", "{", "}");
        String result = joiner.add(card.getRank().name().toLowerCase()).add(card.getSuit().name().toLowerCase()).toString();
        return result;
    }

    public static void intro{
        System.out.println("Let's create a card!");
        System.out.println("Please enter a rank name: ");
        scanner();
    }

    public static String scanRank{
        System.out.println("Please enter a rank name: ");
        Scanner scan = new Scanner(System.in);
        String rank = scan.nextLine();
        return rank;
    }

    public static String scanSuit{
        System.out.println("Please enter a suit name: ");
        Scanner scan = new Scanner(System.in);
        String suit = scan.nextLine();
        return suit;
    }


//    public String suitChoice() {
//        suitMenu();
//
//        boolean isCorrect = true;
//        while (isCorrect) {
//            int firstChoice = scanChoice();
//            switch (firstChoice) {
//                case 1:
//                    return Suit.CLUBS.name();
//                break;
//                case 2:
//                    return Suit.DIAMONDS.name();
//                break;
//                case 3:
//                    return Suit.HEARTS.name();
//                break;
//                case 4:
//                    return Suit.SPADES.name();
//                break;
//            }
//        }
//        return (rank.toString() + " - " + suit.name().)
//    }

//    getRankChoice() {
//        rankMenu();
//        boolean isCorrect = true;
//        while (isCorrect) {
//            int secondChoice = scanChoice();
//            switch (secondChoice) {
//                case 1:
//                    return Rank.ACE.name();
//                break;
//                case 2:
//                case 2:
//                    return Rank.KING.name();
//                break;
//                case 3:
//                    return Rank.QUEEN.name();
//                break;
//                case 4:
//                    return Rank.JACK.name();
//                break;
//            }
//            return (rank.toString() + " - " + rank.name().)
//        }
}

//    public void suitMenu() {
//        System.out.println("Please follow below instructions:\n");
//        System.out.println("--------------------------------------------------------");
//        System.out.println("--------------------------------------------------------");
//        System.out.println("-----  Please choose one suit from below 4 options:-----\n");
//        System.out.println("***    1. Clubs                                      ***");
//        System.out.println("***    2. Diamonds                                   ***");
//        System.out.println("***    3. Hearts                                     ***");
//        System.out.println("***    4. Spades                                     ***");
//        System.out.println("---------------------------------------------------------");
//    }
//
//    public void rankMenu() {
//        System.out.println(":) thank you\n");
//        System.out.println("------------------------------------------------------------");
//        System.out.println("-----  Now please choose one rank from below 4 options:-----\n");
//        System.out.println("***    1. Ace                                            ***");
//        System.out.println("***    2. King                                           ***");
//        System.out.println("***    3. Queen                                          ***");
//        System.out.println("***    4. Jack                                           ***");
//        System.out.println("------------------------------------------------------------");
//        System.out.println("------------------------------------------------------------");
//    }
//
    public int scanChoice() {
        Scanner scan = new Scanner(System.in);
        int chosenOption = scan.nextInt();
        return chosenOption;
    }
//
//    @Override
//    public String toString() {
//        return "Card{" +
//                "rank=" + rank +
//                ", suit=" + suit +
//                '}';
//    }
//}