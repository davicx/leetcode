package cards;

public class Card {
    public String suit;
    public Integer rank;
    public Integer number;

    public Card(String suit, Integer rank, Integer number) {
        this.suit = suit;
        this.rank = rank;
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getNumber() {
        return number;
    }

}

