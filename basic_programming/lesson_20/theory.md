Русский текст смотри ниже


1. Inheritance is an object-oriented programming concept,
    according to which an abstract data type can inherit data and functionality
    of some existing type, promoting the reuse of software components
    provision. In Java, abstract data types are called classes.
2. One class can inherit from another class using the special word extends.
    The parent class is also called a super class. The successor class is called a child class.
    You can only inherit from one class. Using inheritance in Java, you can
    build complex class hierarchies.
3. The class is a successor, inherits the fields and methods of the super class. In a child class you can override
    methods of the parent class, if necessary, change, or define a new one in them
    functionality. Constructors are not inherited (except for the default one, if other constructors
    No). In addition to the public and private modifiers, there are also protected and package modifiers
    protected (which is the default modifier).
4. All classes that do not have a superclass explicitly specified inherit from the Object class. For example they
    inherit from the Object class the toString method, which returns a string representation of the object.
5. A reference of a parent type can refer to an object of a child type. In this case Java itself
    will conduct upper casting. If you try to assign a link value to a child type link
    parent type, the compiler will require explicit down casting. Wherein,
    if a parent type reference points to another child object, then at runtime
    code, an error will occur. You can check type matching using the instanceof operator.

<br/>

1. Наследование (англ. inheritance) — концепция объектно-ориентированного программирования, 
   согласно которой абстрактный тип данных может наследовать данные и функциональность 
   некоторого существующего типа, способствуя повторному использованию компонентов программного 
   обеспечения. В Java абстрактные типы данных называют классами.
2. Один класс может наследовать от другого класса используя специальное слово extends. 
   Родительский класс называют еще супер-классом. Класс наследник, называют дочерним классом. 
   Наследовать разрешено только от одного класса. При помощи насследования, в Java, можно 
   строить сложные иерархии классов.
3. Класс наследник, наследует поля и методы супер-класса. В дочернем классе можно переопределить 
   методы родительского класса, если необходимо изменить, или определить в них новую 
   функциональность. Конструкторы не наследуются (кроме дефолтного, если других конструкторов 
   нет). Кроме модификаторов public, private, существуют еще модификаторы protected и package 
   protected (являющийся дефолтным модификатором).
4. Все классы у которых явно не указан супер-класс, наследуют от класса Object. Например они 
   наследуют от класса Object метод toString, возвращающий строковое представление объекта.
5. Ссылка родительского типа может ссылаться на объект дочернего типа. В этом случае Java сама 
   проведет upper casting. Если попытаться ссылке дочернего типа присвоить значение ссылки 
   родительского типа, то компилятор потребует явно провести кастинг (down casting). При этом, 
   если ссылка родительского типа указывает на другой дочерний объект, то в процессе выполнения 
   кода, произойдет ошибка. Проверить соответствие типов, можно при помощи оператора instanceof.
