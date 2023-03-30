//const nums1 = [1,2,3,2,1];
//const nums2 = [7,3,2,1];
//const nums1 = [1,2,3,2,1]
//const nums2 = [3,2,1,4,7]

const nums1 = [1,2,3,4]
const nums2 = ['a','b','c']

findLength(nums1, nums2)

function findLength(nums1, nums2){
    for(let j = 0; j < nums2.length; j++) {
        for (let i = 0; i < nums1.length; i++) { 
            let leftWindow = i;
            let rightWindow = i;

            if(i + nums2.length -1 < nums1.length) {
                rightWindow = i + nums2.length -1;
          
            } else {
                rightWindow = nums1.length - 1;
            }
            checkMatch(nums1, nums2, leftWindow, rightWindow);

        }
        console.log("____________________");
        //TEMP
        break;
    }
}

function checkMatch(nums1, nums2, leftWindow, rightWindow) {
    console.log("Left Window " + leftWindow + " Right Window " + rightWindow);
    let smallArrayWindow;

    if(nums2.length < rightWindow - leftWindow) {
        smallArrayWindow = nums2.length -1;
    } else {
        smallArrayWindow = rightWindow - leftWindow;
    }

    for(let i = 0; i <= smallArrayWindow; i++){
        console.log(nums2[i]);

    }
    for(let j = leftWindow; j <= rightWindow; j++){
        console.log(nums1[j]);

    }

}




//Check A
/*
for (let i = 0; i < nums1.length; i++) { 
    for (let j = 0; j < nums1.length; j++) { 
        //console.log(nums1[j] + " " + nums2[j]);
        console.log(nums1[j]);
    }
    console.log("______________")
}
*/
/*
compare(nums1, nums2, 1); 

function compare(nums1, nums2, index) {
    for (let i = 0; i < nums1.length; i++) {
        console.log(nums1[i] + " " + nums2[index]);
        if(nums1[i] == nums2[index]) {
            console.log("_______________");
            console.log("check " + nums1[i] + " " + nums2[index]);
            let nums1Start = i;
            let nums1End = nums1.length -1;
            let nums2Start = index;
            let nums2End = nums2.length -1;

            console.log("check nums1 from " + nums1Start + " " + nums1End);
            console.log("check nums2 from " + nums2Start + " " + nums2End);

            console.log("_______________");
        }
    }

}

*/