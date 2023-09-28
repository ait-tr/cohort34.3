# OOP - object-oriented programming (OOP)

## Inheritance

1. Inheritance (English inheritance) - the concept of object-oriented programming,
   according to which the created data type can inherit data and functionality
   from some already existing type, promoting the reuse of components
   software.

A simpler and more practical definition of inheritance:
a new class being created can inherit fields and methods from an existing class.
In the child class, the composition of the fields is expanded, and the methods are redefined.

2. To initialize inheritance from another class, use the service word **extends**.

Examples:

public class Laptop extends Computer{
...
}

public class Dog extends Pet {
...
}

public class Cat extends Pet {
...
}

    The parent class is also called a super class (**super**). The successor class is called a child class.
    You can only inherit from one class.
    Using inheritance in Java, you can build complex class hierarchies.

3. A successor class, inherits the fields and methods of the super class.
   In a child class, you can override the methods of the parent class if necessary
   change or define new functionality in them.
   Constructors are not inherited (except for the default one, if other constructors
   No).
   In addition to the public and private modifiers, there are also protected and package modifiers
   protected (which is the default modifier).

4. If it is necessary to prohibit inheritance from a class, then the final modifier is used.

final class SuperMan {
...
}

5. All classes that do not have a super class explicitly specified are inherited from the Object class.
   That is, the Object class is the parent of all classes in Java by default.
   In particular, all classes inherit from the Object class the toString method, which returns a string
   representation of the object (fields and their values in one line).

6. Check type correspondence (relatedness of objects of different classes),
   you can use the instanceof operator.

__________________________________________________


# ООП - объектно ориентированное программирование (OOP)

## Наследование

1. Наследование (англ. inheritance) — концепция объектно-ориентированного программирования,
   согласно которой создаваемый тип данных может наследовать данные и функциональность
   от некоторого уже существующего типа, способствуя повторному использованию компонентов 
   программного обеспечения.

Более простое и практичное определение наследования:
создаваемый новый класс может наследовать поля и методы от уже существующего класса.
В дочернем классе состав полей расширяется, а методы переопределяются.

2. Для инициализации наследования от другого класса используют служебное слово **extends**.

Примеры:

  public class Laptop extends Computer{
    ...
  }
______________________________________________

  public class Dog extends Pet {
    ...
  }

  public class Cat extends Pet {
    ...
  }

   Родительский класс называют еще супер-классом (**super**). Класс наследник, называют дочерним классом.
   Наследовать разрешено только от одного класса.

   При помощи наследования, в Java, можно строить сложные иерархии классов.

3. Класс-наследник, наследует поля и методы супер-класса. 
  В дочернем классе можно переопределить методы родительского класса, если необходимо 
  изменить, или определить в них новую функциональность. 
  Конструкторы не наследуются (кроме дефолтного, если других конструкторов
   нет). 
  Кроме модификаторов public, private, существуют еще модификаторы protected и package
   protected (являющийся дефолтным модификатором). 

4. Если необходимо запретить наследование от класса, то используется модификатор final.

final class SuperMan {
  ...
}

5. Все классы у которых явно не указан супер-класс, наследуются от класса Object. 
 То есть класс Object является родителем всех классов в Java по умолчанию.
 В том числе, все классы наследуют от класса Object метод toString, возвращающий строковое 
 представление объекта (поля и их значения в одной строчке).

6. Проверить соответствие типов (родство объектов разных классов), 
можно при помощи оператора instanceof.
