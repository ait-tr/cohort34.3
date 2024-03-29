**Конспект по псевдоклассам в CSS:**

**1. Введение:**
   - *Псевдоклассы* в CSS - это специальные ключевые слова, которые добавляют стилевые правила к определенным состояниям или частям элементов веб-страницы.
   - Псевдоклассы применяют стили к элементам, которые находятся в определенных ситуациях, например, при наведении мыши или при наличии определенного содержимого.

**2. Основные виды псевдоклассов:**

   - **:hover:**
     - Применяет стили, когда пользователь наводит курсор мыши на элемент.

   - **:active:**
     - Применяет стили, когда элемент активен, т.е. когда он нажат.

   - **:focus:**
     - Применяет стили, когда элемент находится в фокусе, обычно используется для форм и интерактивных элементов.

   - **:first-child и :last-child:**
     - Применяют стили к первому и последнему дочернему элементу родителя соответственно.

   - **:nth-child(an):**
     - Применяет стили к элементам, которые являются n-ными дочерними элементами родителя.

   - **:nth-of-type(an):**
     - Аналогичен :nth-child, но применяет стили только к элементам указанного типа.

   - **:not(selector):**
     - Применяет стили к элементам, которые не соответствуют указанному селектору.

**3. Примеры использования:**

   - *Наведение на ссылку:*
     ```css
     a:hover {
       color: #FF0000;
     }
     ```

   - *Активное состояние кнопки:*
     ```css
     button:active {
       background-color: #4CAF50;
       color: white;
     }
     ```

   - *Стили для первого элемента списка:*
     ```css
     li:first-child {
       font-weight: bold;
     }
     ```

   - *Стили для четных элементов таблицы:*
     ```css
     tr:nth-child(even) {
       background-color: #f2f2f2;
     }
     ```

**4. Заключение:**
   - Псевдоклассы предоставляют мощные средства для стилизации элементов в зависимости от их состояний и позиции в структуре документа, что обеспечивает более гибкую и динамичную верстку веб-страниц.

**Псевдоэлементы в CSS: Конспект**

**1. Введение в псевдоэлементы:**
   - Псевдоэлементы - это виртуальные элементы, которые добавляются к выбранным элементам с целью стилизации определенных частей контента.
   - Они позволяют создавать эффекты и декоративные элементы без добавления дополнительных HTML-элементов.

**2. Синтаксис:**
   - Псевдоэлементы указываются после основного селектора с использованием двойного двоеточия (`::`).
   - Например: `selector::pseudo-element { /* стили */ }`.

**3. Некоторые популярные псевдоэлементы:**
   - **::before:** добавляет виртуальный элемент перед содержимым выбранного элемента.
   - **::after:** добавляет виртуальный элемент после содержимого выбранного элемента.
   - **::first-line:** выбирает первую строку текста внутри выбранного элемента.
   - **::first-letter:** выбирает первую букву текста внутри выбранного элемента.

**4. Пример использования ::before и ::after:**
   ```css
   .custom-element::before {
      content: "До ";
      font-weight: bold;
   }

   .custom-element::after {
      content: " После";
      font-style: italic;
   }
   ```
   - Этот код добавляет текст "До " перед содержимым элемента с классом `.custom-element` и " После" после содержимого.

**5. Пример использования ::first-line и ::first-letter:**
   ```css
   p::first-line {
      color: blue;
      font-size: 120%;
   }

   p::first-letter {
      font-size: 150%;
      font-weight: bold;
      color: red;
   }
   ```
   - Этот код стилизует первую строку и первую букву абзаца.

**6. Свойство `content`:**
   - Используется для определения содержимого виртуальных элементов.
   - Может принимать текст, изображения, или пустую строку.
   - Пример: `content: "✓";`.

**7. Важные замечания:**
   - Псевдоэлементы работают только с элементами, которые имеют контент.
   - Некоторые псевдоэлементы могут быть использованы только для определенных типов элементов.

**8. Поддержка браузерами:**
   - Псевдоэлементы широко поддерживаются современными браузерами, но всегда рекомендуется проверять совместимость для конкретных случаев.

**9. Заключение:**
   - Псевдоэлементы - мощный инструмент в CSS, позволяющий создавать различные эффекты и стилизацию без необходимости добавления дополнительных HTML-элементов. Они являются важной частью арсенала веб-разработчика для достижения желаемого визуального эффекта.