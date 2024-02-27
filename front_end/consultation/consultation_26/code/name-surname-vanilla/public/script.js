const nameNode = document.getElementById('name');
const surnameNode = document.getElementById('surname');
const fullNameLabelNode = document.getElementById('full-name-label');

// if (!nameNode || !surnameNode) {
//   throw new Error('Нет необходимых полей на странице');
// }

// input - событие возникает сразу при любом изменении инпута
nameNode.addEventListener('input', (event) => {
  // event.preventDefault - нужен для отмены отправки формы (событие submit)
  // или отмены перехода по ссылке (событие click)
  // тут он не нужен
  // event.preventDefault();

  // event.target - это и есть наш инпут, value - значение инпута
  // const name = event.target.value;

  // но лучше сделать так:
  // берём имя и фамилию из инпутов
  const name = nameNode.value;
  const surname = surnameNode.value;

  fullNameLabelNode.innerText = `${name} ${surname}`;
});

surnameNode.addEventListener('input', (event) => {
  const name = nameNode.value;
  const surname = surnameNode.value;

  fullNameLabelNode.innerText = `${name} ${surname}`;
});
