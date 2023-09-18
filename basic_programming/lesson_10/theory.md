# Arrays

1. Why do we need data sets?

The main function of arrays is to store large amounts of information.

## Examples of arrays that you know from life:
- a list of employees
- list of tasks/orders
- phone book
- ... (let's give more examples)
- ...


There is a variable and a data type => how to save them????
int X = 1000;
int Y = 2000;

can be turned into an array of 2 numbers
int X[0], X[1], ...

## Defeenition:
* An array is a container object that holds a fixed number of values of a **single type**.
  An array is a container object containing a fixed number of values of the same type**.

* The array can contain data of **ONLY ONE type**.
* The type of what is stored in the array is the data types that we have in the Java language, there are no other types.


**Main characteristics of the array:**
- **type** of data placed in it (int, double, boolean, long, String, ...),
- name (as Variable name),
- length (natural number, cannot be negative) = array size (number of cells, length)
  must be defined in **type int**.

**IMPORTANT!** - you cannot change the length of an array after it has been created.

In arrays, as elsewhere in Java, **elements are numbered starting from zero**.

2. Array declaration syntax:

- Step 1:
    - determination/setting of **type of stored data** (data of ONE type is stored in the array),
    - dimension planning (one-dimensional, two-dimensional, etc.) and size (depending on the amount of data)

- Step 2: Declaring and Initiating the Array

  Type[] arrayname = new Type[size];
  The "=" symbol is an assignment operator

  **Examples:**
  int[] arrayNum = new int[5]; - defined an array of integers, array length = 5
  String[] arrayName = new String[10]; - defined an array of strings, array length = 10
  double[] arrayResults = new double[100]; - defined an array of fractional numbers, array length = 1

3. Filling the array
   After the array creation (initialization) procedure, it is filled with **default values**.
    - for int all elements = 0
    - for float, double all elements = 0.0
    - for String all elements = "null"
    - for char all elements = '\0'
    - for boolean all elements = false


Direct (manual) filling of the array:

int[] myArray = new int[3];
the array is called myArray, data type is int, array length = 3

myArray[0] = 5;
myArray[1] = -19;
myArray[2] = 155;
__________________

         String[] directions = new String[4];

         directions = {"left", "right", "up", "down"};
         direction[0] = "left"
         direction[1] = "right"
         .....
         direction[3] = "down"

         direction[4] = "up-side-down" - error, attempt to access a non-existent array element
         direction[5] - error, attempt to access a non-existent array element,
                         out of range - going beyond the array limits
__________________

         int[] marks = {2, 5, 48, 5, 3, 5, 4, 1}; // you can also set an array this way
         double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}
             temperature.length - returns the length of the array


4. Access to array elements:
   An array element is accessed by the **array name** and the **index of the element** within it:
   arrayName[n] is the nth element in the array named arrayName, numbering starts at 0

# For loop

## Syntax
         `for( initial value of parameter int i = 0; logical expression (i < n); increment step i++ ) {
             operator 1;
             operator 2;
             ...
         }`

Typically, a for loop is used to **iterate through all the values in an array**.
 i = 0, i < array length, i++

Is it possible to construct any loops using a for loop? - More likely no than yes.

Could there be i-- ? The answer is YES, in this case the cycle goes in reverse.

## Using a For Loop

### Filling an array in accordance with a mathematical pattern
* arithmetic progression
*    geometric progression
* values of a given function, for example x squared => i * i

### Filling an array with random data:

* double a = Math.random(); - generates a random number in the range from [0, 1) - parentheses from mathematics
  [ => 0 - maybe ) => 1 - can't be

* double x = (Math.random() * (b-a) ) + a - generates a random number in the interval from [a, b) (a<b)
  a - maybe, b - can't be

* int n = (int)(Math.random() * (b - a + 1) + a) - generates a random **integer** number in the interval [a, b]
  a - maybe, b - maybe

## Standard tasks and operations with arrays:
- search for an array element;
- adding a new element (to the beginning, to the end, to the middle);
- editing an array element;
- deleting an array element;
- search for maximum/minimum value;
- sorting in ascending/descending order;
- removal of duplicates;
- array shift;
- removal of empty (zero) elements.

We will gradually go through all these points.

__________________________________________________

# Массивы
1. Зачем нужны массивы данных?

Главная функция массивов - **хранение больших объемов информации**.

## Примеры массивов, которые вам известны из жизни:
- список сотрудников
- перечень дел/поручений
- телефонная книжка
- список покупок
- библиотека (книги)
- архив документов
- фотоархивы
- склады 
- каталог товаров
- аудиотека
- списки покупателей, клиентов
- реестр недвижимости (аренда, продажа, покупка)
- перечень имущества, активов
- кадастр по земельным участкам
- счета клиентов в банках
- ...


Есть переменная и тип данных => как их сохранять????
        int X = 1000;
        int Y = 2000;
        int Z = 2500;
... так неудобно.

Удобно так, данные можно превратить в массив:
        int X[0], X[1], X[2], ...
        double Y[0], Y[1], Y[2] ..., Y[30] - длина массива 31


## Defenition (определение):

* An array is a container object that holds a fixed number of values of a **single type**. 
Массив – это объект-контейнер, содержащий **фиксированное количество** значений **одного типа**.

* В массиве могут содержаться данные **ТОЛЬКО ОДНОГО типа**.
* Тип того, что хранится в массиве - это типы данных, которые у нас есть в языке Java, других типов нет.


**Главные характеристики массива:**
- **тип** помещённых в него данных (int, double, boolean, long, String,  ...),
- имя массива (как имяПеременной),
- **длина** (натуральное число, не может быть отрицательным) = размер массива (количество ячеек, длина),
  всегда имеет **тип int**.

**ВАЖНО!** - изменить длину массива после его создания нельзя.

В массивах, как и везде в Java, **элементы нумеруются с нуля**.

2. Синтаксис объявления массива:

- Шаг 1:
    - определение/задание **типа хранимых данных** (в массиве хранятся данные ОДНОГО типа),
    - планирование размерности (одномерные, двумерные, и т.д.) и размера (зависит от количества данных)

- Шаг 2: объявление и инициация массива

  Тип[] имяМассива = new Тип[размер];
  Символ " = " - это оператор присвоения значения

  **Прмеры:**
  int[] arrayNum = new int[5]; // определили массив целых чисел, длина массива = 5
    arrayNum[0] - это первый элемент массива, arrayNum[4] - это последний элемент

  String[] arrayCity = new String[10]; // определили массив строк, длина массива = 10
    arrayCity[0] - это первый элемент массива, arrayCity[9] - это последний элемент

  double[] arrayResults = new double[100]; // определили массив дробных чисел, длина массива = 100
    arrayResults[0] - это первый элемент массива, arrayResults[99] - это последний элемент


3. Заполнение массива
   После процедуры создания (инициализации) массива он наполнен **значениями по умолчанию**.
   - для int все элементы = 0
   - для float, double все элементы = 0.0
   - для String все элементы = "null"
   - для char все элементы = '\0'
   - для boolean все элементы = false


Прямое (ручное) заполнение массива:

		int[] myArray = new int[3]; 
массив называется myArray, тип данных - int , длина массива = 3

		myArray[0] = 5;
		myArray[1] = -19;
		myArray[2] = 155;
__________________

        String[] directions = new String[4];

        directions = {"left", "right", "up", "down"};
        direction[0] = "left"
        direction[1] = "right"
        .....
        direction[3] = "down"

        direction[4] = "up-side-down" - ошибка, попытка обращения к несуществующему элементу массива
        direction[5] - ошибка, попытка обращения к несуществующему элементу массива, 
                        out of range - выход за пределы массива
__________________

        int[] marks = {2, 5, 4, 3, 5, 3, 5, 4, 1}; // так тоже можно задавать массив
            marks.length - возвращает длину массива marks

        double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}
            temperature.length - возвращает длину массива temperature


4. Доступ к элементам массива:
   Доступ к элементу массива получают по **имени массива** и **индексу элемента** в нем:
   arrayName[n] - это n-й элемент в массиве с именем arrayName, нумерация начинается с 0

# Цикл For (for loop)

## Синтаксис

        `for( начальное значение параметра int i = 0; логическое выражение (i < n); шаг приращения i++ ) {
            оператор 1;
            оператор 2;
            ...
        }`

Как правило, цикл for используют для **перебора всех значений массива**.
        for( i = 0, i < длины массива, i++) {
            doSomething;
        }

Можно ли циклом for построить любые циклы? - Скорее НЕТ, чем да.

Может ли быть i-- ? Ответ - ДА, в этом случае цикл идет в обратном порядке.

## Применение цикла For

### Заполнение массива в соответствии с математической закономерностью

*    арифметическая прогрессия
*    геометрическая прогрессия
*    значения заданной функции, например x в квадрате => i * i

### Заполнение массива случайными данными:

* double a = Math.random(); - генерирует случайное число в интервале от [0, 1) - скобки из математики
  [ =>  0 - может быть, ) => 1 - не может быть

* double x = (Math.random() * (b-a) ) + a  - генерирует случайное число в интервале от [a, b) (a<b)
  a - может быть, b - не может быть

* int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
  a  - может быть, b  - может быть

## Стандартные задачи и операции с массивами:
  - поиск элемента массива;
  - добавление нового элемента (в начало, в конец, в середину);
  - редактирование(изменение) элемента массива;
  - удаление элемента массива;
  - поиск максимального/минимального значения;
  - сортировка по возрастанию/убыванию;
  - удаление дубликатов;
  - сдвиг массива;
  - удаление пустых (нулевых) элементов.

Постепенно мы пройдем все эти пункты.