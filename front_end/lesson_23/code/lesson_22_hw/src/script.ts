// task 1
const greeting:string = "Hello, TypeScript!";
console.log(greeting);

// task 2

function mult(a:number, b:number):number{
    return a * b;
}

console.log(mult(12, 2));

// task 3

function isEven(value:number):boolean{
    return value % 2 === 0;
}

console.log(isEven(12));
console.log(isEven(13));

// task 4

function greetUser(name:string):void{
    console.log(`Hello, ${name}!`);
}

greetUser("Hayk");


// task 5

function filterPositiveNumbers(numbers: number[]):number[]{
    return numbers.filter((value:number):boolean => value > 0);
}

const numbers:number[] = [-1, 3, -2, 5, -3, 6, 3];
const result:number[] = filterPositiveNumbers(numbers);
console.log(result);

