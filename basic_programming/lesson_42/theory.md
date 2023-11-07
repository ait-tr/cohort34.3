# Exceptopns, Try ... catch, throw

## Exceptopns, Try ... catch, throw.

An error in a method interrupts its work at the point of origin of the error, and destroys the entire stack of functions.
At the same time, Java creates and “forwards” a special object characterizing the error.
All such objects inherit the **Throwable** class.

All Throwable descendants are divided into two categories: **Error** and **Exception**.
Error are errors with which nothing can be done. For example, lack of memory.
The second category, Exception - exceptional situations caused by an incorrect state of the program.

There are two types of errors: **checked** (checked) and **unchecked** (unchecked).
The first type the compiler “sees” and forces the programmer to somehow react to them.
How to respond to unverifiable errors (and whether to respond at all) is up to the developer to decide.

Error handling is carried out using the **try-catch-finally** construct.
In try blocks we indicate what to do if everything is fine. We handle errors in the catch block.
The finally block is executed in any case.

We can create our own errors and “throw” them using the throw keyword.
If we want to create a checked exception, then we can extend the Exception class.
If unchecked, then we inherit the RuntimeException class.

If we encounter a checked exception, but do not want to handle it in this method using
try-catch, and decide to throw this exception to the calling method, then you can use the key
with the word throws in the method signature.
______________________

#Exceptions

Exception - exception, special situation (translation from English)

## Major reasons why an exception Occurs
* **Invalid user input - incorrect user input (80-90% of cases)**
* Device failure - the device has broken down, the power has been turned off, etc.
* Loss of network connection - lost Internet, Ethernet, etc.
* Physical limitations (out of disk memory) - lack of RAM memory, hard drives
* Opening an unavailable file - opening an unavailable file
* * **Code errors - programmer code errors**

### Differences between Error and Exception that is as follows:
* **Error:** An Error indicates a **serious problem** that a reasonable application
  should **not try to catch**.
* **Exception:** Exception indicates **conditions** that a reasonable application
  **might try to catch**.

The **try ... catch** construction is used when the program terminates.
incorrect, the program exit code is different from 0.

### Syntax
`try { // try
// Block of code to try

}
catch(Exception e) { // catch
// Block of code to handle errors
}`
#### Explanations
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

You can handle many exceptions and user errors yourself using if , BUT WHY?
Java developers provide standard tools for this -
this is the Throwable class (a descendant of the Object class) and its methods.

Examples:
1. Division by 0;
2. Going beyond the array;
3. Checking user input for correctness.

Good article with examples:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

Algorithm for using try ... catch
1. If the program crashes (the termination code is not equal to 0), work with the user stops
2. then we look at the diagnostics - what is printed at the moment the program crashes, there are indications of line numbers
   in the code where errors occur
3. These lines need to be “dressed” with a try ... catch construction


=============================================

# ENUM - briefly

An enumeration type is a special data type that allows a variable to be a set of predefined constants.
The variable must be equal to one of its predefined values. Since they are constants,
The names of fields of an enumerated type are written in capital letters.

In the Java programming language, the type of an enumeration is defined using the enum keyword.
For example, you can specify the enumeration type for days of the week like this:

public enum Day {
SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
THURSDAY, FRIDAY, SATURDAY
}

All enums implicitly extend java.lang.Enum.
Here is a link to the official Oracle tutorial on enumerated types:
<a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Enum</a>

**Scope of application of ENUM**
Problems in which there is a finite list of values, for example:
- days of the week
- months of the year
- Seasons
- user roles in the system (USER, GUEST, ADMIN, MANAGER)
- ...
  Otherwise, we would have to create an array of the appropriate type for each such list.

--------------------------

# Java Time API

Java Time API is a set of classes and interfaces for working with date, time, calendar.

## Application, use
Classes LocalDate, LocalTime, LocalDateTime are designed to create objects associated with the date,
time, date-time, respectively.
Objects of these classes are immutable.
These classes do not have public constructors.
Objects of these classes are created through static methods.
For example, the now() method creates an object associated with the current date or time.
With the of method, you can create an object associated with a specific date or time.

The LocalDate, LocalTime, LocalDateTime objects have many getters that allow you to get
date or time information.
For example, the getDayOfYear method will return the ordinal number of the day in the year.
And the getDayOfWeek method will return the DayOfWeek enum associated with the day of the week.

Objects LocalDate, LocalTime, LocalDateTime are comparable (Comparable).
In addition, using the isBefore, isAfter methods, you can find out the date comes before or after the argument.

The plus and minus methods and their variants allow you to add or subtract time intervals from dates.
Using enum ChronoUnit, you can determine what time intervals are in question.
For example, ChronoUnit.HOURS is hours and ChronoUnit.MINUTES is minutes. And so on.

ChronoUnit objects have methods. For example ChronoUnit.YEARS.between() takes two dates and returns
total number of years between them.

## Convert dates to strings and back
To convert dates to and from String, you must define a format according to ISO 8601.
DateTimeFormatter is a class responsible for formats. It has predefined formats in the form of constants.
Or, using the static method DateTimeFormatter.ofPattern(), you can create a format from a pattern.

The parse() method for date and time objects can create an object from a string in accordance with the specified format.
The format() method, on the contrary, converts the object to a string according to the given format.

## Useful links
Here is a link to the official Oracle tutorial on
<a href="https://docs.oracle.com/javase/tutorial/datetime/index.html"> Java Time API</a> and
link to
<a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html"> DateTimeFormatter</a>

____________________________________________________

# Exceptions, Try ... catch, throw

## Exceptions, Try ... catch, throw.

Ошибка в методе, прерывает его работы в точке происхождения ошибки, и разрушает весь стек функций.
При этом Java создает и "пробрасывает" специальный объект характеризующий ошибку.
Все такие объекты наследуют классу **Throwable**.

Все наследники Throwable делятся на две категории: **Error** и **Exception**.
Error - это ошибки с которыми ничего сделать нельзя. Например, нехватка памяти.
Вторая категория, Exception - исключительные ситуации вызванные некорректным состоянием программы.

Ошибки бывают двух типов: **checked** (проверяемые) и **unchecked** (непроверяемые).
Первый тип компилятор "видит" и заставляет программиста как-то на них отреагировать.
Как реагировать на непроверяемые ошибки (и реагировать ли вообще), решает сам разработчик.

Обработка ошибок осуществляется при помощи конструкции **try-catch-finally**.
В блоки try мы указываем, что делать если все нормально. В блоке catch обрабатываем ошибки.
Блок finally выполняется в любой случае.

Мы можем создавать свои ошибки и "бросать" их при помощи ключего слова throw.
Если мы хотим создать проверяемое исключение, то можно наследовать классу Exception.
Если непроверяемое, то наследуем классу RuntimeException.

Если мы столкнулись с проверяемым исключением, но не хотим его обрабатывать в данном методе при помощи
try-catch, и решили пробросить это исключение в вызывающий метод, то можно воспользоваться ключевым
словом throws в сигнатуре метода.
______________________

# Exceptions

Exception - исключение, особая ситуация (перевод с английского)

## Major reasons why an exception Occurs
* **Invalid user input - неправильный ввод пользователя (80-90% случаев)**
* Device failure - сломалось устройство, выключили питание и т.д.
* Loss of network connection - потеряли Интернет, Ethernet и т.д.
* Physical limitations (out of disk memory) - нехватка памяти ОЗУ, жестких дисков
* Opening an unavailable file - открытие недоступного файла
* * **Code errors - ошибки кода программистов**

### Differences between Error and Exception that is as follows:
* **Error:** An Error indicates a **serious problem** that a reasonable application
  should **not try to catch**.
* **Exception:** Exception indicates **conditions** that a reasonable application
  **might try to catch**.

Кострукция **try ... catch** используется в тот момент, когда программа завершает работу
некорректно, Code выхода из программы отличен от 0.

### Синтаксис
`try { // попытаться
//  Block of code to try

}
catch(Exception e) { // схватить
//  Block of code to handle errors
}`
#### Пояснения
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Многие исключения и ошибки пользователя можно обрабатывать самому с помощью if , НО ЗАЧЕМ?
Разарботчики Java предоставляют стандартный инструментарий для этого -
это класс Throwable (потомок класса Object) и его методы.

Примеры:
1. Деление на 0;
2. Выход за пределы массива;
3. Проверка ввода пользователя на корректность.

Хорошая статья с примерами:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

Алгоритм применения try ... catch
1. Ели программа падает (код окончания не равен 0) , работа с пользователем прекращается
2. то смотрим на дигностику - то, что печатается в момент падения программы, там есть указания на номера строк
   в коде, в которых происходят ошибки
3. На эти строки надо "одеть" конструкцию try ... catch

==============================================

# ENUM - кратко

Тип перечисления — это специальный тип данных, который позволяет переменной быть набором предопределенных констант.
Переменная должна быть равна одному из предопределенных для нее значений. Поскольку они являются константами,
имена полей перечисляемого типа пишутся большими буквами.

В языке программирования Java тип перечисления определяется с помощью ключевого слова enum.
Например, вы можете указать тип перечисления дней недели следующим образом:

	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}

Все перечисления неявно расширяют java.lang.Enum.
Вот ссылка на официальный Oracle туториал по перечисляемым типам:
<a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Enum</a>

**Область применения ENUM**
Задачи, в которых имеется конечный перечень значений, например:
- дни недели
- месяцы в году
- времена года
- роли пользователей в системе (USER, GUEST, ADMIN, MANAGER)
- ...
  Иначе пришлось бы заводить массив соответствующего типа под каждый такой список.

------------------------------------

# Java Time API

Java Time API, это набор классов и интерфейсов для работы с датой, временем, календарем.

## Применение, использование
Классы LocalDate, LocalTime, LocalDateTime предназначены для создания объектов связанных с датой,
временем, датой-временем, соответственно.
Объекты этих классов являются неизменными (immutable).
У этих классов нет публичных конструкторов.
Объекты этих классов создаются через статические методы.
Например, метод now() создает объект связанный с текущей датой или временем.
При помощи метода of можно создать объект связанный с конкретной датой или временем.

У объектов LocalDate, LocalTime, LocalDateTime есть множество геттеров, позволяющих получить
информацию о дате или времени.
Например, метод getDayOfYear вернет порядковый номер дня в году.
А метод getDayOfWeek вернет enum DayOfWeek связанный с днем недели.

Объекты LocalDate, LocalTime, LocalDateTime сравниваемы (Comparable).
Кроме того, при помощи методов isBefore, isAfter можно узнать дата идет до или после аргумента.

Методы plus, minus и их варианты позволяют прибавлять или вычитать из дат временные промежутки.
При помощи enum ChronoUnit можно определять о каких временных промежутках идет речь.
Например, ChronoUnit.HOURS - это часы, а ChronoUnit.MINUTES - минуты. И т. п.

У объектов ChronoUnit есть методы. Например ChronoUnit.YEARS.between() принимает две даты и возвращает
полное количество лет между ними.

## Преобразование дат в строки и обратно
Для преобразований дат в String и обратно необходимо определять формат даты и времени в соответствии с ISO 8601.
DateTimeFormatter это класс отвечающий за форматы. Он имеет предопределенные форматы в виде констант.
Или при помощи статического метода DateTimeFormatter.ofPattern() можно создать формат по шаблону.

Метод parse() у объектов даты, времени может создать объект из стринга в соответствии с указанным форматом.
Метод format() наоборот, преобразует объект в стринг в соответствии с заданным форматом.

## Полезные ссылки
Вот ссылка на официальный Oracle туториал по
<a href="https://docs.oracle.com/javase/tutorial/datetime/index.html"> Java Time API </a> и
ссылка на
<a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html"> DateTimeFormatter </a>
