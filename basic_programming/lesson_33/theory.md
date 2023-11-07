# Generics in Java

Starting with Java 5, the language introduced **Generics** - parameterized types (classes, interfaces) and methods.
The goal of generics is to make it possible to write universal, strongly typed code, in which the solution
about a specific type is postponed “for later”.

For example, the type on which an object “specializes” is not determined at the time the class is created,
and at the moment of object creation.

The (generic) parameter is indicated in angle brackets - <T>.

Usually the letters used are T (type), E(entry), K(key), V(value)

**Important rule:**
If we want to substitute a primitive type into Generic, for example int, double, boolean, then
we use wrapper classes Integer, Boolean, Double, Float, Byte, Short, Character

# Interfaces Comparable<T> and Comparator<T>

1. To sort an array of objects, you need to define a rule for comparing objects.
   That is, there must be a method that determines which of two objects is _conditionally_ greater, less, or equal.

   You can compare objects only by the contents of one of the fields or by constructing a logical expression by several fields.
   If the fields are either of a numeric type, then the comparison occurs using a mathematical method,
   If the field contains a string type, then the comparison occurs through equals alphabetically (using the lexical-graphic method).

2. In Java, there is an interface Comparable<T> with a single abstract method int compareTo(T e).
   We agreed that if the compareTo method returns a positive number, then the current object (this)
   conditionally greater than the method argument. If it returns a negative number, then it is conditionally less.
   If zero, then this and the received argument are the same according to the comparison criterion specified in the method.

   For a class to become sortable, it needs to add implements Comparable<T> and implement the method
   int compareTo(T e).

3. In Java, there is an interface Comparator<T> with a single abstract method int compare(T e1, T e2).
   The principle of operation is the same as in the Comparable interface, only here it is not this and argument (e) that are compared,
   and two arguments (e1 and e2).

4. Using the Comparable and Comparator interfaces, you can sort arrays of objects.

   If all the elements of the array are from a class that implements Comparable, then when sorting,
   decision to swap or not swap two elements of an array
   we accept based on the result of the compareTo method.

   If, in addition to the array itself, an object of type Comparator is defined for sorting,
   then the decision to rearrange array elements is made based on the result of the compare method.

_________________________________________________________

# Generics в Java

Начиная с Java 5 в языке появились **Generics** - параметризованные типы (классы, интерфейсы) и методы.
Задача дженериков, сделать возможным писать универсальный строго типизированный код, в котором решение
о конкретном типе откладывается "на потом".

Например, тип на котором "специализируется" объект определяется не в момент создания класса,
а в момент создания объекта.

Параметр (generic) указывается в угловых скобках - <T>.

Обычно используют буквы - T(type), E(entry), K(key), V(value)

**Важное правило:**
Если хотим подставить в Generic примитивный тип, например int, double, boolean, и т.д. то
используем классы-обертки Integer, Boolean, Double, Float, Byte, Short, Character, String

# Интерфейсы Comparable<T> и Comparator<T>

1. Для сортировки массива объектов, надо определить правило сравнения объектов.
   Т. е. должен быть метод, который определяет какой из двух объектов _условно_ больше, меньше или объекты равны.

   Сравнивать объекты можно только по содержимому **одного из полей** или строя логическое выражение, по нескольким полям.
   Если поля имеют либо числовой тип, то сравнение происходит математическим методом (вычитание и сравнение результата с 0), 
   Если поле содержит строковый тип, то сравнение происходит через equals по алфавиту (лексико-графическим методом).

2. В Java существует интерфейс Comparable<T> с единственным абстрактным методом int compareTo(T e).
   Много классов в Java implements этот интерфейс, чтобы класс можно было отсортировать по выбранному 
   в compareTo полю (native sorting).
   Для сортировки по выбранному полю оговорились, что если метод compareTo возвращает положительное число, 
   то текущий объект (this) условно больше аргумента метода и сравниваемые объекты надо поменять местами. 
   Если возвращает отрицательное число, то условно меньше, объекты не трогаем.
   Если ноль, то this и принимаемый аргумент одинаковы согласно указанному в методе критерию сравнения и 
   объекты опять не меняем местами.

   Чтобы класс стал сортируемым, ему надо добавить implements Comparable<T> и реализовать метод 
    int compareTo(T e).

3. В Java существует интерфейс Comparator<T> с единственным абстрактным методом int compare(T e1, T e2).
   Принцип работы такой же как и в интерфейсе Comparable, только здесь сравниваются не this и аргумент (е),
   а два аргумента (е1 и е2).

4. Используя интерфейсы Comparable и Comparator, можно сортировать массивы объектов.

   Если все элементы массива из класса, который implements Comparable, то при сортировке, 
   решение менять или не менять местами два элемента массива
   принимаем на основе результата работы метода compareTo.

   Если для сортировки, кроме самого массива, определен объект типа Comparator,
   то решение о перестановке элементов массива, принимаем на основе результата работы метода 
   compare из Comparator.
