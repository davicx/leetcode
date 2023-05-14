//USE STRICT 
"use strict";
/*
num = 2; 
1) This will cause a reference error with use strict

const d = 1;
console.log(d)
d = 2
console.log(d)
Syntax Error

*/

//VARIABLE TYPES
/*
1) Primitives
Pass by Value
- string
- number
- bigint
- boolean
- undefined
- symbol
- null
2) Objects
3) Functions
*/


//HOISTING 
/*
1) Hoisting is JavaScript's default behavior of moving all declarations to the top of the current scope 
(to the top of the current script or the current function)
2) Variables defined with let and const are hoisted to the top of the block, but not initialized.
*/
//Works 
/*
hi = "hi";
//console.log(hi)

var hi;
*/
//PASS BY VALUE AND REFERENCE
let a = 10
let b = "hi"
let c = [1,2]
let d = c 
d[0] = 77

//C and D point to same object
//console.log(c);
//console.log(d);

d = [12]
//Now we have a new address so two new arrays
//console.log(c);
//console.log(d);

//MUTABLE VS IMMUTABLE
/*
1) Primitiives are immutable 
2) Reassignment is not the same so we can reassign a value
let me = "hi"
me[0] = "m" //nope
me = "hiya" //ok

3) Structures are mutable

*/

//SHALLOW VS DEEP COPY
/*
Create a Shallow Copy
1) Use Spread Operator 
2) Object.assign
- This does not work for a nested object

Create a Deep Copy
1) JSON parse and stringify
2) Lodash
3) Structured Clone
*/

var animals = ['Beaver', 'Deer ','Badger'] 
var moreAnimals = [...animals, 'Kangaroo']
var newAnimals = Object.assign([], animals)


//CLOSURES
/*
//Lexical Scope 
A closure is a function having access to the parent scope, even after the parent function has closed.
1) Nested funtions have access to scope of the parent which is often confused with closure 
2) Lexical scope is only a part of closure
3) Defined when we make function
*/
//Global Scope
//Example 1: Not a closure
/*
let hi = "hi";

const parentFunction = () => {
    let hello = "hello"
    console.log(hello)
    console.log(hi)

    //Has access to parent and global (Lexical Scope)
    const childFunction = () => {
        console.log(hi + "hi")
        console.log(hello + "hello")
    }

    childFunction()

}

parentFunction()
*/

//Example 2: A closure
let hi = "hi";


const add = (function () {
    let counter = 0;
    return function () {counter += 1; return counter}
  })();

const parentFunction = () => {
    let hello = "hello"
    console.log(hello)
    console.log(hi)

    //Has access to parent and global (Lexical Scope)
    const childFunction = () => {
        console.log(hi + "hi")
        console.log(hello + "hello")
    }

    return childFunction();

}

//const result = parentFunction();

function numberGenerator() {
    console.log("parent")
    // Local “free” variable that ends up within the closure
    var num = 1;
    function checkNumber() { 
      console.log(num);
    }
    num++;
    return checkNumber;
  }
  
  var number = numberGenerator();
  number(); // 2