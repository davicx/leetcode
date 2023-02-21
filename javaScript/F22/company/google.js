const b1 = {
    blockID: 1,
    gym: false,
    school: true,
    store: false
}

const b2 = {
    blockID: 2,
    gym: true,
    school: false,
    store: false
}

const b3 = {
    blockID: 3,
    gym: true,
    school: true,
    store: false
}

const blocks = [b1,b2,b3];

//Iterate 
for (var i = 0; i < blocks.length; i++) {
    console.log(blocks[i]);
}

console.log("    ")

blocks.forEach(function (item, index) {
    console.log(index, item);
});

var blockOne = {
    gym: 0,
    school: 0,
    store: 0,
}

//Forward
for (let i = 0; i < blocks.length; i++) {
    //console.log("gym at " + i + " " + blocks[i].gym);   
    if(blocks[i].gym == true) {
        blockOne.gym = i;
        break;
    } 
}

//Radiate Outward 

//console.log(blockOne);
  
//Cases
//Case 1: Exists in Block
//Case 2: Exists in Block Before
//Case 3: Exists in Block After
//Case 4: Not there


