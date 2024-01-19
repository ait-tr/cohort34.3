function totalPrice(price, count){
    return price * count;
}

// console.log(totalPrice(250, 6))

function isEven(number){
    if (number % 2 === 0){
        return true
    }else{
        return false
    }
}

function isEven_1(number){
    return number % 2 === 0? true: false;
}

function isEven_2(number){
    return number % 2 === 0;
}

function stringReverse(string){
    let result = "";
    for(letter of string){
        result = letter + result;
    }
    return result
}


// console.log(isEven_2(12));
// console.log(isEven_2(13));
console.log(stringReverse("string"));


function convert(value){
    return value * 9 / 5 + 32
}
console.log(convert(6));