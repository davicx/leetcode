let myUser = {
    name: "david",
    location: "shire"
}

let samUser = myUser;
samUser.name = "sam"

//console.log(myUser.name + " " + samUser.name)

//Create a New Object from another One
const frodoUser = Object.create(samUser);
frodoUser.name = "frodo";
console.log(frodoUser.name, samUser.name);
//console.log(frodoUser.location);



//Combine Two Objects
const target = { a: 1, b: 2 };
const source = { b: 4, c: 5 };

const returnedTarget = Object.assign(target, source);

//console.log(target);
//console.log(returnedTarget);



/*







let shallowArray = ["davey", "frodo"]
let deepArray = ["davey", ["sam", "frodo"], {'object': 'itsvalue'}]

//Primitives (Pass by Value)
let davey = "davey";
let sam = davey;
sam = "sam"

//Arrays: (Pass By Reference)
let shallowArray = ["davey", "frodo"];
let newArray = shallowArray;

newArray[1] = "sam";

let c = [1,2]
let d = c
console.log("original " + d, c)

d.push(3)
console.log(c==d);
console.log(c===d);

console.log("next " + d, c)

//d = [3,4,5]
d = [1,2,3]
//console.log("final " + d, c)
console.log("D " + d)



 


//console.log(shallowArray,newArray);

//Object 
let myUser = {
    name: "david"
}

let newUser = myUser;
newUser.name = "sam"

//console.log(myUser.name, newUser.name);
*/
