# Abstract classes and methods

1. If you need to create a class from which other classes should inherit, but this must be prohibited
   creation of objects of this parent class, then you can declare the parent class as abstract,
   using the abstract keyword before the class name. Abstract class objects cannot be created.

2. You can create abstract methods in abstract classes. These are methods whose signature contains
   abstract keyword and no method body. Abstract methods must be overridden in child classes.
   If the child class does not override the abstract method, then it (the class) must also be declared abstract.

## Examples of abstract classes and their methods:

### Example 1
Language:


### Example 2

Human:


### Example 3

List


### Example 4

Shape


3. Practice for today:
    - create an abstract class practice.model.Employee and define an abstract method calcSalary() in it

    - create child classes practice.model.Manager, practice.model.SalesManager and Worker, implement payroll methods in them:
        - practice.model.Manager: base + grade*hours
        - practice.model.SalesManager: salesValue * percent
        - Worker: grade*hours

    - in the EmployeAppl application, hire several employees (up to 10) in the company and calculate the total annual salary.

_________________________________________________________

# Абстрактные классы и методы

1. При создании приложений бывает полезно/необходимо создать класс от которого должны наследоваться другие классы, 
   но при этом целесообразно запретить создание объектов этого родительского класса.
   В этом случае родительский класс объявляется как абстрактный,
   используя ключевое слово **abstract** перед именем класса. 
   **Объекты абстрактного класса создавать нельзя.**

   Пример:
   
      `public abstract class Transport { ... }`

   тогда для этого класса будет запрещено создание его объектов, но можно наследовать классы Car, Bus, LKW и т.д.
   с родительскими полями и методами (super).

2. В абстрактных классах можно создавать абстрактные методы. Это методы у которых в сигнатуре присутствует
   ключевое слово abstract и **отсутствует тело метода**. Абстрактные методы должны быть переопределены 
   в дочерних классах. 
   
   NB: Если дочерний класс не переопределяет абстрактный метод, то он (класс) 
   тоже должен быть объявлен как абстрактный.

## Примеры абстрактных классов и их методов:

### Пример 1
      public abstract class Language{
            String locale;
            String group;
      
            abstract void setLanguage();
        }

### Пример 2
      abstract class Human {
         String sex;
         String race;

         abstract void eatFood();
         abstract void sleep();
      }

### Пример 3 
    abstract class Shape {
        douuble size;

        abstract double perimeter();
    }

3. Практика
Задание:
    - создать абстрактный класс practice.model.Employee и определить в нем абстрактный метод calcSalary()
    - создать дочерние классы practice.model.Manager, practice.model.SalesManager и  Worker, реализовать в них методы начисления зарплаты:
        - practice.model.Manager: base + grade*hours
        - practice.model.SalesManager: salesValue * percent
        - Worker: grade*hours
    - в приложении EmployeeAppl "нанять" в компанию несколько сотрудников (массив до 10 элементов) и 
      подсчитать общий годовой объем зарплаты и средний возраст сотрудников компании.