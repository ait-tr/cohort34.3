const rootNode = document.querySelector("#root");

for(let i = 0; i < 10; i++){
    const pNode = document.createElement("p");
    pNode.classList.add("item");
    pNode.innerText = i;
    rootNode.append(pNode);
}

// каждому параграфу присвоить класс "item"

const imgNode = document.createElement("img");
imgNode.src = "/media/image.jpeg";
rootNode.append(imgNode);

// написать скрипт, который создает тег картинки и 
// указывает ей атрибут src 
// и добавляет в #root


// document.createElement - создание нового элемента (ноды)
// document.querySelector - метод нахождения 1 элемента по селектору
// document.querySelectorAll - метод нахождения нескольких 
//                             элементов по селектору

// element.appen() - добавление элемента в другой элемент

// const divNode = document.createElement("div");
// divNode.innerText = "Я div";
// rootNode.append(divNode);

// создать два параграфа, записать в первый свое имя
// а во второй фамилию и добавить в #root


const containerNode = document.createElement("div");
const firstNameNode = document.createElement("p");
const lastNameNode = document.createElement("p");
firstNameNode.innerHTML = "Гайк";
lastNameNode.innerText = "Инанц";

containerNode.append(firstNameNode, lastNameNode);
rootNode.append(containerNode);


const words = [
    "bike",
    "snowbord",
    "table",
    "computer"
];

const wordsContainer = document.createElement("div");
words.forEach(word => {
    const wordNode = document.createElement("p");
    wordNode.innerText = word;
    wordsContainer.append(wordNode);
})

rootNode.append(wordsContainer);

// написать процесс, который для каждого слова из массива words
// создает параграф с соответствующим словом и добавляет в новый div
// после создания всех параграфов поместить этот div в #root







