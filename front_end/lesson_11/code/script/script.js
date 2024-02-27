const users = [
    {
        id: 1,
        name: "Анатолий",
        age: 31
    },
    {
        id: 2,
        name: "Ольга",
        age: 34
    },
    {
        id: 3,
        name: "Степан",
        age: 42
    }
];

// users
//     .filter(({age}) => age > 33)
//     .forEach(({name, age}) => console.log(name, age));

// написать процесс, который формирует новый массив из имен пользователей, у которых id четный

// const result = users
//     .filter(({id}) => id % 2 === 0)
//     .map(({name}) => name);
// console.log(result);

// Массив объектов с данными о продуктах
const products = [
    {
        name: "Ноутбук",
        price: 1200,
        brand: "Acer",
        inStock: true
    },
    {
        name: "Смартфон",
        price: 500,
        brand: "Samsung",
        inStock: false
    },
    {
        name: "Планшет",
        price: 300,
        brand: "Apple",
        inStock: true
    },
    {
        name: "Клавиатура",
        price: 50,
        brand: "Samsung",
        inStock: true
    }
];

// сформировать массив из товаров, которые есть в наличии

// const result = products.filter(({inStock}) => inStock);
// console.log(result);

// сформировать новый массив из названий товаров бренда "Samsung"

// ["Смартфон", "Клавиатура"]
// const result = products
//     .filter(({brand}) => brand === "Samsung")
//     .map(({name}) => name);

// console.log(result);

// const numbers = [12, 5, 3, 36, 4, 8];

// найти сумму чисел

// const mult = numbers.reduce((acc, elem) => acc * elem);
// console.log(mult);



// (acc, elem) => acc + elem 

// acc = 12 elem = 5 return 17
// acc = 17 elem = 3 return 20
// acc = 20 elem = 6 return 26 
// acc = 26 elem = 4 return 30
// acc = 30 elem = 8 return 38

// используя reduce найти произведение всех чисел

// const result = products.reduce(
//     (acc, item) => acc + item.price, 
//     0
// );

// console.log(result);

// (acc, item) => acc + item.price -> 1200

// acc = 0
// elem = {
//     name: "Ноутбук",
//     price: 1200,
//     brand: "Acer",
//     inStock: true
// }

// (acc, item) => acc + item.price -> 1700

// acc = 1200
// elem = {
//     name: "Смартфон",
//     price: 500,
//     brand: "Samsung",
//     inStock: false
// }

// (acc, item) => acc + item.price -> 2000

// acc = 1700
// elem = {
//     name: "Планшет",
//     price: 300,
//     brand: "Apple",
//     inStock: true
// },

// написать процесс, который находит самую низкую цену продукта (именно число).

const result = products.reduce(
    (acc, {price}) => acc > price? price: acc, 
    products[0].price
);
console.log(result);