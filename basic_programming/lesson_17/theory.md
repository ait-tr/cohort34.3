# OOP
# OOP - object oriented programming (OOP)

A look at programming “from a new angle” (different from the procedural one) was offered
**Alan Kaye** and **Dan Ingalls** in Smalltalk. Here the concept of **class** became
the fundamental idea for all other language constructs
(that is, a class in Smalltalk is a primitive,
through which more complex structures are described).
It was he who became the first widely used object-oriented
programming language.

**Java** is a high-level programming language originally developed by
Sun Microsystems and released in 1995.
Works on various platforms such as Windows, Mac OS, as well as various versions of UNIX.
Java is a language that fully **implements the concept of OOP**.

## Three hallmarks of Object Oriented Programming:
- encapsulation, inheritance, polymorphism.
  You need to know these three words, we will gradually understand them.
  Today - encapsulation. But before that, let's talk about the concept of OOP.

## Classes, objects, fields and methods.

Classes in Java define new data types that are formed from existing ones
primitive data types.

Each class encapsulates Objects, these are instances of a given type that are identical in
main characteristics and behavior.

Encapsulates == describes, defines a pattern, defines the characteristics and behavior of Objects
class.

Just like we can create **many primitive type variables**,
we can create many classes, and in them there are many objects of a given class.

Classes contain fields and methods:
* Fields contain data characterizing the object.
* Methods define the functionality of an object.


## Encapsulation
Encapsulation is the union in a class of data characterizing the state
object (composition of fields, their values), and functionality responsible for its behavior (methods).

**Encapsulation** is one of the key principles of OOP, which allows you to hide details
implementation of the object and provide only the necessary interface to interact with it.
It's like wrapping a gift - you only see the outside, you don't know what's inside,
but you can find out what’s inside and act through methods.

Encapsulation provides a mechanism to limit access to
various fields and methods of the class. This mechanism is called "hiding".


## Creating a Class (capsule)
- Step 1: Create fields
    - determine the list of variables and their types, make decisions on the values of modifiers
        * public or private
          *static

    - when writing code, we go in the opposite direction, first we write:
        - modifier
        - then the type of the variable
        - then the variable name

- Step 2: Define Methods

    - standard methods:
        - constructor (allows you to create objects, instances of a class)
        - getters (allows you to get the values of an object’s fields), get = receive
        - setters (allows you to set the values of an object’s fields), set = set a value

    - additional methods


**Example:**
**Car:** - new data TYPE(!!!) **Car**
Class fields:

- brand: String brand;
- color: String color;
- model: String model;
- year of manufacture: int year;
- engine power: double enginePower;
- fuel type: String fuelType;

  which includes all the listed fields.

A collection of **homogeneous objects** forms a **Class**.

- objects are described using standard data types, specifying a set of fields that characterize
  an object. A set of fields is a description of an object and its state
  (object characteristics).

- class objects are created using the **constructor** (standard class method),
  field values are set using **setters** (these are standard class methods),
  Field values are found using **getters** (these are standard class methods).

- the state of objects is changed using METHODS (example for a car - stand, drive, accelerate,
  slow down, change number, change color, etc.).

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

