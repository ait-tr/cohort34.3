Давайте разберем каждый блок кода с классной работы:

1. **Настройка начальных переменных:**
   ```javascript
   const formNode = document.querySelector("#addForm");
   const todos = [];
   ```

   - `formNode` - это переменная, содержащая ссылку на HTML-элемент формы с идентификатором "addForm". Эта форма предназначена для ввода информации о задаче.
   - `todos` - это массив, в котором будут храниться объекты задач.

2. **Обработка отправки формы:**
   ```javascript
   formNode.addEventListener("submit", (event) => {
       event.preventDefault();
       const { title, priority } = event.target;
       const todo = {
           title: title.value,
           priority: priority.value
       };
       todos.push(todo);
       rerender();
       event.target.reset();
   });
   ```

   - Добавляется слушатель события "submit" к форме. Когда форма отправляется, выполняется колбэк-функция.
   - `event.preventDefault()` предотвращает стандартное поведение формы (перезагрузку страницы).
   - С помощью деструктуризации извлекаются значения полей `title` и `priority` из формы.
   - Создается объект `todo` с этими значениями и добавляется в массив `todos`.
   - Затем вызывается функция `rerender()` для обновления отображения задач.
   - Форма очищается с помощью `event.target.reset()`.

3. **Функция для создания DOM-элемента задачи:**
   ```javascript
   function getTodoNode(title, priority){
       const container = document.createElement("div");
       const titleNode = document.createElement("p");
       const priorityNode = document.createElement("p");

       titleNode.innerText = title;
       priorityNode.innerText = priority;
       container.append(titleNode, priorityNode);
       return container;
   }
   ```

   - Функция `getTodoNode` принимает `title` и `priority` и возвращает DOM-элемент задачи, созданный динамически.
   - Создаются элементы `div`, `p` для заголовка и `p` для приоритета.
   - Текстовое содержимое каждого элемента устанавливается из переданных параметров.
   - Элементы добавляются к контейнеру, который затем возвращается.

4. **Функция для перерисовки списка задач:**
   ```javascript
   function rerender(){
       const container = document.querySelector("#todosContainer");
       container.innerText = '';
       todos.forEach(({title, priority}) => container.append(getTodoNode(title, priority)))
   }
   ```

   - Функция `rerender` обновляет отображение задач внутри контейнера с идентификатором "todosContainer".
   - Сначала очищается содержимое контейнера с помощью `container.innerText = ''`.
   - Затем для каждой задачи в массиве `todos` создается DOM-элемент с помощью `getTodoNode` и добавляется в контейнер.

Таким образом, весь скрипт представляет простой механизм для добавления задач через веб-форму и динамического обновления списка задач на странице.