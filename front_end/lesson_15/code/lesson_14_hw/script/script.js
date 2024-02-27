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

function getUserNode(firstName, lastName, age){
    const firstNameNode = document.createElement("p");
    const lastNameNode = document.createElement("p");
    const ageNode = document.createElement("p");
    const container = document.createElement("div");

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