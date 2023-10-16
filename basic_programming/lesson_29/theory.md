# Abstract classes and methods

1. When creating applications, it may be useful/necessary to create a class from which other classes should inherit,
   but at the same time it is advisable to prohibit the creation of objects of this parent class.
   In this case, the parent class is declared as abstract,
   using the **abstract** keyword before the class name.
   **Objects of an abstract class cannot be created.**

   Example:

       `public abstract class Transport { ... }`

   then the creation of its objects will be prohibited for this class, but you can inherit the classes Car, Bus, LKW, etc.
   with parent fields and methods (super).

2. You can create abstract methods in abstract classes. These are methods whose signature contains
   abstract keyword and **method body is missing**. Abstract methods must be overridden
   in child classes.

   NB: If a child class does not override an abstract method, then it (the class)
   must also be declared abstract.

## Examples of abstract classes and their methods:

### Example 1
       public abstract class Language{
             String locale;
             String group;
      
             abstract void setLanguage();
         }

### Example 2
       abstract class Human {
          String sex;
          String race;

          abstract void eatFood();
          abstract void sleep();
       }

### Example 3
     abstract class Shape {
         double size;

         abstract double perimeter();
     }

_________________________________________________________

# StringBuilder

Ссылка на документацию Oracle по Java:
https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html


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
   
   NB!: Если дочерний класс не переопределяет абстрактный метод, то он (класс) 
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
