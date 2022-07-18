function checkPrime(num: number) {
    if (num < 2) {
        return false;
    } else {
        for (let i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
                break;
            }
        }
        return true;
    }
}

let array = [1, 5, 9, 2, 6, 15, 19, 35, 51, 53];
let sum = 0;
for (let num of array) {
    if (checkPrime(num)) {
        sum += num;
    }
}
console.log("Result: "+sum);