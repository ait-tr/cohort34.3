"use strict";
const persons = [
    { name: "Анатолий", age: 31 },
    { name: "Семен", age: 37 },
    { name: "Степан", age: 35 },
    { name: "Елена", age: 26 },
];
function sortByAge(persons) {
    persons.sort((a, b) => a.age - b.age);
}
sortByAge(persons);
console.log(persons);
const products = [
    { title: "ролики", price: 750 },
    { title: "лыжи", price: 1200 },
    { title: "велосипед", price: 2300 },
    { title: "сноуборд", price: 1500 }
];
function getProductsByPrice(products, targetPrice) {
    return products.filter((product) => product.price <= targetPrice);
}
console.log(getProductsByPrice(products, 1400));
const books = [
    { title: "Мастер и Маргарита", price: 1200 },
    { title: "Горе от ума", price: 900 },
    { title: "Три товарища", price: 1000 },
    { title: "Трое в лодке, не счетая собаки", price: 1400 }
];
function getBookByName(books, title) {
    return books.find((book) => book.title === title);
}
console.log(getBookByName(books, "Горе от ума"));
// task #4
function getTotalPrice(products) {
    return products.reduce((acc, product) => acc + product.price, 0);
}
console.log(getTotalPrice(products));
const listOfStudents = [];
listOfStudents.push({ fullName: "Name1", assessment: 5 });
listOfStudents.push({ fullName: "Name2", assessment: 3 });
listOfStudents.push({ fullName: "Name3", assessment: 4 });
listOfStudents.push({ fullName: "Name4", assessment: 2 });
listOfStudents.push({ fullName: "Name5", assessment: 5 });
function updateAssesment(listOfStudents, fullName, newAssesment) {
    const targetStudent = listOfStudents.find((student) => student.fullName === fullName);
    if (targetStudent) {
        targetStudent.assessment = newAssesment;
    }
}
updateAssesment(listOfStudents, "Name7", 10);
console.log(listOfStudents);
const statusOrderList = [];
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
function countByStatus(statusOrderList, status) {
    return statusOrderList.filter((order) => order.status === status).length;
}
console.log(countByStatus(statusOrderList, "pending"));
console.log(countByStatus(statusOrderList, "cancelled"));
console.log(countByStatus(statusOrderList, "test"));
// task # 7 
function getMaxPriceProduct(products) {
    return products.reduce((a, b) => a.price > b.price ? a : b);
}
console.log(getMaxPriceProduct(products));
const cars = [
    { brand: "Toyota", year: 2015 },
    { brand: "Honda", year: 2018 },
    { brand: "Ford", year: 2017 },
    { brand: "Ford", year: 2017 },
    { brand: "Mini", year: 2019 },
    { brand: "BMW", year: 2016 },
    { brand: "Mercedes", year: 2019 }
];
function getCars(cars, brand, year) {
    return cars.filter((car) => car.brand === brand && car.year === year);
}
console.log(getCars(cars, "Ford", 2017));
// task # 9
const oldCars = [
    { brand: "Toyota", year: 1915 },
    { brand: "Honda", year: 1915 },
    { brand: "Ford", year: 1915 },
    { brand: "Ford", year: 1915 },
    { brand: "Mini", year: 1915 },
    { brand: "BMW", year: 1915 },
    { brand: "Mercedes", year: 1915 }
];
function getAllCars(list1, list2) {
    return [...list1, ...list2];
}
console.log(getAllCars(cars, oldCars));
