const s = "ab"

findPermutations(s)

function findPermutations(s) {
  for (let i = 0; i < s.length; i++) {
    for (let j = i; j < s.length; j++) {
      currentChar = s.charAt(i);
      console.log(i + " " + j);
    }
    //currentChar = s.charAt(i);
    //console.log(i);
  }
}








//WORKS
//const answer = findPermutations(s)
//console.log(answer);

function findPermutationsRegression(string) {
  if (!string || typeof string !== "string"){
        return "Please enter a string"
      } else if (string.length < 2 ){
        return string
      }
    
      let permutationsArray = [] 
       
      for (let i = 0; i < string.length; i++){
        let char = string[i]
    
        let remainingChars = string.slice(0, i) + string.slice(i + 1, string.length)
    
        for (let permutation of findPermutations(remainingChars)){
          permutationsArray.push(char + permutation) }
      }
      return permutationsArray
}



/*
let findPermutations = (string) => {
  if (!string || typeof string !== "string"){
    return "Please enter a string"
  } else if (string.length < 2 ){
    return string
  }

  let permutationsArray = [] 
   
  for (let i = 0; i < string.length; i++){
    let char = string[i]

    let remainingChars = string.slice(0, i) + string.slice(i + 1, string.length)

    for (let permutation of findPermutations(remainingChars)){
      permutationsArray.push(char + permutation) }
  }
  return permutationsArray
}
*/