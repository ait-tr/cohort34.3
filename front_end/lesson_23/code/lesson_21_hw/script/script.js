const addProductNode = document.querySelector("#add_product");
let products = [];

addProductNode.addEventListener("submit", event =>{
    event.preventDefault();
    const title = event.target.title.value;
    const price = +event.target.price.value;
    const count = +event.target.count.value;
    const product = {title, price, count};
    products.push(product);
    rerender();
    event.target.reset();
})


function createProductCart(title, price, count){
    const containerNode = document.createElement("div");
    const titleNode = document.createElement("p");
    const priceNode = document.createElement("p");
    const countNode = document.createElement("p");
    const deleteNode = document.createElement("button");
    const changeCountContainer = document.createElement("div");
    const incrCount = document.createElement("button");
    const decrCount = document.createElement("button");
    changeCountContainer.append(incrCount, decrCount);
    incrCount.innerText = "+";
    decrCount.innerText = "-";

    incrCount.addEventListener("click", () => {
        const currentProduct = products.find(product => product.title === title);
        currentProduct.count++;
        rerender();
    })

    decrCount.addEventListener("click", () => {
        const currentProduct = products.find(product => product.title === title);
        if (count === 0){
            return;
        }
        currentProduct.count--;
        rerender();
    })

    containerNode.classList.add("product_cart");
    containerNode.style.borderColor = count === 0? "#c0392b" : "#16a085";
    titleNode.innerText = title;
    priceNode.innerText = price;
    countNode.innerText = count === 0? "Товар кончился": count;
    deleteNode.innerText = "Удалить";
    containerNode.append(titleNode, priceNode, countNode, changeCountContainer, deleteNode);

    deleteNode.addEventListener("click", () => remove(title));

    return containerNode;
}

function rerender(){
    const productsNode = document.querySelector(".products");
    productsNode.innerText = "";
    if (products.length === 0){
        const messageNode = document.createElement("p");
        messageNode.innerText = "Товаров нет";
        productsNode.append(messageNode);
    }else{
        products.forEach(({title, price, count}) => productsNode.append(createProductCart(title, price, count)));
    }    
}

function remove(title){
    const newProductsArray = products.filter(product => product.title !== title);
    products = newProductsArray;
    rerender();
}

rerender();