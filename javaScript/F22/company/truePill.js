const a = [1,2,4,5,6,7,9]

const answer = longestSequence(a)
console.log(answer);

function longestSequence(a) {
  if(a.length == 0) {
    return 0;
  } else if (a.length == 1) {
    return 1;
  } 

  var longestSequence = 0;
  var sequenceSet = new Set();
  let currentNum = a[0];
  let previousNum = -10;

  for (let i = 0; i < a.length; i++) {
    if(i !== 0) {
      currentNum = a[i]
      previousNum = a[i-1]
    }

    if(currentNum - previousNum == 1 || i == 0) {
      sequenceSet.add(currentNum);
    } else {
      longestSequence = Math.max(longestSequence, sequenceSet.size)
      sequenceSet.clear();
    }
    //console.log(a[i] + " " + currentNum + " " + previousNum);
    //console.log(sequenceSet);
    //console.log(sequenceSet.size);
    //console.log("______")
  }

  return longestSequence;
  
}






const testCards = [
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
];


testCards.forEach((card) => {
  console.log(card.suit + " " + card.rank)
});




/*

const hearts = findStraightFlush(testCards);
const longestHeart = findLongestCount(hearts);
console.log("LONGEST! " + longestHeart);

function findLongestCount() {
  var maxCount = 0;
  let count = 0;
  
  for (let i = 0; i < hearts.cardNums.length; i++) {
    if(hearts.cardNums[i] != 0) {
      count++;
      maxCount = Math.max(count, maxCount);
      console.log("count " + i + " " + hearts.cardNums[i])
    } else {
      count = 0;
      console.log("dont count " + i + " " + hearts.cardNums[i])
    } 
  }  
  return maxCount;
}



function findStraightFlush(testCards) {
  let cardNums = Array(14).fill(0)

  var hearts = {
    cardNums: cardNums
  }
  
  for (let i = 0; i < testCards.length; i++) {
    let cardNum = convertCardToNumber(testCards[i].rank)
    //console.log(testCards[i].suit + " " + testCards[i].rank + " " + cardNum);
    if(testCards[i].suit.toLowerCase() === "hearts") {
      hearts.cardNums[cardNum] = cardNum
    }
    //console.log(hearts.cardNums)
  }

  return hearts
}




//Jack, Queen, King
function convertCardToNumber(card) {
  if(card.toLowerCase() === "ace") {
    return 1;
  } else if(card.toLowerCase() === "jack") {
    return 11;
  } else if(card.toLowerCase() === "queen") {
    return 12;
  } else if(card.toLowerCase() === "king") {
    return 13;
   } else {
    return card;
  }
}


//Four Suits
//Numbers 1 to 13



*/
/*
function findStraightFlush(testCards) {
  var heartsCount = []
  var clubsCount = []
  var spadesCount = []
  var diamondsCount = []

  for(let i = 0; i < 15; i++) {
    heartsCount[i] = -1;
  }

  for (let i = 0; i < testCards.length; i++) {
  
    //Spades, Hearts, Clubs, Diamonds
    if(testCards[i].suit.toLowerCase() === "hearts") {
      let rankNum = parseInt(testCards[i].rank);
      heartsCount[rankNum] = rankNum;
      //console.log("hearts " + rankNum + " " + testCards[i].suit);
    } else if(testCards[i].suit.toLowerCase() === "spades") {
      let rankNum = parseInt(testCards[i].rank);
      spadesCount[rankNum] = rankNum;
      //console.log("spades " + testCards[i].rank + " " + testCards[i].suit);
    } else if(testCards[i].suit.toLowerCase() === "clubs") {
      let rankNum = parseInt(testCards[i].rank);
      clubsCount[rankNum] = rankNum;
      //console.log("clubs " + testCards[i].rank + " " + testCards[i].suit);
    } else if(testCards[i].suit.toLowerCase() === "diamonds") {
      let rankNum = parseInt(testCards[i].rank);
      diamondsCount[rankNum] = rankNum;
      //console.log("diamonds " + testCards[i].rank + " " + testCards[i].suit);
    } else {
      console.log("error");
    }
    
  }
  

  //Loop Over Arrays
  console.log("hearts")
  for(let i = 0; i < heartsCount.length; i++) {
    console.log(heartsCount[i])
  }
  console.log("clubs")
  for(let i = 0; i < clubsCount.length; i++) {
    console.log(clubsCount[i])
  }
  console.log("spades")
  for(let i = 0; i < spadesCount.length; i++) {
    console.log(spadesCount[i])
  }
  console.log("diamonds")
  for(let i = 0; i < diamondsCount.length; i++) {
    console.log(diamondsCount[i])
  }
  
}


*/