//Array 
for (var i = 0; i < 4; i++) {
    console.log("hi")
}

























//Previous
var users = ["davey", "frodo", "sam", "bilbo", "merry"];
let previousUser = null

for (var i = 0; i < users.length; i++) {
    let currentUser = users[i];
    
    //console.log("current " + currentUser);
    //console.log("previous " + previousUser);
    //console.log("______________");
    previousUser = currentUser
}

//Next
let nextUser;
let currentUser;

for (var i = 0; i < users.length; i++) {
    currentUser = users[i];
    if(i + 1 < users.length) {
        nextUser = users[i + 1];
    } else {
        nextUser = null;
    }

    console.log("current " + currentUser);
    console.log("next " + nextUser);
    console.log("______________");
}
















//String 
let s = "frodo";
for (let i = 0; i < s.length; i++) {
    currentChar = s.charAt(i);
    previousChar = null;

    //console.log(currentChar);
    //console.log(previousChar);

}



