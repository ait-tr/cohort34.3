# Lesson plan No. 17 09/27/2023

1.Homework:
- Pet class
- Student class

2. Theory:
   OOP is the next generation programming paradigm.
   Classes, objects, fields and methods.
   OOP principles (three main ones):
    - encapsulation;
    - **polymorphism;** - see the Theory section.
    - inheritance.


3. Practice:

- Draw a diagram in which the terms will be present:
    - Class
    - Fields
    - Object(s)
    - Methods

- Class fields:
  We reinforce the skill of defining class fields and assigning them the correct data types.
  Consider the following classes:
    - Company
    - Tree
    - Building
    - Letter
    - User

For each class we create a set of 4-5 main fields and define their types.

- Let's implement the BankAccount class:
    - fields: account, owner, bank, branch, balance
    - create several constructors for different needs (this is an illustration of polymorphism)
    - implement the display() and display(String greeting) method (this is another illustration
      polymorphism)
    - implement the deposit and withdraw methods

___________________________________________

# План занятия №17 27.09.2023

1. Homework:
- класс Pet 
- класс Student

2. Теория:
   ООП - парадигма программирования следующего поколения.
   Классы, объекты, поля и методы. 
   Принципы ООП (три главных):
   - инкапсуляция;
   - **полиморфизм;**  - см. раздел Теория.
   - наследование.


3. Практика:

- Нарисуйте схему, на которой будут присутствовать термины:
  - Класс
  - Поля
  - Объект(ы)
  - Методы

- Поля класса:
закрепляем навык определения полей класса и задания им правильных типов данных.
Рассмотрим следующие классы:
  - Компания
    long id; // он же налоговый номер
    String companyName;
    String companyType;
    int year; // год основания, дата - это будет отдельный тип Data
    int employee; // кол-во сотрудников
    
address - плохая идея, адреса выносят в отдельный класс

  - Дерево
    long id;
    String breed; // порода, вид
    int age;
    double height; // рост, высота
    double diametr; 
    boolean type; // пригодность к чему-то

  - Здание
    long kadastrNumber;
    int floors; // этажность
    boolean isLeaving; // жилое или нет
    double square; // площадь
    int yearOfBuilding; // год постойки

address - плохая идея, адреса выносят в отдельный класс

  - Письмо
    String sender;
    String receiver; 
    int postIndex;
    String city;
    String street;
    String houseNumber;
    double weight; 
    double price;
    String type;
    boolean isLocal;

  - Пользователь
    long customerId;
    String login; // nic name
    String firstName;
    String lastName;
    String email;
    String phone;
    int age;
    String gender; // или boolean
    String password;
    String country;


Для каждого из классов делаем набор из 4-5 главных полей, определяем им типы.

- Реализуем класс BankAccount:
  - поля: account, owner, bank, branch, balance
  - создаем несколько конструкторов под разные нужды (это иллюстрация полиморфизма)
  - реализуем метод display() и display(String greeting) (это еще одна иллюстрация
  полиморфизма)
  - реализуем методы deposit и withdraw

