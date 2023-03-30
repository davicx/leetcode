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
    console.log(users[i].userID + " " + users[i].userName + " " + users[i].location);
}

console.log("____________")
//users.sort(sortByID);
users.sort(sortByName);

for (var i = 0; i < users.length; i++) {
    console.log(users[i].userID + " " + users[i].userName + " " + users[i].location);
}

function sortByID(item_a, item_b) {
    if(item_a.userID < item_b.userID){
      return -1;
    }
    if(item_a.userID > item_b.userID){
      return 1;
    }
    return 0;
}

function sortByName(user_a, user_b) {
    if(user_a.userName < user_b.userName){
      return -1;
    }
    if(user_a.userName > user_b.userName){
      return 1
    }
    return 0;
}

