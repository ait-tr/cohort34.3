const formNode = document.querySelector("#addForm");

const users = [];

formNode.addEventListener("submit", event => {
    // ссылка на элемент (ноду) с которым произошло событие
    // console.log(event.target.firstName.value);

    // отмена дефолтного поведения (отправка формы на сервер)
    event.preventDefault();
    // формируем node для полей ввода
    const {firstName, lastName, age} = event.target;
    const user = {
        firstName: firstName.value,
        lastName: lastName.value,
        age: age.value
    };
    users.push(user);
    // вызываем перерисовку контейнера с пользователями
    render()
    // сброс формы (очистка полей ввода)
    event.target.reset();
})

function setRandomColor(node){
    const randomValue = () => Math.round(Math.random() * 255);
    const color = `rgb(${randomValue()}, ${randomValue()}, ${randomValue()})`;
    node.style.backgroundColor = color;
}

function getUserNode(firstName, lastName, age){
    const firstNameNode = document.createElement("p");
    const lastNameNode = document.createElement("p");
    const ageNode = document.createElement("p");
    const container = document.createElement("div");
    setRandomColor(container);
    container.classList.add("user_item");

    firstNameNode.innerText = firstName;
    lastNameNode.innerText = lastName;
    ageNode.innerText = age;

    container.append(firstNameNode, lastNameNode, ageNode);
    return container;
}

function render(){
     const container = document.querySelector(".userContainer");
     container.innerText = '';
     users.forEach(({firstName, lastName, age}) => container.append(getUserNode(firstName, lastName, age)));
}

/*
(user) => container.append(getUserNode(user.firstName, user.lastName, user.age))
({firstName, lastName, age}) => container.append(getUserNode(firstName, lastName, age))

{
    firstName: "Гайк",
    lastName: "Инанц",
    age: 31
}

let firstName =  "Гайк";
let lastName =  "Инанц";
let age = 31;

=================
getUserNode(firstName, lastName, age)

<div>
    <p>Гайк</p>
    <p>Инанц</p>
    <p>31</p>
</div>

=================

Добавление в контейнер

*/



// setRandomColor();


// 0    0.1   0.2     0.3     0.4     0.5     0.6     0.7     0.8     0.9     1

// 10   35.5  61      86.5    112     137.5   ... 


// const arr = [];

// for (let i = 0; i < 10000; i++ ){
//     arr.push(25 + Math.random() * 230);
// }

// console.log(Math.max(...arr));
// console.log(Math.min(...arr));