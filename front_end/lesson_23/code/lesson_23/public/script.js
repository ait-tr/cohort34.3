// создать массив из 5 произвольных товаров
const products = [
    { title: "велосипед", price: 2300, count: 12, discount: 15 },
    { title: "ролики", price: 700, count: 5 },
    { title: "самокат", price: 850, count: 0, discount: 5 },
    { title: "лыжи", price: 1200, count: 0, discount: 10 },
    { title: "коньки", price: 550, count: 2 }
];
// создать функцию getProduct, которая получает название товара и 
// возвращает объект с данными продукта
// getProduct("лыжи") -> {title: "лыжи", price: 1200, count: 7, discount: 10}
function getProduct(title) {
    return products.find((product) => product.title === title);
}
function getProductWithZeroCount() {
    return products.filter((product) => product.count === 0);
}
console.log(getProduct("лыжи"));
console.log(getProduct("сноуборд"));
console.log(getProductWithZeroCount());
function getProductsWithRealPrice() {
    const result = products.map((product) => {
        const discount = product.discount === undefined ? 0 : product.discount;
        return {
            title: product.title,
            price: product.price - discount / 100 * product.price
        };
    });
    return result;
}
console.log(getProductsWithRealPrice());
export {};
// {title: "велосипед", price: 2300, count: 12, discount: 15},
// {title: "ролики", price: 700, count: 5},
