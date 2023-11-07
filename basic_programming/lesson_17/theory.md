# OOP - object oriented programming (OOP)

A collection of **homogeneous objects** forms a **Class**.

- objects are described using standard data types, specifying a set of fields that
  characterize the object. A set of fields is a description of an object and its state
  (object characteristics).

- class objects are created using the **constructor** (standard class method),
  field values are set using **setters** (these are standard class methods),
  Field values are found using **getters** (these are standard class methods).

- the state of objects is changed using METHODS (example for a car - stand, drive, accelerate,
  slow down, change number, change color, etc.).

## The this keyword in Java
this is a keyword in Java that is used inside class methods to refer to
**current object**.

It means that we access the attributes or methods of the object in which the
given code.

The word **this** can be used to resolve naming conflicts between method arguments and
class fields if they have the same names.


## Polymorphism

There are two types of polymorphism:

- Parametric (true) polymorphism.
- "Ad-hoc" polymorphism. It is also called "overloading" of constructors and methods.

Today we will look at "Ad-hoc" polymorphism (polymorphism on demand).
Polymorphism in programming languages and type theory is the ability of a function (method) to process
data of different types.
In Java, ad-hoc polymorphism is implemented in the form of the ability to **overload methods**.

We can overload methods by creating several methods and constructors in a class with
with the same name, but different types and/or number of arguments.**

They say that a method is “overloaded” when we can work with the same method
with different sets of input arguments (parameters).

__________________________________________________


# ООП - объектно ориентированное программирование (OOP)

Совокупность **однородных объектов** формирует **Класс (Class)**.

- объекты описывают с помощью стандартных типов данных, задавая набор полей, которые 
характеризуют объект. Совокупность полей – это есть описание объекта и его состояния 
(характеристики объекта).

- объекты класса создают с помощью **конструктора** (стандартного метода класса), 
значения полей устанавливают с помощью **сеттеров** (это стандартные методы класса),
значения полей узнают с помощью **геттеров** (это стандартные методы класса).

- состояние объектов изменяют с помощью МЕТОДОВ (пример для автомобиля - стоять, ехать, разгоняться,
  тормозить, сменить номер, сменить цвет и т.д.).

## Ключевое слово this в Java
this - это ключевое слово в Java, которое используется внутри методов класса для ссылки на 
**текущий объект**.

Оно обозначает, что мы обращаемся к атрибутам или методам объекта, в котором выполняется 
данный код.

Слово **this** может быть использовано для разрешения конфликта имён между аргументами метода и 
полями класса, если они имеют одинаковые имена.


## Полиморфизм

Бывает два вида полиморфизма:

- Параметрический (истинный) полиморфизм. 
- "Ad-hoc" полиморфизм. Его еще называют "перегрузка" конструкторов и методов.

Сегодня мы рассмотрим "Ad-hoc" полиморфизм (полиморфизм по запросу).
Полиморфизм в языках программирования и теории типов — способность функции (метода) обрабатывать 
данные разных типов.
В Java ad-hoc-полиморфизм реализован в виде возможности **перегружать методы**.

Мы можем перегружать методы, создавая в классе **несколько методов и конструкторов с 
одинаковым названием, но отличающихся типами и/или количеством аргументов.**

Говорят, что метод "перегружен", когда мы можем одним и тем же методом работать 
с разными наборами входящих аргументов (параметров).

