function outerFunction() {
    var hiya = "hiya"
    function innerFunction() {
        console.log(hiya)
    }
}


//Learning
//BEST EXAMPLE
/*

function getGroupUsers() {
    const users = ['davey', 'frodo'];
    return new Promise(resolve => {
      setTimeout(() => {
        resolve(users);
      }, 1000);
    });
  }
  
  async function asyncCall() {
    console.log('calling');
    const result = await getGroupUsers();
    console.log("RESULT + " + result[0]);
    //return result;
    // expected output: "resolved"
  }
  
  asyncCall();
*/


/*
async function hello() {
    return greeting = await Promise.resolve("Hello");
  };
  
let output = hello();
console.log(output);

async function myFetch() {
    let response = await fetch('coffee.jpg');
  
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
  
    let myBlob = await response.blob();
  
    let objectURL = URL.createObjectURL(myBlob);
    let image = document.createElement('img');
    image.src = objectURL;
    document.body.appendChild(image);
  }
  
  myFetch()
  .catch(e => {
    console.log('There has been a problem with your fetch operation: ' + e.message);
  });
*/
/*
async function hello() { return "Hello" };
const output = hello();
console.log(output)
*/
/*
function resolveAfter2Seconds() {
    return new Promise(resolve => {
      setTimeout(() => {
        resolve('resolved');
      }, 2000);
    });
  }
  
  async function asyncCall() {
    console.log('calling');
    const result = await resolveAfter2Seconds();
    console.log(result);
    // expected output: "resolved"
  }
  
  asyncCall();
  */
/*
async function getPosts() {
    setTimeout(() => {
        const post_one = {title: "Post one", body: "photo"}
        const post_two = {title: "Post two", body: "video"}
        const post_three = {title: "Post three", body: "video"}
        const posts = [post_one, post_two, post_three];
        return posts;
    }, 1000);
    
}

let myPosts = await getPosts();
console.log(myPosts[0])
 
function getData() {
    setTimeout(() => {
        const post_one = {title: "Post one", body: "photo"}
        const post_two = {title: "Post two", body: "video"}
        const post_three = {title: "Post three", body: "video"}
        const posts = [post_one, post_two, post_three];
        return posts;
    }, 1000);   
}

async function callAsync() {
    var x = await getData();
    console.log(x);
 }
 callAsync();
*/


/*
function getMyPosts() {
    const post_one = {title: "Post one", body: "photo"}
    const post_two = {title: "Post two", body: "video"}
    const post_three = {title: "Post three", body: "video"}
    const posts = [post_one, post_two, post_three];
    return posts;
}
*/
/*
async function init() {
    await createPost({title: "Post four", body: "video"})
    getPosts();
}

init();
*/



//Async Await
/*
const post_one = {title: "Post one", body: "photo"}
const post_two = {title: "Post two", body: "video"}
const post_three = {title: "Post three", body: "video"}
var posts = [post_one, post_two, post_three] 

function createPost(post) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            posts.push(post);

            const error = false;
            if(!error) {
                resolve();
            } else {
                reject("There was an error ");
            }

        }, 2000);
    })
}

function getPosts() {
    setTimeout(() => {
        let output = '';
        posts.forEach((post, index)=> {
            output += `<li> ${post.title} </li>`;
        });
        document.body.innerHTML = output;
    }, 1000);
}

async function init() {
    await createPost({title: "Post four", body: "video"})
    getPosts();
}

init();
*/
/*
//Async Await Fetch
async function fetchUsers() {
    const res = await fetch('https://jsonplaceholder.typicode.com/users/');
    const data = await res.json();
    console.log(data);

}
fetchUsers() 
*/

/*


getPosts();

createPost({title: "Post four", body: "video"})
    .then(getPosts)
    .catch(err => console.log(err));

*/

/*
//Callback
const post_one = {title: "Post one", body: "photo"}
const post_two = {title: "Post two", body: "video"}
const post_three = {title: "Post three", body: "video"}
var posts = [post_one, post_two, post_three] 
 
function getPosts() {
    setTimeout(() => {
        let output = '';
        posts.forEach((post, index)=> {
            output += `<li> ${post.title} </li>`;
        });
        document.body.innerHTML = output;
    }, 1000);
}

getPosts();

function createPost(post, callback) {
    setTimeout(() => {
        posts.push(post);
        callback();
    }, 2000);
}

getPosts();
createPost({title: "Post four", body: "video"}, getPosts);
*/


/*
//Example
const post_one = {title: "Post one", body: "photo"}
const post_two = {title: "Post two", body: "video"}
const post_three = {title: "Post three", body: "video"}
var posts = [post_one, post_two, post_three] 
 
function getPosts() {
    setTimeout(() => {
        let output = '';
        posts.forEach((post, index)=> {
            output += `<li> ${post.title} </li>`;
        });
        document.body.innerHTML = output;
    }, 1000);
}

getPosts();

function createPost(post) {
    setTimeout(() => {
        posts.push(post);
    }, 2000);
}

getPosts();
createPost({title: "Post four", body: "video"});
*/
