let sum:number = 0;
let count:number = 0;
for(let i=2; count<30; i++){
    let isPrime: boolean = true;
    if(i==2){
        sum+=i;
        count++;
        continue;
    }
    for(let k=2; k<i; k++){
        if(i%k==0){
            isPrime = false;
            break;
        }
    }
    if(!isPrime){
        continue;
    }
    sum+=i;
    count++;
}
console.log("Sum of the first " + count+ " primes is: "+sum);
