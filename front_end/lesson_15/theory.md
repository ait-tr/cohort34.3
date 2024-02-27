**Работа со стилями в JavaScript**

**1. Введение в Inline-стили:**
   - Inline-стили представляют собой непосредственное применение стилей к элементу HTML с использованием атрибута `style`.
   - Этот метод позволяет динамически изменять стили элемента на уровне JavaScript.

**2. Получение и установка стилей:**
   - **Получение стилей:**
     ```javascript
     // Получение значения конкретного стиля
     const elementStyle = document.querySelector('<selector>').style.propertyName;
     ```
   - **Установка стилей:**
     ```javascript
     // Установка значения конкретного стиля
     document.querySelector('<selector>').style.propertyName = 'value';
     ```

**3. Работа с несколькими стилями:**
   - **Множественные стили:**
     ```javascript
     // Установка нескольких стилей одновременно
     const element = document.querySelector('<selector>');
     element.style.cssText = 'property1: value1; property2: value2;';
     ```

**4. Динамическое изменение стилей:**
   - **Изменение стилей по условию:**
     ```javascript
     const element = document.querySelector('<selector>');
     if (someCondition) {
       element.style.propertyName = 'value1';
     } else {
       element.style.propertyName = 'value2';
     }
     ```

**5. Инлайновое создание стилей:**
   - **Создание элемента с инлайновыми стилями:**
     ```javascript
     const newElement = document.querySelector('<selector>');
     newElement.style.propertyName = 'value';
     ```

**6. Управление классами:**
   - **Добавление класса с инлайновыми стилями:**
     ```javascript
     const element = document.querySelector('<selector>');
     element.classList.add('myClass');
     ```
   - **Удаление класса:**
     ```javascript
     const element = document.querySelector('<selector>');
     element.classList.remove('myClass');
     ```

**7. Особенности использования:**
   - **Избегайте жесткого кода:**
     Используйте переменные и условия для более гибкого управления стилями.
   - **Оптимизация производительности:**
     Предпочитайте изменение классов над непосредственным изменением стилей, чтобы избежать рефлов.

**8. Заключение:**
   - Работа с Inline-стилями в JavaScript предоставляет мощный инструмент для динамического управления стилями элементов HTML, что делает ваш веб-сайт более интерактивным и адаптивным к различным условиям.