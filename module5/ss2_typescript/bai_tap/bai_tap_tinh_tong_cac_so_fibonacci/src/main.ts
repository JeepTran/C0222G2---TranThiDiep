let sum: number = 0;

function showFibonacci(quantity: number) {
    let arrFibonacci = [1, 1];
    let count: number = arrFibonacci.length;
    for (let i = 1; count < quantity; i++) {
        arrFibonacci.push(arrFibonacci[i] + arrFibonacci[i - 1]);
        count++;
    }
    return arrFibonacci;
}
// Enter the quantity of Fibonacci numbers:
let quantity = 10;

let arr = showFibonacci(quantity);
for (let number of arr) {
    sum += number;
}
console.log(arr.toString());
console.log("Sum of " + quantity + " first Fibonacci is: " + sum);
