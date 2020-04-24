package _9_small_projects.CardsApp;

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
}