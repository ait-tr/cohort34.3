// задача 1

const arr = [1, 5, 3, 6, 8, 4, 3];

let result = arr[0];

for (elem of arr){
    result = result > elem ? result : elem;
}

// задача 2
// console.log(result);

const value = 5;

for (let i = 0; i <= 10; i++){
    // console.log(5 + ' X ' + i + " = " + 5 * i);
    // console.log(`${value} X ${i} = ${value * i}`);
}

// 5 X 3 = 15

// задача 3 
const arr1 = [1, 2, 3, 6, 8, 4, 3];

let count = 0;
for (elem of arr1){
    if (elem % 2 === 0){
        count++;
    }
}
// console.log(count);

// задача 4 
const arr2 = [1, 2, 3, 4, 5, 6, 7, 8];

for (let i = 0; i < Math.floor(arr2.length / 2); i++){
    // arr2[i]
    // arr2[arr2.length - 1 - i]
    let tmp = arr2[i];
    arr2[i] = arr2[arr2.length - 1 - i];
    arr2[arr2.length - 1 - i] = tmp;
}

// console.log(arr2);

const message = "word";

// написать цикл, который выводит в консоль строку из переменной message посимвольно

let newMessage = "";
for (let i = message.length - 1; i >= 0; i--){
    newMessage += message[i];
}

console.log(newMessage);

// написать цикл, который выводит в консоль строку из переменной message посимвольно в обратном порядке