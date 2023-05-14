package cards;

import tools.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class MainCards {
    public static void main(String[] args) {
        ArrayList<Card> deck = createDeck();

        for (Card card : deck) {
            //System.out.println(card.suit + " " + card.rank);
        }

        //SORT: Sort by Suit
        ArrayList<Card> hearts = sortIntoSuit(deck, "Hearts");
        hearts.forEach((card)->System.out.println(card.suit + " " + card.rank));
        System.out.println("");

        //SORT: Sort by Number
        hearts.sort(Comparator.comparing(Card::getNumber) );
        hearts.forEach((card)->System.out.println(card.suit + " " + card.rank));
        System.out.println("");

        //SORT: Reverse Number
        Collections.reverse(hearts);
        hearts.forEach((card)->System.out.println(card.suit + " " + card.rank));


        //deck.sort(Comparator.comparing(Card::getNumber) );
        //deck.forEach((card)->System.out.println(card.suit + " " + card.rank));

    }

    public static ArrayList<Card> sortIntoSuit(ArrayList<Card> deck, String suit) {
        ArrayList<Card> sortedDeck = new ArrayList<>();

        for (Card card : deck) {
            if(Objects.equals(card.suit, suit)){
                sortedDeck.add((card));
            }
        }

        return sortedDeck;
    }

    public static ArrayList<Card> createDeck() {
        Card one = new Card( "Hearts", 5, 5);
        Card two = new Card( "Spades", 9, 9);
        Card three = new Card( "Hearts", 3, 3);
        Card four = new Card( "Hearts", 7, 7);
        Card five = new Card( "Spades", 8, 8);

        ArrayList<Card> deck = new ArrayList<Card>();

        deck.add(one);
        deck.add(two);
        deck.add(three);
        deck.add(four);
        deck.add(five);

        return deck;

    }
}



/*

//Card Deck
const cards = [
    {
      suit: 'Hearts',
      rank: '3',
      number: '3'
    },
    {
      suit: 'Clubs',
      rank: '10',
      number: '10'
    },
    {
      suit: 'Spades',
      rank: 'Ace',
      number: '12'
    },
    {
      suit: 'Clubs',
      rank: 'Jack',
      number: '11'
    },
    {
      suit: 'Hearts',
      rank: '5',
      number: '5'
    },
    {
      suit: 'Hearts',
      rank: '4',
      number: '4'
    },
    {
      suit: 'Spades',
      rank: '5',
      number: '5'
    }
];


cards.forEach((card) => {
  console.log(card.suit + " " + card.rank)
});

//SORTING: Sort Cards
//Sort cards by Suit
cards.sort(sortBySuit);
console.log("_____")

function sortBySuit(card_a, card_b) {
  if(card_a.suit < card_b.suit){
    return -1;
  }
  if(card_a.suit > card_b.suit){
    return 1;
  }
  return 0;
}

//Sort Cards by Suit and then Number
cards.sort((a, b) => a.suit.localeCompare(b.suit) || a.number - b.number);

cards.forEach((card) => {
  console.log(card.suit + " " + card.rank)
});


 */