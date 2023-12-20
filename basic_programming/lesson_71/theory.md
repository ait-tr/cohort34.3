# Theory for the entire course - repetition

## Number systems
10th: decimal, decimal number system.
0, 1, 2, 3, ..., 9

The base is 10, each digit of the number becomes % 10 (division with a remainder).
54321% 10 = 1
54321 / 10 = 5432

8th:
octal, 8, remainders: 0, 1, 2, ... , 7
8 = 10

16th:
hexadecimal, 16, 0, 1, 2, ... , 9 , A, B, C, D..., F

2nd:
binary, 2 - radix, 0, 1
4 (10) = 100 (2)


## Primitive data types
int, byte, short, long, float, double, char, boolean

When declaring each variable, a method must be declared as a TYPE.

## Methods
- Method SIGNATURE
- the name of the method must be given with a small letter!!!
- if the method does not return anything, then you need to write void (English word)
- a constructor is ALSO a METHOD

  `public int add(int a, int b) {
  // method body
  return a + b;
  }`

## Condition, ternary operator, switch case
if(),if() {} else {}
helps to greatly reduce the code and a simple condition
example: ...

switch case - organizes the code when there is multiple selection

## Loops - while, do while, for



## Arrays

String[] word
int[] numbers
int[] arr

What does the current array element look like? - arr[i]
The next one after him? - arr[i + 1]
Previous element? - arr[i - 1]
First element? - arr[0]
Last? - arr[arr.length - 1]

arr.length - length, number of elements

## Sort an array
- bubble
- sort by selection
- ...

They are needed because BINARY search in a sorted array is the fastest search O(log(n))

## OOP principles
- encapsulation (everything in a class...)
- polymorphism (method overloading, different set of arguments...)
- inheritance (extends of class, implements of interface)
- abstraction (we abstract from the specifics, highlight the general properties of objects, take only what we need...)


## What is a class, etc.



## Abstract classes
- concrete objects cannot be created on the basis of an abstract class; objects can only be created in child classes


## Interfaces
- only abstract methods (no body).


## Wrapper classes
Integer, Byte, Character, Boolean, ...
Extend methods for working with such data.


## Arrays, binarySearch
Arrays is a wrapper class over array.

binarySearch is a method that returns the index of the element being searched.
Index > 0 - element found
Index < 0 - element NOT found, could/should be in -i - 1st place.

##Generics
<T>, <E> - interface parameters, the data type can/should be defined at the object creation stage.

## Comparable, Comparator
Comparable - for a class, specifies the compareTo method, the current one is compared with the one sent to the method. It is advisable that
this was the natural (native) sorting method for objects of this class.

Comparator - we define it based on the built-in interface in Java where it is needed. Defines the compare(T o1, T o2) method.

## Complexity
O(1) - constant, finite number of operations.
O(log(n)) - logarithmic.
O(n) - linear, the number of operations is directly proportional to the number of elements.
O(n2) - quadratic
O(...)

## JCF structures
Iterable - hasNex(), next()

Collection - sort, CRUD methods, ...

Lists - List, queues - ..., Sets - Set

Lists: possible duplicates, have indexes of elements, sortable, search and append - O(n) - linear, no need to monitor the size.

Sets: uniqueness of elements, NO indexes, HashSet - NOT sorted, search and addition - O(1) - constant.
TreeSet: uniqueness of elements, NO indexes, TreeSet - sorted when filled with elements IMMEDIATELY, search and addition - O(log(n)).

Maps are a combination of many keys and lists of values.

## Java Time API
see examples:
LocalDate.now - current date
ChronoUnits - days, weeks, half a week, half a month, month, century, etc.

## Java Stream API
see presentation

## Exceptions, try catch, throw
Practice more often, don’t be afraid.

---------------------------------------------------------------
# Теория за весь курс - повторение

## Системы счисления
10 - ая: десятичная, десятиричная система счисления. 
0, 1, 2, 3, ..., 9

Основание - 10, каждая цифра числа получается % 10 (деление с остатком).
54321 % 10 = 1
54321 / 10 = 5432

8 - ая:
восьмиричная, 8, остатки от деления: 0, 1, 2, ... , 7
8 = 10

16 - ая:
шеснадцатиричная, 16, 0, 1, 2, ... , 9 , A, B, С, D..., F

2 - ая: 
двоичная, 2 - основание, 0, 1
4 (10) = 100 (2)


## Примитивные типы данных
int, byte, short, long, float, double, char, boolean

При объявлении каждой переменной, метод необходимо объявить ТИП.

## Методы
- СИГНАТУРА метода
- название метода надо давать с маленькой буквы!!!
- если метод ничего не возвращает, то надо написать void (английское слово)
- конструктор - это ТОЖЕ МЕТОД

    `public int add(int a, int b) {
                // тело метода
                return a + b;
            }`

## Условие, тернарный оператор, switch case
if(),if() {} else {}
помогает очень сильно сократить код и простое условие
пример: ...

switch case - организует код, когда множественный выбор  

## Циклы - while, do while, for



## Массивы 

String[] word 
int[] numbers 
int[] arr

Как выглядит текущий элемент массива? - arr[i] 
Следующий за ним?  - arr[i + 1]
Предыдущий элемент? - arr[i - 1]
Первый элемент? - arr[0]
Последний? - arr[arr.length - 1]

arr.length - длина, кол-во элементов

## Сортировка массива
- пузырьковая
- сортировка выбором
- ...

Они нужны, потому что БИНАРНЫЙ поиск в отсортированом массиве - это самый быстрый поиск O(log(n)) 

## Принципы ООП
- инкапсуляция (все в классе ...)
- полиморфизм (перегрузка методов, разный набор аргументов ... )
- наследование (extends класса, implements от интерфейса )
- абстракция (абстрагируемся от конкретики, выделяем общие свойства объектов, берем только то, что нам надо...)


## Что такое класс и т.д.



## Абстрактные классы
- на базе абстрактного класса нельзя создавать конкретные объекты, объекты - только в дочерних классах 


## Интерфейсы
- только абстрактные методы (нет тела).


## Классы-обертки
Integer, Byte, Character, Boolean, ... 
Расширяют методы для работы с такими данными.


## Arrays, binarySearch 
Arrays - это класс-обертка над array.

binarySearch - это метод, который возвращает индекс искомого элемента.
Индекс > 0 - элемент найден
Индекс < 0 - элемент НЕ найден, мог бы/должен стоять на -i - 1 месте.

## Generics
<T>, <E> - параметры интерфейсов, тип данных может быть/должен быть определен на этапе создания объекта.  

## Comparable, Comparator
Comparable - для класса, задает метод compareTo, текущий сравниваем с присланным в метод. Желательно, чтобы
это был естетсвенный (nativ) метод сортировки для объектов этого класса.

Компаратор - определяем на основе встроенного интерфейса в Java там, где нужен. Определяет метод compare (T o1, T o2).

## Complexity
O(1) - константная, конечное кол-во операций.
O(log(n)) - логарифмическая.
O(n) - линейная, кол-во операций прямо пропорционально кол-ву элементов. 
O(n2) - квадратичная
O(...)

## JCF структуры
Iterable - hasNex(), next()

Collection - sort, CRUD-методы, ...

Списки - List, очереди - ..., Множества - Set

Списки: возможны дубликаты, есть индексы элементов, сортируемы, поиск и добавление - O(n) - линейная, не нужно следить за размером.

Множества: уникальность элементов, НЕТ индексов, HashSet - НЕ сортируется, поиск и добавление - O(1) - константная.
TreeSet: уникальность элементов, НЕТ индексов, TreeSet - сортируется при наполнении элементами СРАЗУ, поиск и добавление - O(log(n)).

Мапы - это комбинация множества ключей и списков значений.

## Java Time API
см. примеры:
LocalDate.now - текущая дата
ChronoUnits - дни, недели, полнедели, полмесяца, месяц, век и т.д.

## Java Stream API
см. презентацию

## Exceptions, try catch, throw
чаще практиковаться, не бояться. 
