function checkPrime(num) {
    if (num < 2) {
        return false;
    }
    else {
        for (var i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
                break;
            }
        }
        return true;
    }
}
var array = [1, 5, 9, 2, 6, 15, 19, 35, 51, 53];
var sum = 0;
for (var _i = 0, array_1 = array; _i < array_1.length; _i++) {
    var num = array_1[_i];
    if (checkPrime(num)) {
        sum += num;
    }
}
console.log("Result: " + sum);
