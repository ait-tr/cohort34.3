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

Взгляд на программирование «под новым углом» (отличным от процедурного) предложили
**Алан Кэй** и **Дэн Ингаллс** в языке Smalltalk. Здесь понятие **класса** стало 
основообразующей идеей для всех остальных конструкций языка 
(то есть класс в Smalltalk является примитивом,
посредством которого описаны более сложные конструкции).
Именно он стал первым широко распространённым объектно-ориентированным 
языком программирования.

**Java** – высокоуровневый язык программирования, изначально разработанный компанией
Sun Microsystems и выпущенный в 1995 году.
Работает на различных платформах, таких как Windows, Mac OS, а также различных версий UNIX.
Java - это язык, который полностью **реализует концепцию ООП**.

## Три признака Объектно-ориентированного программирования: 
- инкапсуляция, наследование, полиморфизм.
Эти три слова надо знать, постепенно мы с ними разберемся.
Сегодня - инкапсуляция. Но перед этим поговорим о концепции ООП.

## Классы, объекты, поля и методы.

Классы в Java определяют новые типы данных, которые формируются из имеющихся 
примитивных типов данных.

Каждый класс инкапсулирует в себе Объекты, это экземляры данного типа одинаковые по 
главным характеристикам и поведению.

Инкапсулирует == описывет, задает шаблон, определяет характеристики и поведение Объектов 
класса.

Так же, как мы можем создать **множество переменных примитивного типа**,
мы можем создавать множество классов, а в них множество объектов данного класса.

Классы содержат поля и методы: 
* Поля содержат данные характеризующие объект. 
* Методы определяют функциональность объекта.


## Инкапсуляция
Инкапсуляция - это объединение в классе данных, характеризующих состояние 
объекта (состав полей, их значения), и функциональность отвечающую за его поведение (методы).

**Инкапсуляция** - это один из ключевых принципов ООП, который позволяет скрыть детали 
реализации объекта и предоставить только необходимый интерфейс для взаимодействия с ним.
Это подобно упаковке подарка - вы видите только внешний вид, не знаете, что внутри,
но можете узнать что внутри и действовать через методы.

За счет инкапсуляции обеспечивается механизм, позволяющий разграничивать доступ к 
различным полям и методам класса. Этот механизм называется "сокрытие".


## Создание Класса (капсулы)
- Шаг 1: создание полей
   - определяем перечень переменных и их типов, принимаем решения о значениях модификаторов
     * public или private
     * static
     
   - при написании кода идем в обратном направлении, сначала пишем:
      - модификатор
      - потом тип переменной
      - потом имя переменной

- Шаг 2: определение методов

   - стандартные методы:
      - конструктор (позволяет создавать объекты, экземпляры класса)
      - геттеры (позволяет получить значения полей объекта), get = получать
      - сеттеры (позволяет установить значения полей объекта), set = устанавливать значение

   - дополнительные методы


**Пример:**
**Автомобиль:** - новый ТИП данных(!!!) **Car**
Поля класса:

- марка: String brand;
- цвет: String color;
- модель: String model;
- год выпуска: int year;
- мощность двигателя: double enginePower;
- тип топлива: String fuelType;

  который включает в себя все перечисленные поля.

Совокупность **однородных объектов** формирует **Класс (Class)**.

- объекты описывают с помощью стандартных типов данных, задавая набор полей, которые характеризуют
объект. Совокупность полей – это есть описание объекта и его состояния 
(характеристики объекта).

- объекты класса создают с помощью **конструктора** (стандартного метода класса), 
значения полей устанавливают с помощью **сеттеров** (это стандартные методы класса),
значения полей узнают с помощью **геттеров** (это стандартные методы класса).

- состояние объектов изменяют с помощью МЕТОДОВ (пример для автомобиля - стоять, ехать, разгоняться,
  тормозить, сменить номер, сменить цвет и т.д.).

