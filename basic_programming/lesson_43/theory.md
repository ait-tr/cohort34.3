
## Complexity (computational complexity)

The concept of Complexity (computational complexity) allows you to evaluate the effectiveness of the applied algorithmic solutions.
In simple terms, we can say that the computational complexity tells which function it grows in proportion to
the number of actions when processing many elements, if you increase the number of elements of this
multitudes.

To describe computational complexity, the so-called "Big O notation".
For example, the notation O(n) indicates the linear complexity of the algorithm.
O(log(n)), characterizes logarithmic complexity.


## Iterator

An iterator and iterations are a way to iterate over an entire set of elements.

This is a system problem:
**If an object encapsulates some set of elements within itself, and there is a need to iterate
all the elements of this set, then this may be a problem.
If we create a getter to pass this set, then by returning the reference, we are essentially giving an unsafe
access to a set outside the object. The programmer who has received this access can, without our knowledge,
modify an object - change the composition of elements, reduce its size, etc.**.

**Returning a copy of a set may impact performance.**

To solve this problem, there is the **Iterator pattern**.

The essence of the pattern is to create a third-party object that knows how to “iterate” a set
elements encapsulated in the original object.
An iterator object must have two functionality:
1) know how to determine whether there is a next element;
2) return the current element and move on to the next one.

In Java, there is an Iterator<T> interface with two abstract methods: boolean hasNext(),
returning true if there are still elements, and false if we have reached the end of the set, and T next()
returning the current element, and moving the "pointer" to the next element.
The Iterator interface has an additional default method, void remove(),
which has an empty body. But if we need to implement the functionality of correct deletion
current element during iteration, the remove method must be overridden.

The class encapsulating the set that needs to be iterated can implement the Iterable<T> interface,
which has only one abstract method Iterator<T> iterator(), returning an iterator for objects
of this class.

For Iterable objects you can use a for-each loop. Its signature is like this:
for(T e: "set of T"){
do something};

In the body of this loop, the variable "e" takes the value of each element in turn
(T e: "set of T"){
do something};
In the body of this loop, the variable "e" takes in turn the value of each element from the iterated set.

**ATTENTION!!!**
In a for-each loop, you cannot modify the iterable set.


Java Collection Framework (JCF) - a set (set) of classes and interfaces that are most often implemented
data structures used. JCF consists of two large subsections: Map and Collection.
We begin our study with collections.

The Collection interface extends the Iterable interface, meaning all collections are iterable.
The Collection interface defines a basic set of methods for working with collections of data.
For example, adding, deleting, searching, getting the number of elements in a collection, etc.

There are many interfaces that extend the Collection interface. We'll look at the Set and List interfaces.
Let's start with the List interface. The List interface defines collections whose elements have indexes,
i.e., some kind of analogue of an array, but without a size limit. Accordingly, in the List interface,
In addition to methods inherited from Iterable and Collection, methods that work with indexes are defined.
For example, insertion by index, deletion by index, getting an element by index, searching for a given index
element, etc.

One of the implementations of the List interface is the ArrayList class. To implement functionality
interface List, ArrayList encapsulates an array of some initial size. When this array
is completely filled, its elements are copied to a new array, but of a larger size.
And now we wait for the new array to be filled. Etc.
That is, in simple terms, ArrayList is a “rubber array”.

-------------------------------

## Complexity (вычислительная сложность)

Понятие Complexity (вычислительная сложность), позволяет оценить эффективность применяемых алгоритмических решений.
Простым языком можно сказать, что вычислительная сложность говорит, пропорционально какой функции растет
количество действий при обработке множества элементов, если увеличивать количество элементов этого
множества.

Для описания вычислительной сложности используется т. н. "Big O notation".
Например, запись O(n), говорит о линейной сложности алгоритма.
O(log(n)), характеризует логарифмическую сложность.


## Итератор

Итератор и итерации - это способ перебора всего множества элементов.

Это системная проблема:
**Если объект инкапсулирует внутри себя какое-то множество элементов, и есть необходимость перебрать
все элементы этого множества, то с этим может возникнуть проблема.
Если для передачи этого множества создать геттер, то возвращая ссылку, мы по сути даем небезопасный
доступ к множеству за пределами объекта. Получивший этот доступ программист может без нашего ведома
модифицировать объект - изменить состав элементов, сократить его размер и т.д**.

**Если возвращать копию множества, то это может повлиять на производительность.**

Для решения этой проблемы существует **паттерн "Итератор"**.

Суть паттерна в том, чтобы создать сторонний объект, который знает как "перебирать" (итерировать) множество
элементов инкапсулированных в исходном объекте.
Объект итератор должен иметь две функциональности:
1) знать как определить есть ли следующий элемент;
2) вернуть текущий элемент и перейти к следующему.

В Java существует интерфейс Iterator<T> с двумя абстрактными методами: boolean hasNext(),
возвращающий true, если еще есть элементы, и false если дошли до конца множества, и T next()
возвращающий текущий элемент, и переводящий "указатель" к следующему элементу.
В интерфейсе Iterator существует еще дополнительный дефолтный метод void remove(),
который имеет пустое тело. Но если нам надо реализовать функциональность корректного удаления
текущего элемента в процессе итерирования, то метод remove надо переопределить.

Класс инкапсулирущий множество, которое надо итерировать, может имплементировать интерфейс Iterable<T>,
у которого только один абстрактный метод Iterator<T> iterator(), возвращающий итератор для объектов
данного класса.

Для Iterable объектов можно использовать цикл for-each. Его сигнатура вот такая:
for(T e: "set of T"){
do something};

В теле этого цикла переменная "e" принимает поочередно значение каждого элемента
(T e: "set of T"){
do something};
В теле этого цикла переменная "e" принимает поочередно значение каждого элемента из итерируемого множества.

**ВНИМАНИЕ!!!**
В цикле for-each нельзя модифицировать итерируемое множество.


Java Collection Framework (JCF) - множество(набор) классов и интерфейсов которые реализуют наиболее часто
используемые структуры данных. JCF состоит из двух больших подразделов: Map и Collection.
Мы начинаем наше изучение с коллекций.

Интерфейс Collection расширяет интерфейс Iterable, т. е. все коллекции итерируемые.
Интерфейс Collection определяет некоторый основной набор методов для работы с коллекциями данных.
Например, добавление, удаление, поиск, получение колличества элементов в коллекции и т. д.

Есть множество интерфейсов расширяющих интерфейс Collection. Мы рассмотрим интерфейсы Set и List.
И начнем с интерфейса List. Интерфейс List определяет коллекции элементы которых имеют индексы,
т. е. некий аналог массива, но не имеющий ограничения по размеру. Соответственно в интерфейсе List,
помимо методов унаследованных от Iterable и Collection, определены методы работающие с индексами.
Например, вставка по индексу, удаление по индексу, получение элемента по индексу, поиск индекса заданного
элемента и т. п.

Одной из имплементаций интерфейса List является класс ArrayList. Для реализации функциональности
интерфейса List, ArrayList инкапсулирует в себе массив некоторого начального размера. Когда этот массив
полностью заполняется, то его элементы копируются в новый массив, но уже большего размера.
И теперь ждем когда заполнится новый массив. И т. д.
Т. е. простым языком ArrayList представляет собой "резиновый массив".
