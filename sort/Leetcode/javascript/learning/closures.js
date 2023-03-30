//Closure (creates place in heap memory to store together)
//The call stack is short lived the heap is long lived 
//A closure if function combined with outer state or lexical environment 
//They need more memory and computation
//Reason to use is data encapuslation 
let a = 1;

function impureFunction() {
    return a + 1;
}

//Closures with State
function outer() {
    let state = "my state is June"

    function inner() {
        return "hiya " + state;
    }

    return inner();
}

console.log(outer());

//Not 
function impureFunction() {
    let a = 1;
    return a + 1;
}
