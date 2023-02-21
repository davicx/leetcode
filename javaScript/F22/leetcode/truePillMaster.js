/* 
Given a random subset of a standard deck of cards, return the length of the longest straight flush.
A standard deck of cards contains a total of 52 cards with 4 suits (Spades, Hearts, Clubs, Diamonds) 
and 13 cards for each suit (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King).
A straight flush is a set of cards that have the same suit and are in sequential order. 
The minimum hand size for this problem is 1.
 */


const testCards1 = [
  {
    suit: 'Hearts',
    rank: '3'
  },
  {
    suit: 'Clubs',
    rank: '10'
  },
  {
    suit: 'Spades',
    rank: 'Ace'
  },
  {
    suit: 'Clubs',
    rank: 'Jack'
  },
  {
    suit: 'Hearts',
    rank: '5'
  },
  {
    suit: 'Hearts', 
    rank: '4'
  }
]


console.log(testCards1[0]);


// [ testCards1 ] Expected Result: 3 ( Hearts 3-4-5 )

const testCards2 = [
  {
    suit: 'Spades',
    rank: '5'
  },
  {
    suit: 'Clubs',
    rank: '10'
  },
  {
    suit: 'Clubs',
    rank: 'Ace'
  },
  {
    suit: 'Hearts',
    rank: '2'
  },
  {
    suit: 'Diamonds',
    rank: '2'
  },
  {
    suit: 'Spades',
    rank: '6'
  }
]


// [ testCards2 ] Expected Result: 2 ( Spades 5-6 )

 const testCards3 = [
   {
     suit: 'Diamonds',
     rank: 'Ace'
   },
   {
     suit: 'Spades',
     rank: '3'
   },
   {
     suit: 'Diamonds',
     rank: 'Jack'
   },
   {
     suit: 'Hearts',
     rank: '4'
   },
   {
     suit: 'Clubs',
     rank: '5'
   },
   {
     suit: 'Diamonds',
     rank: '6'
   }
 ]
// [ testCards3 ] Expected Result: 1 ( None/Any )

 const testCards4 = [
   {
     suit: 'Spades',
     rank: '4'
   },
   {
     suit: 'Diamonds',
     rank: '3'
   },
   {
     suit: 'Diamonds',
     rank: 'Jack'
   },
   {
     suit: 'Spades',
     rank: '8'
   },
   {
     suit: 'Hearts',
     rank: '2'
   },
   {
     suit: 'Diamonds',
     rank: 'Ace'
   },
   {
     suit: 'Clubs',
     rank: '6'
   },
   {
     suit: 'Spades',
     rank: '6'
   },
   {
     suit: 'Diamonds',
     rank: '9'
   },
   {
     suit: 'Clubs',
     rank: '3'
   },
   {
     suit: 'Spades',
     rank: '5'
   },
   {
     suit: 'Clubs',
     rank: '7'
   },
   {
     suit: 'Hearts',
     rank: '10'
   },
   {
     suit: 'Spades',
     rank: '7'
   }
   
 ]
// [ testCards4 ] Expected Result: 5 ( Spades 4-5-6-7-8 )
 
  const testCards5 = [
   {
     suit: 'Diamonds',
     rank: 'King'
   },
   {
     suit: 'Diamonds',
     rank: 'Queen'
   },
   {
     suit: 'Spades',
     rank: '3'
   },
   {
     suit: 'Diamonds',
     rank: '9'
   },
   {
     suit: 'Diamonds',
     rank: '8'
   },
   {
     suit: 'Diamonds',
     rank: 'Jack'
   }
 ]
// [ testCards5 ] Expected Result: 3 ( Diamonds Jack-Queen-King )
  
var hearts = {
  cardSuite: []
}
  
for (let i = 0; i < testCards1.length; i ++) {
  if(testCards1[i].suit == 'Hearts') {
    
    let cardNumber = 0; 
             
    if (testCards1[i].suit == 'Jack') {
      cardNumber = 11;
    } else if(testCards1[i].suit == 'Queen') {
      cardNumber = 12;
    } else if(testCards1[i].suit == 'King') {
      cardNumber = 13;
    } else if(testCards1[i].suit == 'Ace') {
      cardNumber = 1;
    } else {
      cardNumber = testCards1[i].rank;
    }
    
    hearts.cardSuite.push(cardNumber);  
  }  
    
}

hearts.cardSuite.sort();

let maxCount = 0;

for (let i = 0; i < hearts.cardSuite.length; i ++) {
  console.log(hearts.cardSuite[i]);
  let num = hearts.cardSuite[i];
  


  if(num == hearts.cardSuite[i + 1] - 1) {
      maxCount = maxCount + 1;
 
    } else {
      maxCount = 0;
      console.log(maxCount);
    }
  }    

 





  

 
 
  
  
  
   
  
  
  
  
  
  
  
  
  
  
  
  
  