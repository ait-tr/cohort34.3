// методы для получения элементов (нод) Node

// const elem = document.querySelector("p");

// чтение содержимого текста ноды
// console.log(elem.innerText);

// чтение содержимого текста ноды
// elem.innerText = "Новый текст параграфа";

// написать скрипт, который переводит содержимое параграфа в верхний регистр
// "привет".toUpperCase()

// elem.innerText = elem.innerText.toUpperCase() + "!!!";

// создать div который содержит 
// h2 заголовок
// p текст

function createTopic(title, text, link){
    // создание div 
    const container = document.createElement("div");
    // создание h2 
    const titleNode = document.createElement("h2");
    // создание p 
    const textNode = document.createElement("p");
    const linkNode = document.createElement("a");
    // заполнение h2 и p
    titleNode.innerText = title;
    textNode.innerText = text;
    linkNode.innerText = "подробнее...";

    //  указание атрибута (2 способа)
    // 1) универсальный, но громосткий
    // linkNode.setAttribute("href", link);
    // 2) более короткий
    linkNode.href = link;
    // добавление h2 и p внутрь div
    container.append(titleNode, textNode, linkNode);
    return container;
}

const array = [
    {
      title: "Заголовок 1",
      text: "Текст 1",
      link: "http://www.example1.com"
    },
    {
      title: "Заголовок 2",
      text: "Текст 2",
      link: "http://www.example2.com"
    },
    {
      title: "Заголовок 3",
      text: "Текст 3",
      link: "http://www.example3.com"
    }
];

function render(topics){
    const root = document.querySelector('#root');
    topics.forEach(({title, text, link}) => root.append(createTopic(title, text, link)));
}

// render(array);

// создать функцию, которая получает в качестве аргументов название задачи и ее номер 
// функция должна вывести следующую структуру

// getTask("сходить в бассейн", 12)

// <div>
//     <p>Номер задачи: 12</p>
//     <p>Задача: сходить в бассейн</p>
// </div>

function getTask(task, taskNumber){
    const container = document.createElement("div");
    const textNode1 = document.createElement("p");
    const textNode2 = document.createElement("p");
    textNode1.innerText = "Номер задачи: " + taskNumber;
    textNode2.innerText = "Задача: " + task;
    container.append(textNode1, textNode2);
    return container;
}

const tasks = [
    { title: "Заголовок 1", number: 42, show: true },
    { title: "Заголовок 2", number: 17, show: false },
    { title: "Заголовок 3", number: 99, show: true },
    { title: "Заголовок 4", number: 23, show: false },
    { title: "Заголовок 5", number: 7, show: true }
];
  

const root = document.querySelector('#root');

tasks
    .filter(({show}) => show)
    .forEach(({title, number}) => root.append(getTask(title, number)));