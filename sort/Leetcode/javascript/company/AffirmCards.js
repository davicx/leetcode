//Main Program 
var cardDeck = [] 
var players = [];
const SUITS = ["hearts", "spades", "diamonds", "clubs"]
const VALUES = ["2","3","4","5","6","7","8","9","10","J","Q","K","A"]


//CLASS: Players
var playerOne = {
    name: "davey",
    cards: []
}

var playerTwo = {
    name: "sam",
    cards: []
}

var playerThree = {
    name: "frodo",
    cards: []
}

var players = [playerOne, playerTwo];


//CARD DECK 
class Deck {
    constructor(cards = createCardDeck()) {
        this.cards = cards
    }

    shuffleCards() {
        for (let i = 0; i < this.cards.length; i++) {
            let randNum = i + getRandomInt(this.cards.length - i)
            var tempCard = this.cards[randNum];
            this.cards[randNum] = this.cards[i];
            this.cards[i] = tempCard;
        } 
    }

    showDeck() {
        this.cards.forEach(function (card, index) {
            console.log("Card " + card.faceValue + " " + card.suit);
        });
    }
}

class Card {
    constructor(suit, faceValue, actualValue) {
        this.suit = suit
        this.faceValue = faceValue
        this.actualValue = actualValue
    }
}

const deck = new Deck()
showDeck(deck.cards)
//deck.shuffleCards();
//cardDeck = deck.cards; 
//dealCards(players, cardDeck); 

//getDeckCount(players) 
//playHand(players);
//getDeckCount(players) 

function playHand(players) {
    let cardWinnings = []; 
    let handOne = {
        playerID: players[0].name,
        playerCard: players[0].cards.pop()
    }

    let handTwo = {
        playerID: players[1].name,
        playerCard: players[1].cards.pop()   
    }
    
    //showPlayerHand(players[0])
    //showPlayerHand(players[1])
    //console.log(players[0].name)
    //console.log(handOne.playerCard)

    //Tie
    if(handOne.playerCard == handTwo.playerCard) {
        
    //Hand One Wins
    } else if (handOne.playerCard > handTwo.playerCard) {

    //Hand Two Wins 
    } else {

    }

}

function createCardDeck(){
    return SUITS.flatMap(suit => {
        return VALUES.map(faceValue => {
            console.log(faceValue)
            let actualValue;
            if(faceValue== "J") {
                 actualValue = 11;
            } else if (faceValue== "Q") {
                 actualValue = 12;
            } else if (faceValue== "K") {
                 actualValue = 13;
            } else if (faceValue== "A") {
                 actualValue = 14;              
            } else {
                 actualValue = faceValue
            }
            return new Card(suit, faceValue, actualValue)
        })
    })
}

function dealCards(players, cardDeck) {
    const cardsToDeal = Math.floor(cardDeck.length / players.length)
    console.log(cardsToDeal);

    for (let i = 0; i < cardDeck.length; i++) {
        for (let j = 0; j < players.length; j++) {   
            const card = cardDeck[i + j];
            players[j].cards.push(card)
        }
        i = i + players.length - 1;
    }

}

function showDeck(cardDeck) {
    cardDeck.forEach(function (card, index) {
        console.log("Card " + card.faceValue + " " + card.suit + " " + card.actualValue);
    });
}

function showPlayerHand(currentPlayer) {
    currentPlayer.cards.forEach(function (card, index) {
        console.log("Card " + card.faceValue + " " + card.suit);
    });
}

function getDeckCount(players) {
    players.forEach(function (player, index) {
        console.log(player.name + " " + player.cards.length)
    }); 
}

function getRandomInt(max) {
    return Math.floor(Math.random() * max);
}


/*
//CLASS: Card Deck 

 
showPlayerHand(playerOne) 
console.log("______")
showPlayerHand(playerTwo) 
console.log("______")
showPlayerHand(playerThree) 

//getDeckCount(players) 




function isRoundWinner() {
    //push player card
    //push other player card

}
*/

 

/*

const players = [playerOne, playerTwo]

//cardDeck = createCardDeck(suits, totalCards)
//let shuffledCards = shuffleCards(cardDeck);
//setUpGame(players, shuffledCards);
//playGame(players);

function playGame(players) {
    const playerOne = players[0]
    const playerTwo = players[1]

    for (let i = 0; i < players[0].cards.length; i++) {
        console.log("Hand " + i)
        console.log(playerOne.name + " " + playerOne.cards[i].faceValue + " " + playerOne.cards[i].suit + " " + playerTwo.name + " " + playerTwo.cards[i].faceValue + " " + playerTwo.cards[i].suit)
        console.log()

    
        console.log("_________________")
       
    }

    //Get Card from top of deck while the user has cards 

    //Move Higher Card to Winners Deck

    //Unless there is a tie 


}









//Function A2: Shuffle the Deck 
function shuffleCards(cardDeck) {
    const length = cardDeck.length 
    for (let i = 0; i < length; i++) {
        let randNum = i + getRandomInt(length - i)
        var tempCard = cardDeck[randNum];
        cardDeck[randNum] = cardDeck[i];
        cardDeck[i] = tempCard;
    }
    return cardDeck
}



//Function A1: Create Card Deck
function createCardDeck(suits, totalCards){
    
    let cardDeck = [];
    let suitCardCount = totalCards / suits.length;

    for (let i = 0; i < suits.length; i++) {
        for (let j = 2; j <= suitCardCount + 1; j++) {
            let card = {
                faceValue: j,
                suit: suits[i],      
                actualValue: j
            }

            if(j == 11) {
                card.faceValue = "jack"
            } else if (j == 12) {
                card.faceValue = "queen"
            } else if (j == 13) {
                card.faceValue = "king"
            } else if (j == 14) {
                card.faceValue = "ace"                
            } else {
                card.faceValue = j;
            }
            cardDeck.push(card);
        }
    }
    return cardDeck;
}

//Function A2: Print the Deck
function printDeck(cardDeck) {
    for (let i = 0; i < cardDeck.length; i++) {
        const card = cardDeck[i];
        console.log("Card is the " + card.faceValue + " of " + card.suit + " with value [" + card.actualValue + "] " +  " at index " + i);
    }
}

//Function A4: Show Hand
function showHand(player) {
    console.log("Player " + player.name)
    for (let i = 0; i < player.cards.length; i++) {
        const card =  player.cards[i];
        console.log("Card is the " + card.faceValue + " of " + card.suit + " with value [" + card.actualValue + "] " +  " at index " + i);
    }
    console.log("Total Cards " + player.cards.length)
}


/*
    if(totalCards % suits.length != 0) { 
        return -1; 
    } 

*/

//Part 2: Players

//Part 3: Game 


//APPENDIX
/*
let card = {
    faceValue: "2",
    suit: "hearts",
    actualValue: 2
}

*/