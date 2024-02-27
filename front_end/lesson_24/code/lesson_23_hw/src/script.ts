// task 1
type Person = {
    name: string,
    age: number
};

const persons:Person[] = [
    {name: "Анатолий", age: 31},
    {name: "Семен", age: 37},
    {name: "Степан", age: 35},
    {name: "Елена", age: 26},
];

function sortByAge(persons: Person[]): void{
    persons.sort((a:Person, b:Person):number => a.age - b.age);
}

sortByAge(persons);
console.log(persons);


// task 2

type Product = {
    title: string,
    price: number
};

const products:Product[] = [
    {title: "ролики", price:750},
    {title: "лыжи", price:1200},
    {title: "велосипед", price:2300},
    {title: "сноуборд", price:1500}
];

function getProductsByPrice(products:Product[], targetPrice:number):Product[]{
    return products.filter((product:Product):boolean => product.price <= targetPrice);
}

console.log(getProductsByPrice(products, 1400));

// task 3

type Book = {
    title: string,
    price: number
};

const books: Book[] = [
    {title: "Мастер и Маргарита", price: 1200},
    {title: "Горе от ума", price: 900},
    {title: "Три товарища", price: 1000},
    {title: "Трое в лодке, не счетая собаки", price: 1400}
];

function getBookByName(books: Book[], title: string): Book | undefined{
    return books.find((book:Book):boolean => book.title === title);
}

console.log(getBookByName(books, "Горе от ума"));

// task #4

function getTotalPrice(products:Product[]):number{
    return products.reduce((acc:number, product:Product):number => acc + product.price, 0);
}

console.log(getTotalPrice(products));

// task № 5

type Student = {fullName : string, assessment: number};
const listOfStudents: Student[] = [];
listOfStudents.push({fullName: "Name1", assessment: 5});
listOfStudents.push({fullName: "Name2", assessment: 3});
listOfStudents.push({fullName: "Name3", assessment: 4});
listOfStudents.push({fullName: "Name4", assessment: 2});
listOfStudents.push({fullName: "Name5", assessment: 5});


function updateAssesment(listOfStudents:Student[], fullName:string, newAssesment:number):void{
    const targetStudent:Student | undefined = listOfStudents.find((student:Student) => student.fullName === fullName);
    if (targetStudent){
        targetStudent.assessment = newAssesment;
    }
}

updateAssesment(listOfStudents, "Name7", 10);
console.log(listOfStudents);

// task # 6

type Order = {title: string, status: string}
const statusOrderList : Order[] = [];
statusOrderList.push({ title: "Stak", status: "completed" });
statusOrderList.push({ title: "Burger", status: "pending" });
statusOrderList.push({ title: "Pizza", status: "in progress" });
statusOrderList.push({ title: "Salad", status: "ready" });
statusOrderList.push({ title: "Soup", status: "cancelled" });
statusOrderList.push({ title: "Pasta", status: "pending" });
statusOrderList.push({ title: "Sandwich", status: "pending" });
statusOrderList.push({ title: "Fries", status: "in progress" });
statusOrderList.push({ title: "Chicken", status: "ready" });
statusOrderList.push({ title: "Fish", status: "cancelled" });

function countByStatus(statusOrderList: Order[], status:string):number{
    return statusOrderList.filter((order:Order):boolean => order.status === status).length;
}

console.log(countByStatus(statusOrderList, "pending"));
console.log(countByStatus(statusOrderList, "cancelled"));
console.log(countByStatus(statusOrderList, "test"));

// task # 7 

function getMaxPriceProduct(products:Product[]):Product{
    return products.reduce((a:Product, b:Product):Product => a.price > b.price? a: b);
}

console.log(getMaxPriceProduct(products));

// task # 8

type Car = {
    brand: string,
    year: number
};

const cars: Car[] = [
    { brand: "Toyota", year: 2015 },
    { brand: "Honda", year: 2018 },
    { brand: "Ford", year: 2017 },
    { brand: "Ford", year: 2017 },
    { brand: "Mini", year: 2019 },
    { brand: "BMW", year: 2016 },
    { brand: "Mercedes", year: 2019 }
];

function getCars(cars: Car[], brand: string, year: number):Car[]{
    return cars.filter((car:Car) => car.brand === brand && car.year === year);
}

console.log(getCars(cars, "Ford", 2017));

// task # 9

const oldCars: Car[] = [
    { brand: "Toyota", year: 1915 },
    { brand: "Honda", year: 1915 },
    { brand: "Ford", year: 1915 },
    { brand: "Ford", year: 1915 },
    { brand: "Mini", year: 1915 },
    { brand: "BMW", year: 1915 },
    { brand: "Mercedes", year: 1915 }
];

function getAllCars(list1:Car[], list2:Car[]):Car[]{
    return [...list1, ...list2];
}

console.log(getAllCars(cars, oldCars));