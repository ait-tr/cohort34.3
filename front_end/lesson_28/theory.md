## модульные стили
В React с TypeScript (TS) использование модульных стилей обычно подразумевает использование CSS-модулей или других подходов к модульному стилю, таких как Styled Components. Давайте рассмотрим пример использования CSS-модулей с React на TypeScript.

1. **Создание компонента с CSS-модулями:**
   Создайте новый компонент с файлами расширения `.tsx` и `.module.css`. Давайте создадим компонент `Button`:

   ```tsx
   // Button.tsx
   import React from 'react';
   import styles from './Button.module.css';

   interface ButtonProps {
     label: string;
   }

   function Button({label}:ButtonProps){
     return (
       <button className={styles.button}>
         {label}
       </button>
     );
   }

   export default Button;
   ```

   ```css
   /* style.module.css */
   .button {
     background-color: #3498db;
     color: #ffffff;
     padding: 10px 20px;
     border: none;
     border-radius: 5px;
     cursor: pointer;
   }

   .button:hover {
     background-color: #2980b9;
   }
   ```

2. **Использование компонента:**
   Теперь вы можете использовать ваш компонент в других частях приложения:

   ```tsx
   // App.tsx
   import React from 'react';
   import Button from './Button';

   const App: React.FC = () => {
     return (
       <div>
         <h1>Пример использования CSS-модулей в React с TypeScript</h1>
         <Button label="Нажми меня" />
       </div>
     );
   }

   export default App;
   ```

4. **Запуск приложения:**
   Запустите ваше React-приложение с помощью команды:

   ```bash
   npm start
   ```

CSS-модули автоматически обеспечивают изоляцию стилей, предотвращая конфликты между именами классов в различных компонентах. TypeScript в данном случае предоставляет статическую типизацию для вашего кода, что может упростить разработку и предотвратить ошибки на этапе компиляции.