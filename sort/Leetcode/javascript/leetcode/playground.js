//THIS
this.garage = {
  table: 'my table'
}

console.log(this.garage.table);

//LEXICAL ENVIRONMENT
/*
var userName = "frodo"
function displayName() {
  const location = "shire"
  console.log(userName);
  function displayLocation() {
    console.log(location);
  }
  displayLocation();

}

displayName();
*/

//HOISTING
/*
//ok
a = 2;
console.log(a);
var a;


//error
b = 2
console.log(b);
let b;
*/



//OBJECTS
/*
let user = {name: "david"}
let userTwo = {name: "david"}

var test = [['a',1],['b',2]];
var shallow_copy = test.slice();

console.log(test[0])
console.log(shallow_copy[0])

test[0][0] = 'new'

console.log(test[0])
console.log(shallow_copy[0])


var newy = ['a','b'];
var newy_copy = newy.slice();

console.log(newy)
console.log(newy_copy)
newy[0] = "changed!"
console.log(newy)
console.log(newy_copy)
*/

/*
//Shallow Copy
//Type 1: Spread Operator
const hero = {
  name: 'heroname',
  city: 'roseland'
};

const heroClone = {
  ...hero
};


console.log(hero.name);
console.log(heroClone.name);
heroClone.name = "new name"

console.log(hero.name);
console.log(heroClone.name);
*/

//CALL
/*
const person = {
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
  }
  const person1 = {
    firstName:"frodo",
    lastName: "baggins"
  }
  const person2 = {
    firstName:"bilbo",
    lastName: "baggins"
  }

let fullName = person.fullName.call(person2);
//console.log(fullName);

//With Arguments
const hobbit = {
    fullName: function(city, country) {
      return this.firstName + " " + this.lastName + "," + city + "," + country;
    }
  }
  
  const hobbit1 = {
    firstName:"frodo",
    lastName: "baggins"
  }
hobbit.fullName.call(person1, "shire", "middlearth");


//FUNCTIONS
function addOne(a,b) {
    return a + b;
}


// ES5
var addTwo = function(a, b) {
    return a + b;
 }
 
// ES6
const addThree = (a,b) =>  a + b;


//CLOSURES
/*
//Can make global variables local (private)
function myFunction() {
    let a = 4;
  return a * a;
}
//console.log(a);

function hiya() {
    var name = 'hiya'; // name is a local variable created by init
    function displayName() { // displayName() is the inner function, a closure
      console.log(name); // use variable declared in the parent function
    }
    displayName();
  }
  hiya();
*/
// Function to increment counter
/*
const add = (function () {
    let counter = 0;
    return function () {
        counter = counter + 1; 
        return counter
    }
  })
();
add()
add()
let output = add()
console.log(output)
*/
/*
function add() {
    let counter = 4;
    function plus() {
        counter = counter + 1;
    }
    plus();
    
    return counter; 
}

let output = add()
console.log(output)
*/



//let a = 2;
//let b = a;

//a = 7;
//console.log(a);




//ARROW FUNCTIONS
/*
console.log("hi")

let sum = (a,b) => {
    return a + b;
}

console.log(sum(4,2))
*/


//SCOPE
/*
sayHi();

function sayHi() { 
    var a = "hi";
}

console.log(a);

let a = "hi";

console
//sayHi();

/*let a = "hi";
function sayHi() {
    let a = "hoya";
    console.log(a);

}
console.log(a);
*/


//RANDOM




//FUNCTIONS
const mySum = function (a, b) {return a * b};
let theSum = mySum(4, 3);


//ARRAYS
/*
let arrayIntegers = [1, 2, 3, 4, 5];
let arrayIntegers1 = arrayIntegers.splice(0,2); // returns [1,2]

console.log(arrayIntegers);
console.log(arrayIntegers1);
*/



//HOISTING
/*
//ok
a = 2;
console.log(2);
var a;

//error
a = 2
console.log(2);
let a;

*/









//STORAGE
/*
localStorage.setItem('name', 'frodo');
const yourName = localStorage.getItem('name')
localStorage.removeItem('name')

localStorage.removeItem('name')

sessionStorage.setItem('name', 'sam')

document.cookie = 'name=merry; expires=' + new Date(2022,0,1).toUTCString();
*/

/*
let x = 7
try {
    if(x != 2) {
        throw "is empty";
    } else {

        console.log("ok");
    }
}catch(err) {
    console.log(err);
}
*/



//KMP 
/*
let s = "abcyyybcyy"
let m = "abc"


//STEP 1: Find if String Exists
let s = "ahiya"
let subString = "hi"
let startingPosition = 0;
let currentMatchCount = 0;
let subStringLength = subString.length

for (let i = 0; i < s.length; i++) {
    
    sChar = s.charAt(i);
    subStringChar = subString.charAt(startingPosition)
    
    //Case 1: The chars are not a match 
    if(sChar.localeCompare(subStringChar) != 0) {
        console.log("Not a match " + sChar + " " + subStringChar)
        
    //Case 2: The two Chars are a match
    } else {
        currentMatchCount = currentMatchCount + 1;
        console.log(currentMatchCount + " " + subStringLength)
        if(currentMatchCount == subStringLength) {
            console.log("FOUND")
        }
        console.log("Match " + sChar + " " + subStringChar)
        startingPosition = startingPosition  + 1;
    }
    
}

*/
//currentPlayer.localeCompare(playerTwo) == 0