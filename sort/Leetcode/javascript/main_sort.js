//MAIN: This is for the Interview 
var animals = ['Beaver', 'Deer ','Badger'] 

//FOR LOOPS
for (let i = 0; i < animals.length; i++) {
  console.log(animals[i])
}

//Reverse Loop
for (let i = animals.length - 1; i >= 0; i--) {
  console.log(animals[i])
}

//For Each (no break or continue but can use filter )
animals.forEach(function (animal, index) {
  console.log(animal, index);
});

animals.forEach(animal => console.log(animal));
 
//For Loop 
for (const animal of animals){
    console.log(animal);
}

//MAP
const charMap = new Map();
charMap.set('a', 1);
charMap.set('b', 2);
charMap.set('a', 2);

for (const [key, value] of charMap.entries()) {
    console.log(key, value);
}
console.log(charMap)

//OBJECTS
//Sort Objects
let userOne = {
  userID: 1,
  userName: "david",
  location: "corvallis"
}

let userTwo = {
  userID: 2,
  userName: "sam",
  location: "shire"
}

let userThree = {
  userID: 3,
  userName: "frodo",
  location: "bag end"
}

var users = [userOne, userTwo, userThree];

for (var i = 0; i < users.length; i++) {
  //console.log(users[i].userID + " " + users[i].userName);
}

users.sort(sortByUserName);

for (var i = 0; i < users.length; i++) {
  //console.log(users[i].userID + " " + users[i].userName);
}

function sortByUserName(item_a, item_b) {
  if(item_a.userName < item_b.userName){
    return -1;
  }
  if(item_a.userName > item_b.userName){
    return 1;
  }
  return 0;
}


//NESTED OBJECTS
//Array of Values
var hobbiton = ["frodo", "sam"];
var bree = ["merry", "pippin"];
var minas_tirith = ["aragon", "faramir"];
var dol_amroth = ["elendil"];

//Associative Array with a list as value
var shire = {
    "hobbiton": hobbiton,
    "bree": bree
};

var gondor = {
    "minas_tirith": minas_tirith,
    "dol_amroth": dol_amroth
};

for (var village in shire) {
  if (shire.hasOwnProperty(village)) {
      console.log("PLACE: " + village);
  }
} 

//Loop over Associative Array
/*
for (var key in shire) {
    if (shire.hasOwnProperty(key)) {
        console.log("PLACE: " + key);
        let shirePeople = shire[key];
        console.log(shirePeople);
        
        for(let i = 0; i < shirePeople.length; i++) {
            console.log(shirePeople[i]);
        }
    }
} 
*/