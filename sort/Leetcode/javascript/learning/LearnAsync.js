import fetch from "node-fetch";

async function fetchPokemon(id) {
    try {
        const res = await fetch('https://pokeapi.co/api/v2/pokemon/2');
        const data = await res.json();
        console.log(data);
    } catch(err) {
        console.log(err);
        console.log("error!")
    }
}

fetchPokemon(2);

/*
function wait() {
    setTimeout(() => {
        console.log("waited")
    }, 1000);
}

function sayHi() {
    console.log("hi")

}
*/

