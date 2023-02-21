const storeGroupOne = ['starbucks','dutch','redhorse']
const storeGroupTwo = ['starbucks','dutch','allanbros']
const storeGroupThree = ['starbucks','dutch','allanbros']
const stores = [storeGroupOne, storeGroupTwo, storeGroupThree]
var currentStore = "starbucks"
var starbucksMap = new Map();

/*
    starbucksMap = {
        dutch: 3,
        redhorse: 1,
        allanbros: 2
    }

    storesMap = {
        starbucks: starbucksMap
    }

*/

for (let i = 0; i < stores.length; i++) {
    let currentStoreGroup = stores[i];
    
    addToMap(starbucksMap, currentStoreGroup, currentStore);
    //console.log(starbucksMap);
}

var starbucks = {
    currentStore: starbucksMap
}

console.log(starbucks.currentStore)

function addToMap(storeMap, storeGroup, store) {
    if(storeGroup.includes(store)) {
        for (let i = 0; i < storeGroup.length; i++) {
            let currentStore = storeGroup[i];

            //Add Each store to the store map
            if(storeMap.has(currentStore)) { 
                let currentCount = storeMap.get(currentStore);
                storeMap.set(currentStore, currentCount + 1);
                console.log(store + " has " + currentStore);
            } else {
                console.log(store + " no! " + currentStore);
                storeMap.set(currentStore, 1);
            }
        }
    }

    storeMap.delete(store);

    return storeMap;
}


/*

/*
starbucksMap = addToMap(starbucksMap, storeGroupOne, currentStore);
console.log(starbucksMap);

starbucksMap = addToMap(starbucksMap, storeGroupTwo, currentStore);
console.log(starbucksMap);

starbucksMap = addToMap(starbucksMap, storeGroupThree, currentStore);
console.log(starbucksMap);


*/

/*
map1.set('a', 1);
map1.set('b', 2);
map1.set('c', 3);

console.log(map1.get('a'));
*/




/*
//Create JavaScript Map

var dutch = {}
storeMap.set(storeGroupOne[0], starbucks);
if(storeMap.has(storeGroupOne[0])) { 
    console.log("has " + storeGroupOne[0]);
} else {
    console.log("no! " + storeGroupOne[0]);
}
//storeMap.set(storeGroupOne[0], starbucks);
//storeMap.set(storeGroupOne[0], starbucks);
storeMap.set(storeGroupOne[1], dutch);

console.log(storeMap.size);

//const storeGroupOne = ['a','b','c']
//const storeGroupTwo = ['a','b','d']


//Store A
var starbucks = storeGroupOne[0];
var allStores = {};
starbucksMap = {}

allStores[starbucks] = starbucksMap;


//Add Stores One
for (let i = 0; i < storeGroupOne.length; i++) {
    let currentStore = storeGroupOne[i];
    if(allStores[starbucks].hasOwnProperty(currentStore)) {
        //console.log("has");
        let currentCount = allStores[starbucks][currentStore];
        allStores[starbucks][currentStore] = currentCount + 1;
    } else {
        allStores[starbucks][currentStore] = 1;
        //console.log("no");
    }
}

//Add Stores Two
for (let i = 0; i < storeGroupTwo.length; i++) {
    let currentStore = storeGroupTwo[i];
    if(allStores[starbucks].hasOwnProperty(currentStore)) {
        let currentCount = allStores[starbucks][currentStore];
        allStores[starbucks][currentStore] = currentCount + 1;
    } else {
        allStores[starbucks][currentStore] = 1;
    }
}

delete allStores[starbucks][starbucks];
*/
//console.log(allStores);
//console.log(allStores[starbucks]);

/*
if(allStores[starbucks].hasOwnProperty('dutch')) {
    console.log("has");
    let currentCount = allStores[starbucks]['dutch'];
    allStores[starbucks]['dutch'] = currentCount + 1;
    console.log(allStores[starbucks]['dutch']);
} else {
    allStores[starbucks][currentStore] = 1;
    console.log("no");
}
console.log(allStores[starbucks]);
*/

/*
    if(allStores[starbucks].hasOwnProperty('dutch')) {
        console.log("has");
        //let currentCount = stores[store];
        //stores[store] = currentCount + 1;
    } else {
        //stores[store] = 1;
        console.log("no");
    }
    
starbucksMap = { 
    'dutch': 1,
    'redhorse': 1
}

allStores[starbucks] = starbucksMap;

if(allStores[starbucks].hasOwnProperty('dutch')) {
    console.log("has");
    //let currentCount = stores[store];
    //stores[store] = currentCount + 1;
} else {
    //stores[store] = 1;
    console.log("no");
}


console.log(allStores['starbucks'])
*/
/*
console.log(allStores['a']);
console.log(allStores);

*/
/*
var allStores = [storeGroupOne, storeGroupTwo];

const storeSet = createStoreSet(allStores);
getStorePairs(storeGroupOne)

function getStorePairs(storeGroup) {
    for (let i = 0; i < storeGroup.length; i++) {
        console.log("Store " + storeGroup[i]);

        for (let j = 0; j < storeGroup.length; j++) {
            if(storeGroup[i] != storeGroup[j]) {
                console.log(storeGroup[i] + ": " + storeGroup[j]);
            }    
        }          
    }  
}


function createStoreSet(allStores) {
    const storeSet = new Set(); 
    for (const store of allStores){
        for (let i = 0; i < store.length; i++) {
            storeSet.add(store[i]);
        }
    }
    return storeSet;
}


//Store A
let tempStore = storeGroupOne[0];
tempStore = { 
    'b': 1,
    'm': 1
}

allStores.push(tempStore);

//Store B
tempStore = storeGroupOne[1];
tempStore = { 
    'a': 1,
    'm': 1
}

allStores.push(tempStore)
*/
//Print
//console.log(allStores[0]);
//console.log(allStores[1]);



/*
//Currently Has
let store = 'a';
//obj[name]

if(stores.hasOwnProperty(store)) {
    console.log("has");
    let currentCount = stores[store];
    stores[store] = currentCount + 1;
} else {
    stores[store] = 1;
    console.log("no");
}



console.log(stores)
//console.log(stores.hasOwnProperty('m'))
//console.log(stores.hasOwnProperty('a'))




*/


/*
function assignKey(obj, key) {
    typeof obj[key] === 'undefined' ? obj[key] = 1 : obj[key]++;
  }
  
  var map = {};
  
  assignKey(map, 2);
  assignKey(map, 2);
  assignKey(map, 4);
  assignKey(map, 1);
  assignKey(map, 2);
  assignKey(map, 5);
  assignKey(map, 1);
  console.log(map);
  */