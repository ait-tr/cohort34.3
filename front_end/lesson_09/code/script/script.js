// function declaration
function power(base, p){
    const result = base ** p;
    return result;
}

console.log(power(12, 2));
console.log(power(12, 3));
console.log(power(2, 10));

// function expression

const sum = function(value1, value2){
    return value1 + value2;
}

console.log(sum(12, 43));

// arrow function

const length = message => message.length;

console.log(length("hello world"));

// создать функцию max, которая получает два аргумента (числа) и возвращает наибольшее


function max(value1, value2){
    return value1 > value2? value1: value2;
}

console.log(max(12, 22));
console.log(max(32, 22));


// создать функцию mult которая получает в качестве аргумента 3 числа и возвращает произведение

function mult(...args){
    let result = 1;
    for(elem of args){
        result *= elem;
    }

    return result;
}

console.log(mult(2, 4, 3, 6, 5, 4, 7, 5))

// доработать функцию mult и сделать так, чтобы она могла обрабатывать произвольное кол-во вргументов


// написать функцию, которая получает в качестве аргументов числа и возвращает среднее значение

function avg(...args){
    let sum = 0;
    for (elem of args){
        sum += elem;
    }
    return sum / args.length;
}

// console.log(avg(12, 5, 3, 7, 5));

// создать функцию max, которая получает в качестве аргументов числа и возвращает максимальное число

function max(...args){
    // const args = [5, 3, 12, 6, 7];
    let result = args[0]; // 5
    for (elem of args){
        result = result > elem? result: elem;
    }
    return result
}

console.log(max(12, 5, 3, 6, 7));


/* <условие>? <значение, которое вернется, если условие верно>: <значение, которое вернется, если условие не верно>; */



// создать функцию, которая получает в качестве аргумента массив и выводит все значения (по одному) в консоль
// изменить функцию таким образом, чтобы она меняла в массиве все отрицательные значения на положительные


function handler(arr){
    for (let i = 0; i < arr.length; i++){
        arr[i] = arr[i] >= 0? arr[i]: -arr[i];
    }
    return arr;
}

const sourceArr = [1, -5, 3, -7, 5];

console.log(handler(sourceArr));