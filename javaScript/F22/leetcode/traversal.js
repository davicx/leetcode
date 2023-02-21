var animals = ['Beaver','Deer ', 'Elk', 'Lion','Sheep'] 

//Radiate Outwards

checkArray(animals, 2) 

function checkArray(animals, startPosition) {
    let leftPointer = startPosition;
    let rightPointer = startPosition;

    for(let i = startPosition; i < animals.length; i++) {
        console.log(animals[leftPointer] + " " +animals[rightPointer]);
        
        rightPointer = i;

        if(leftPointer > 0) {
            leftPointer = leftPointer - 1;
        } 
        //console.log(animals[i])
    }
    
}

