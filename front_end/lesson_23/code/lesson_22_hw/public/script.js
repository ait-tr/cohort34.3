"use strict";
// task 1
const greeting = "Hello, TypeScript!";
console.log(greeting);
// task 2
function mult(a, b) {
    return a * b;
}
console.log(mult(12, 2));
// task 3
function isEven(value) {
    return value % 2 === 0;
}
console.log(isEven(12));
console.log(isEven(13));
// task 4
function greetUser(name) {
    console.log(`Hello, ${name}!`);
}
greetUser("Hayk");
// task 5
function filterPositiveNumbers(numbers) {
    return numbers.filter((value) => value > 0);
}
const numbers = [-1, 3, -2, 5, -3, 6, 3];
const result = filterPositiveNumbers(numbers);
console.log(result);
