# Accumulated knowledge

- wrapper classes: Byte, Short, Character, Integer, Long, Float, Double, Boolean.

What are they needed for? - Answer:

- applications with command line arguments

Why is this necessary? - Answer:

- String class and its methods

Why is this necessary? - Answer:

- TDD - test driven development
  Unit tests

Why is this necessary? - Answer:


**Algorithm for conducting Unit tests**
1. Select/create a directory for unit testing (usually in the directory where
   there is a class under test, and in it there are methods to be tested)

2. Create a new class (java file) in this directory with the name ClassNameTest

3. Import libraries into this Class (file):
   import org.junit.jupiter.api.Assertions;
   import org.junit.jupiter.api.BeforeEach;
   import org.junit.jupiter.api.Test;

4. We connect the class under test and its methods with a line like:
   ClassNameClassName; // this is a new field in the class ClassNameTest, in which the object of the class being tested is connected.

5. Directive
   @BeforeEach
   void setUp(){
   ClassName = new ClassName(); // create an instance of the tested class object before each test
   }

6. Directives
   @Test
   @DisplayName("This text can describe what we are testing")

   create a method that calls
   assert... (estimated: expected value, actual: call of the method under test, "Message (explanation) about ...")

   Example:
   void testMultiply(){
   assertEquals(20,calculator.multiply(4,5),"4*5 should be 20");
   }

7. Run the test

------------------------------

# Накопленные знания

- классы-обертки: Byte, Short, Character, Integer, Long, Float, Double, Boolean.

Зачем они нужны? - Ответ: в них много удобных и полезных методов. Подробности - в документации.

- приложения с аргументами командной строки

Зачем это нужно? - Ответ: чтобы понимать по метод main и его аргументы, это полезно знать.

- класс String и его методы

Зачем это нужно? - Ответ: "лексический разбор", проверка строк, обеспечение "безопасности", конверсия типов
(например, строку "12345" преобразуем в тип int и наоборот) и парсинг (выделение в строке элементов и их распознавание).

- TDD - test driven development
  Unit tests

Зачем это нужно? - Ответ: для тестирования методов более интенсивным путем, чем запуск приложений. Можно запускать 
каждый отдельный метод и разные случаи его работы. Можно тестировать вложенные и сложные методы. 
Тестирование упрощает написание кода (test driven development)!


**Алгоритм проведения Unit тестов**
1. Выбрать/создать директорию для проведения Unit-тестирования (обычно - в директории где
   находится тестируемый класс, а в нем - тестируемые методы)

2. Создать в этой директории новый класс (java-файл) с наименованием ИмяКлассаTest

3. Выполнить в этот Класс (файл) импорт библиотек:
   import org.junit.jupiter.api.Assertions;
   import org.junit.jupiter.api.BeforeEach;
   import org.junit.jupiter.api.Test;

4. Подключаем тестируемый класс и его методы строкой вида:
   ИмяКласса имяКласса; // это новое поле в классе ИмяКлассаTest, в котором подключается объект тестируемого класса.

5. Директива
   @BeforeEach
   void setUp(){
      имяКласа = new имяKласса(); // создаем экземпляр объекта тестируемого класса перед каждым тестом
   }

6. Директивы
   @Test
   @DisplayName("В этом тексте можно описать то, что мы тестируем")

   создать метод, вызывающий 
   assert... (estimated: ожидаемое значение, actual: вызов тестируемого метода, "Сообщение(пояснение) о ...")

   Пример:   
   void testMultiply(){
   assertEquals(20,calculator.multiply(4,5),"4*5 should be 20");
   }

7. Запустить тест

