## Разбор классной работы

### Блок 1:
```javascript
const addProductNode = document.querySelector("#add_product");
```
- Эта строка находит элемент на веб-странице с идентификатором "add_product" и сохраняет его в переменной `addProductNode`. Вероятно, этот элемент представляет собой форму для добавления новых продуктов.

### Блок 2:
```javascript
let products = [];
```
- Здесь объявляется переменная `products`, которая представляет собой массив. Этот массив будет использоваться для хранения информации о продуктах (название, цена, количество).

### Блок 3:
```javascript
addProductNode.addEventListener("submit", event => {
  // ... код обработки события ...
});
```
- Этот блок добавляет слушатель события "submit" для формы, представленной `addProductNode`. Когда форма отправляется, будет выполнен обработчик события, содержащий следующий код.

### Блок 4-10:
```javascript
event.preventDefault();
const title = event.target.title.value;
const price = +event.target.price.value;
const count = +event.target.count.value;
const product = {title, price, count};
products.push(product);
rerender();
event.target.reset();
```
- `event.preventDefault();` - Предотвращает стандартное поведение формы при отправке, чтобы избежать перезагрузки страницы.
- Извлекаются значения полей формы (название, цена, количество).
- Создается объект `product` с этой информацией.
- Продукт добавляется в массив `products`.
- Вызывается функция `rerender()`, которая обновляет отображение продуктов на странице.
- `event.target.reset();` - Очищает содержимое формы после отправки.

### Блок 12-13:
```javascript
function createProductCart(title, price, count){
  // ... код создания DOM-элемента ...
}
```
- Определяется функция `createProductCart`, которая принимает параметры (название, цена, количество).
- Создается DOM-элемент, представляющий информацию о продукте (заголовок, цена, количество, кнопка "Удалить").
- Возвращается созданный DOM-элемент.

### Блок 14-22:
```javascript
function rerender(){
  const productsNode = document.querySelector(".products");
  productsNode.innerText = "";
  products.forEach(({title, price, count}) => productsNode.append(createProductCart(title, price, count)));
}
```
- Определяется функция `rerender`, которая обновляет отображение продуктов на странице.
- Находится элемент с классом "products" и сохраняется в переменной `productsNode`.
- Очищается содержимое элемента `.products`.
- Для каждого продукта в массиве `products` вызывается `createProductCart`, и созданные DOM-элементы добавляются к элементу `.products`.

### Блок 23-30:
```javascript
function remove(title){
  const newProductsArray = products.filter(product => product.title !== title);
  products = newProductsArray;
  rerender();
}
```
- Определяется функция `remove`, которая удаляет продукт с указанным заголовком из массива `products`.
- Создается новый массив `newProductsArray`, включающий все продукты, кроме того, который нужно удалить.
- Обновляется массив `products`.
- Вызывается функция `rerender` для обновления отображения на странице.