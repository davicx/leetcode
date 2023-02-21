let num = 5;

subtract(num);

function subtract(num) {
    console.log(num)
    if(num > 2) {
        num = num - 1;
        return subtract(num);
    } else {
        return num;
    }
}