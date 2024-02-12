import React, { useState } from 'react';

// Как писать реакт-компонент?
// 1. Сначала пишете JSX (HTML)
// 2. Находите элементы, на которых должны происходить события (клик, отправка, изменение)
// 3. Добавляете события через onClick/onChange/onSubmit...
// 4. Если что-то на странице меняется, выносите это в useState (переменные-состояния)
// 5. Чаще всего внутри событий нужно менять переменные-состояния

// функция, которая возвращает JSX - это React-компонент
function App() {
  // реакт не работает с переменными (такова архитектура реакта, svelte бы смог :))
  // если на странице что-то меняется, это нужно вынести в useState
  // useState - это "переменные", на основе которых отображается страница
  // let name = 'Артём';
  // let surname = 'Бахарев';
  const [name, setName] = useState('');
  const [surname, setSurname] = useState('');

  return (
    <div>
      <h1>Имя/фамилия (React)</h1>

      <p>
        Полное имя:{' '}
        <span>
          {name} {surname}
        </span>
      </p>

      <form>
        {/* onChange - это событие input из vanilla js */}
        {/* так как onChange - это не строка, а функция, оборачиваем её в {} */}
        <input
          name="name"
          placeholder="Имя"
          // event - событие изменения инпута
          // event.target - DOM-элемент, на котором происходит событие (input)
          // event.target.value - значение инпута
          onChange={(event) => setName(event.target.value)}
        />
        <input
          name="surname"
          placeholder="Фамилия"
          onChange={(event) => setSurname(event.target.value)}
        />
      </form>
    </div>
  );
}

export default App;
