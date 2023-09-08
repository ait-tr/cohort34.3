# Accumulated knowledge:

## **What does a real programmer “look like”? (How does it look like?)**

- PRINTS FAST!!!
- he has a good computer
- he speaks good English
- ability to quickly search for information on the Internet and everywhere
- ability to learn all the time
- flexibility of thinking, adaptability
- good memory
- ability to concentrate on a task
- education, broad outlook
- creative thinking
- perseverance
- skill to work in team
- ability to rest and get up from the computer
- attention to code
- ability to ask questions and seek answers to them

## Algorithm and its properties
**Algorithm** is a _clear_ _sequence_ of _actions_, the implementation of which gives some
known _result_.

**Main properties of the algorithm:**
1. Discretion (broken into steps).
2. Effectiveness (there is a result at every step and at the end).
3. Determinism (unambiguity, there is no possibility of “interpretation”).
4. Limb (completed).

## Variables and their types
**8 primitive data types**:
+ byte - an integer takes up 1 byte in memory
+ short - an integer takes up 2 bytes in memory
+ char - positive integer takes up 2 bytes in memory
+ int - an integer takes up 4 bytes in memory
+ long - an integer takes up 8 bytes in memory
+ float - a floating point number takes 4 bytes in memory
+ double - floating point number takes 8 bytes in memory
+ boolean - a special logical type that takes one of two values: true or false

We start the variable name with ... letter, do not start with ...

The method name starts with ... letter.

We start the class name with ... letter.

## Methods
A method that accepts nothing and returns nothing looks like this:
piblic static ... methodName(){
do something;
}

A method that takes parameters (arguments) and returns nothing looks like this:
piblic static ... methodName(T1 t1, T2 2){
do something;
}

A method that takes parameters (arguments) and returns a result of type T looks like this:
piblic static ... methodName(T1 t1, T2 2){
do something;
return ...;
}

Any method is called by its name either without parameters or with parameters that are passed
into method.

____________________________________________________________________________
# Накопленные знания:

## **Как "выглядит" настоящий программист? (How it looks like?)**
 
- БЫСТРО ПЕЧАТАЕТ!!!
- у него хороший компьютер
- у него хороший английский язык
- умение искать быстро информацию в Интернете и везде
- способность все время обучаться
- гибкость мышления, адаптивность
- хорошая память
- способность концентрироваться на задаче
- образованность, широкий кругозор
- креативное мышление
- усидчивость
- умение работать в команде
- умение отдыхать и вставать из-за компьютера
- внимательность к коду
- умение ставить вопросы и искать на них ответы
- ... ему хорошо платят

## Алгоритм и его свойства
**Алгоритм** — это _четкая_ _последовательность_ _действий_, выполнение которой дает какой-то заранее
известный _результат_.

**Главные свойства алгоритма:**
1. Дискретность (разбит на шаги).
2. Результативность (имеется результат на каждом шагу и по итогу).
3. Детерминированность (однозначность, отсутствует возможность "толкования").
4. Конечность (завершается).



## Переменные и их типы
 **8 примитивных типов данных**:
 byte - целое число занимает в памяти 1 байт
 short - целое число занимает в памяти 2 байта
 char - целое положительное число занимает в памяти 2 байта
 int - целое число занимает в памяти 4 байта
 long - целое число занимает в памяти 8 байт
 float - число с плавающей точкой занимает в памяти 4 байта
 double - число с плавающей точкой занимает в памяти 8 байт
 boolean - специальный логический тип принимающий одно из двух значений: true или false

Имя переменной (идентификатор) начинаем с маленькой буквы, не начинаем с цифр, служебных символов

Имя метода начинаем с маленькой буквы. 
camelCase - это стиль наименования, когда 1-я буква - маленькая, а далее "слова" начинаются с большой.

toDoSimething - это верное название метода.

ToDoOne - по соглашению так называть не следует.

Имя класса начинаем с Большой буквы.

## Методы 
Метод, который ничего не принимает (пусто) и ничего не возвращает, выглядит так:

piblic static void methodName(){ // void указывает на то, что метод ничего не возвращает
    do_something;
}

Метод, который принимает параметры (аргументы) и ничего не возвращает выглядит так:

piblic static void methodName(T1 t1, T2 t2){
    do_something;
}

Метод, который принимает параметры (аргументы) и возвращает результат типа T выглядит так:

piblic static T methodName(T1 t1, T2 t2){
    do something;
    return ...; // ответ, результат из/от метода
}

Если метод возвращает данные, то только ОДНОГО ТИПА.

Любой метод вызывается по его имени либо без параметров, либо с параметрами, которые передаются 
в метод.




