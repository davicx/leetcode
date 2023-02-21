//Sorting
var frodo = {
    name: "frodo",
    city: "shire"
}

var sam = {
    name: "sam",
    city: "hobbiton"
}

var merry = {
    name: "merry",
    city: "brandybuck"
}

let people = [frodo, sam, merry]

for (let i = 0; i < people.length; i++) {
    console.log("Current List " + people[i].city);
}

people.sort((a, b) => (a.city > b.city) ? 1 : -1)

console.log("__________")
for (let i = 0; i < people.length; i++) {
    console.log("Sorted by City  " + people[i].name + " " + people[i].city);
}


//Counting by Property
var countMap = {
    "name": 0
}

//Simple 
/*
let newPerson = "David"
if(countMap.hasOwnProperty(newPerson)) {
    let currentCount = countMap[newPerson];
    countMap[newPerson] = currentCount + 1;
} else {
    countMap[newPerson] = 1;
}

if(countMap.hasOwnProperty(newPerson)) {
    let currentCount = countMap[newPerson];
    countMap[newPerson] = currentCount + 1;
} else {
    countMap[newPerson] = 1;
}
console.log(countMap);
*/

//In Array 
var animals = ['Beaver', 'Deer ','Badger','Beaver', 'Deer ','Badger','Beaver', 'Badger','Badger'] 

//FOR LOOPS
//Forward Loop 
for (let i = 0; i < animals.length; i++) {
    if(countMap.hasOwnProperty(animals[i])) {
        let currentCount = countMap[animals[i]];
        countMap[animals[i]] = currentCount + 1;
    } else {
        countMap[animals[i]] = 1;
    }
}

console.log(countMap)
