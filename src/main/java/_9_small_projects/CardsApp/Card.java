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

//    public static String getDescription() {
//        StringJoiner joiner = new StringJoiner(" - ", "{ ", " }");
//        String result = joiner.add(getRankChoice().toLowerCase()).add(getSuitChoice().toLowerCase()).toString();
//        return result;
//    }
//        StringJoiner joiner = new StringJoiner(" - ", "{", "}");
//        String result = joiner.add(card.getRank().name().toLowerCase()).add(card.getSuit().name().toLowerCase()).toString();
//        return result;
//    }

    public static String getDescription() {
        intro();
        rankMenu();
        String rankChoice = getRankChoice();
        suitMenu();
        String suitChoice = getSuitChoice();
        StringJoiner joiner = new StringJoiner(" - ", "{ ", " }");
        String result = joiner.add(rankChoice.toLowerCase()).add(suitChoice.toLowerCase()).toString();
        return result;
    }

    public static int scanChoice() {
        Scanner scan = new Scanner(System.in);
        int chosenOption = scan.nextInt();
        return chosenOption;
    }

    public static void intro() {
        System.out.println("Let's create a card!");
    }


    public static String getSuitChoice() {
        String chosenSuit = "";
        switch (scanChoice()) {
            case 1:
                chosenSuit = Suit.CLUBS.name();
                break;
            case 2:
                chosenSuit = Suit.DIAMONDS.name();
                break;
            case 3:
                chosenSuit = Suit.HEARTS.name();
                break;
            case 4:
                chosenSuit = Suit.SPADES.name();
                break;
        }
        return chosenSuit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    public static String getRankChoice() {
        String chosenRank = "";
        switch (scanChoice()) {
            case 1:
                chosenRank = Rank.ACE.name();
                break;
            case 2:
                chosenRank = Rank.KING.name();
                break;
            case 3:
                chosenRank = Rank.QUEEN.name();
                break;
            case 4:
                chosenRank = Rank.JACK.name();
                break;
        }
        return chosenRank;
    }

    public static void rankMenu() {
        System.out.println("------------------------------------------------------------");
        System.out.println("-----  Please choose a rank from below 4 options:      -----\n");
        System.out.println("***    1. Ace                                            ***");
        System.out.println("***    2. King                                           ***");
        System.out.println("***    3. Queen                                          ***");
        System.out.println("***    4. Jack                                           ***");
        System.out.println("------------------------------------------------------------");
    }

    public static void suitMenu() {
        System.out.println(":) thank you\n");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("-----  now please choose one suit from below 4 options:-----\n");
        System.out.println("***    1. Clubs                                          ***");
        System.out.println("***    2. Diamonds                                       ***");
        System.out.println("***    3. Hearts                                         ***");
        System.out.println("***    4. Spades                                         ***");
        System.out.println("------------------------------------------------------------");
    }
}