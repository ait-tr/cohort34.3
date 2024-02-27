

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
    const priorityNode = document.createElement("p");

    titleNode.innerText = title;
    priorityNode.innerText = priority;
    container.append(titleNode, priorityNode);
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
