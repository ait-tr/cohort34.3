

const formNode = document.querySelector("#addForm");
const todos = [];

formNode.addEventListener("submit", (event) => {
    event.preventDefault();
    const {title, priority} = event.target;
    const todo = {
        title: title.value,
        priority: priority.value
    };
    todos.push(todo);
    rerender();
    event.target.reset();
})

function getTodoNode(title, priority){
    const container = document.createElement("div");
    const titleNode = document.createElement("p");

    titleNode.innerText = title;

    container.classList.add("item");
    container.append(titleNode);

    // соответствие значений priority цветам, которые мы должны использовать
    // в заднем фоне.
    const bgColors = {
        0: "#1abc9c",
        1: "#f39c12",
        2: "#d35400"
    };

    container.style.backgroundColor = bgColors[priority];

    return container;
}


function rerender(){
    const container = document.querySelector("#todosContainer");
    container.innerText = '';
    todos.forEach(({title, priority}) => container.append(getTodoNode(title, priority)))

    // написать процесс в котором мы проходимся по массиву todos
    // и для каждого элемента создаем следующую структуру
    // <div>
    //     <p>title</p>
    //     <p>priority</p>
    // </div>
    // добавьте данный div в todosContainer
}


// const targetNode = document.querySelector(".target");

// inline указание стилей 

// targetNode.style.backgroundColor = "#2980b9";
// targetNode.style.width = "400px";

// cвойство ноды с множеством свойств стилей для указания им значений
// targetNode.style

// backgroundColor 
// при указании стилей через inline в JS используется camel case так как - не является допустимым символом 
// в имени переменной/свойства 


// работа с классами

// ТАК ДЕЛАТЬ НЕ НАДО (ЭТО НЕ УДОБНО)
// targetNode.setAttribute("class", "marked target");

// targetNode.classList.add("marked");
// targetNode.classList.remove("marked");
// setInterval(() => {
//     targetNode.classList.toggle("marked");
// }, 500);


// classList - свойство с набором методов для взаимодействия с классами
// targetNode.classList

// add - добавление класса
// remove - удалить класс
// toggle - удаляет класс, если он есть или добавляет, если его нет