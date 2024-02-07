В TypeScript (TS) вы можете создавать свои собственные типы данных с использованием ключевого слова `type` или `interface`. Эти конструкции позволяют вам описывать форму объектов, функций, а также комбинировать их для создания более сложных типов. Вот примеры использования обоих подходов:

### Использование `type`:

```typescript
// Создание простого типа
type Point = {
  x: number;
  y: number;
};

// Использование типа для функции
type AddFunction = (a: number, b: number) => number;

// Комбинирование типов
type Shape = {
  name: string;
  dimensions: {
    width: number;
    height: number;
  };
};

// Использование обобщений (generics)
type Container<T> = {
  value: T;
};

// Пример использования
const point: Point = { x: 10, y: 20 };
const add: AddFunction = (a, b) => a + b;
const rectangle: Shape = {
  name: 'Rectangle',
  dimensions: { width: 30, height: 40 },
};

const container: Container<string> = { value: 'Hello, TypeScript!' };
```

### Использование `interface`:

```typescript
// Создание интерфейса
interface Point {
  x: number;
  y: number;
}

// Использование интерфейса для функции
interface AddFunction {
  (a: number, b: number): number;
}

// Комбинирование интерфейсов
interface Shape {
  name: string;
  dimensions: {
    width: number;
    height: number;
  };
}

// Использование интерфейса с обобщением
interface Container<T> {
  value: T;
}

// Пример использования
const point: Point = { x: 10, y: 20 };
const add: AddFunction = (a, b) => a + b;
const rectangle: Shape = {
  name: 'Rectangle',
  dimensions: { width: 30, height: 40 },
};

const container: Container<string> = { value: 'Hello, TypeScript!' };
```

Оба подхода могут использоваться в зависимости от ваших предпочтений. `interface` имеет некоторые особенности, такие как возможность объединения и расширения, но в целом они могут быть использованы взаимозаменяемо для определения типов в TypeScript.

### Методы массивов

В TypeScript, как и в JavaScript, вы можете использовать множество методов массивов для работы с данными в массиве. TypeScript предоставляет статическую типизацию, что позволяет более безопасно работать с массивами, предупреждая об ошибках на этапе компиляции. Вот несколько примеров наиболее распространенных методов массивов:

1. **`map`**: Создает новый массив, применяя функцию к каждому элементу.

    ```typescript
    const numbers: number[] = [1, 2, 3, 4, 5];
    const squaredNumbers: number[] = numbers.map((num) => num * num);
    ```

2. **`filter`**: Создает новый массив, включая только те элементы, для которых функция возвращает `true`.

    ```typescript
    const numbers: number[] = [1, 2, 3, 4, 5];
    const evenNumbers: number[] = numbers.filter((num) => num % 2 === 0);
    ```

3. **`reduce`**: Применяет функцию к аккумулятору и каждому элементу массива, чтобы свести его к одному значению.

    ```typescript
    const numbers: number[] = [1, 2, 3, 4, 5];
    const sum: number = numbers.reduce((acc, num) => acc + num, 0);
    ```

4. **`forEach`**: Выполняет указанную функцию один раз для каждого элемента массива.

    ```typescript
    const fruits: string[] = ['apple', 'banana', 'orange'];
    fruits.forEach((fruit) => console.log(fruit));
    ```

5. **`some` и `every`**: Проверяют, соответствует ли хотя бы один элемент или все элементы условию.

    ```typescript
    const numbers: number[] = [1, 2, 3, 4, 5];
    const hasEven: boolean = numbers.some((num) => num % 2 === 0);
    const allEven: boolean = numbers.every((num) => num % 2 === 0);
    ```

6. **`find` и `findIndex`**: Ищут первый элемент или его индекс, соответствующий условию.

    ```typescript
    const numbers: number[] = [1, 2, 3, 4, 5];
    const foundNumber: number | undefined = numbers.find((num) => num > 3);
    const indexOfFoundNumber: number = numbers.findIndex((num) => num > 3);
    ```

В TypeScript также можно определить типы для элементов массива и для функций обратного вызова, чтобы получить преимущества статической типизации при использовании методов массивов.