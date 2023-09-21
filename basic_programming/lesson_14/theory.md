# Theory for the week

## Arrays

Given an array int[] array = new array[10];

How to find out the length of an array? -
What element is at the beginning of the array? -
What element is at the end of the array? -
What does the current array element look like? -
What does the next array element after the current one look like? -
What does the previous one before the current array element look like? -

## Filling an array with random data

* double a = Math.random(); - generates a random number in the range from [0, 1) - parentheses from mathematics
  [ => 0 - maybe ) => 1 - can't be
* double x = (Math.random() * (b-a) ) + a - generates a random number in the interval from [a, b) (a<b)
  a - maybe, b - can't be
* int n = (int)(Math.random() * (b - a + 1) + a) - generates a random **integer** number in the interval [a, b]
  a - maybe, b - maybe

## The for loop loops through all the elements of the array

         for( i = 0, i < array length, i++) {
             doSomething;
         }

## static modifier for method
static methods belong to the class in which they are created.
Such methods are called by class name.

__________________________________________________

# Теория за неделю

## Массивы

Задан массив int[] array = new array[10];

Как узнать длину массива? - 
Какой элемент стоит в начале массива? - 
Какой элемент стоит в конце массива? - 
Как выглядит текущий элемент массива? - 
Как выглядит следующий за текущим элементом массива? - 
Как выглядит предыдущий перед текущим элементом массива? - 

## Заполнение массива случайными данными

* double a = Math.random(); - генерирует случайное число в интервале от [0, 1) - скобки из математики
  [ =>  0 - может быть, ) => 1 - не может быть
* double x = (Math.random() * (b-a) ) + a  - генерирует случайное число в интервале от [a, b) (a<b)
  a - может быть, b - не может быть
* int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
  a  - может быть, b  - может быть

## Цикл for обеспечивает "обегание" всех элементов массива

        for( i = 0, i < длины массива, i++) {
            doSomething;
        }

## Модификатор static для метода
static методы принадлежат классу, в котором они созданы.
Такие методы вызываются по имени класса.



