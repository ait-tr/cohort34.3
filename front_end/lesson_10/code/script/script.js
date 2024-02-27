// function sum(a, b){
//     return a + b;
// }

// function sub(a, b){
//     return a - b;
// }

// function mult(a, b){
//     return a * b;
// }

// function handler(callback){
//     // const callback = sub;
//     console.log(callback(12, 5));
// }

// handler(sub);
// handler(mult);

// создать функцию forEach, которая принимает в качестве аргументов
// массив из значений и callback функцию. 

// forEach должен вызвать данную функцию с каждым значением их массива



// function forEach(array, callback){
//     for(let i = 0; i < array.length; i++){
//         callback(array[i], i, array);
//     }
// }

// function handler(value, index){
//     const result = value ** 2;
//     console.log(index, result);
// }

// const array = [1, 2, -3, 4, -5, 6, -7];
// forEach(array, handler);
// array.forEach((value, index, array) => console.log(index, value ** 2, array));


// создать массив из слов и используя метод forEach вывести каждое слово отдельно

const words = ['bike', 'table', 'keyboard', 'snowboard'];

// words.forEach(word => console.log(word));
// words.forEach(console.log);

// создать массив из чисел и используя метод forEach вывести все числа.
// если число отрицательное, то вывести его положительное значение (-5 -> 5)
// const array = [1, 2, -3, 4, -5, 6, -7];

// array.forEach(number => console.log(number < 0? -number: number));

// array.forEach((n)=> console.log((n >= 0 ? n : -n), array));

// используя метод forEach выведите слова, длиннее 5 символов

// words.forEach( word => {
//     if (word.length > 5){
//         console.log(word);
//     }
// });

// const result = array.map(number => number ** 2);
// console.log(result);

// function forEach(array, callback){
//     for(let i = 0; i < array.length; i++){
//         callback(array[i], i, array);
//     }
// }


// function map(array, callback){
//     const newArray = [];
//     for(let i = 0; i < array.length; i++){
//         newArray.push(callback(array[i], i, array));
//     }
//     return newArray
// }


// const result = array.map( number => number ** 2);
// console.log(result);

// используя метод filter сформировать массив из четных чисел

// function filter(array, callback){
//     const newArray = [];
//     for(let i = 0; i < array.length; i++){
//         if (callback(array[i], i, array)){
//             newArray.push(array[i]);
//         }
//     }
//     return newArray
// }

// const array = [1, 2, 3, 4, 5, 6, 7];

// const result = filter(array, number => number % 2 === 0);

// console.log(result);


// написать процесс, который из массива с числами формирует массив который 
// содержит только положительные числа из исходного массива 
// [1, 2, -3, 4, -5, 6, -7]
// [1, 2, 3, 4, 5, 6, 7]


// const array = [1, 2, -3, 4, -5, 6, -7];

// console.log(array.map(x => x >= 0? x: -x));



// написать процесс, который формирует массив из квадратов положительных чисел

// [1, 2, -3, 4, -5, 6, -7]
// [1, 4, 16, 36]


const array = [1, 2, -3, 4, -5, 6, -7];

// const result_01 = array.filter(x => x > 0);
// const result = result_01.map(x => x ** 2);
// console.log(result);

// const result = array
//     .filter(x => x > 0)
//     .map(x => x ** 2);
    
// console.log(result);

// создать массив, который состоит из исходных строк, которые длиннее 5 символов
// в каждой строке в конце должен быть добавлен "!"

// ['bike', 'table', 'keyboard', 'snowboard'];
// ['keyboard!', 'snowboard!']

const result = words
    .filter(x => x.length > 5)
    .map(x => x + '!');
    
console.log(result);