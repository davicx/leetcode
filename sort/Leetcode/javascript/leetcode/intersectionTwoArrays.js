//const nums1 = [1,2,2,1]; 
//const nums2 = [2,2];
let nums1 = [1,2,3,1,2,3,4]; 
let nums2 = [2,3,4];

intersect(nums1, nums2);




function intersect(nums1, nums2) {
    var maxNums = [];
    const maxSize = nums2.length;

    for (let i = 0; i < nums1.length; i++) {
        let compareN1 = [];
        let compareN2 = [];

        if(nums2[0] == nums1[i]) {

            //console.log("Check " + nums2[0] + " " + nums1[i]);
            compareN1 = 

            findMaxSameArray(compareN1, compareN2)
        
        }
    }  
    
};

function findMaxSameArray(compareN1, compareN2) {


}

function compareNums(n1, n2) {
    for (let i = 0; i < n1.length; i++) {
        if(n1[i] !== n2[i]){
            return false;
        }
    }
    return true;
}


//const n1 = [2,2]; 
//const n2 = [2,2];
//const sameNum = compareNums(n1, n2);
//console.log(sameNum);