package cards;

import tools.User;

import java.util.ArrayList;
import java.util.Comparator;

public class MainCards {
    public static void main(String[] args) {
        Card one = new Card( "Hearts", 1, 1);
        Card two = new Card( "Spades", 2, 2);
        Card three = new Card( "Hearts", 3, 3);

        ArrayList<Card> deck = new ArrayList<Card>();

        deck.add(one);
        deck.add(two);
        deck.add(three);

        for (Card card : deck) {
            System.out.println(card.suit + " " + card.rank);
        }

        System.out.println();
        deck.sort(Comparator.comparing(Card::getNumber) );
        deck.forEach((card)->System.out.println(card.suit + " " + card.rank));
    }
}

/*
Card four = new Card( "Hearts", 4, 4);
Card five = new Card( "Hearts", 5, 5);
deck.add(four);
deck.add(five);
 */



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