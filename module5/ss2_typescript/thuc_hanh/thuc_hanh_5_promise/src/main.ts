let money = 10000;
const buyCar = (car: any) => {
    return new Promise(((resolve, reject) => {
        setTimeout(() => {
            if (money >= 10000) {
                resolve("Can buy " + car);
            } else {
                reject("Not enough money");
            }
        }, 100);
    }))
}
money = 1000001;
const promise = buyCar("Vinfast").then(value => {
    console.log(value);
}, error => {
    console.log(error);
})