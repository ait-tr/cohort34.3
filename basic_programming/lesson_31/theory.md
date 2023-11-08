# Interface in Java

1. In Java, you can create a structure that has only abstract methods.

   Such structures are called **interfaces**, and are defined using the **interface** keyword.
   Classes can implement interfaces using the implements keyword.

   In Java, classes can only extend one class, but they can implement
   (implements) multiple interfaces. In this case, the implemented interfaces are listed separated by commas.

2. The TDD approach (test-driven development) is very popular and has a number of advantages.

   Interfaces are often used in this approach. The interface defines
   required functionality (methods). Then we write tests for these methods.
   And then we implement these methods in the class so that the tests pass.

_________________________________________________________

# Interface в Java

1. В Java можно создать структуру, в которой указаны только абстрактные методы - это методы, у которых есть
   только сигнатура и нет тела.

   Такие структуры называются **интерфейсами**, и определяются при помощи ключевого слова **interface**.
   Классы могут имплементировать интерфейсы при помощи ключевого слова **implements**.

   В Java классы могут расширять (extends) только один класс, НО могут имплементировать
   (implements) несколько интерфейсов. В этом случае имплементируемые интерфейсы перечисляются через запятую.

2. Подход TDD (разработка через тестирование), очень популярен, и обладает рядом преимуществ.

   Интерфейсы часто используются при этом подходе. При помощи интерфейса определяется
   необходимая функциональность(методы). Потом пишем тесты, для этих методов.
   А после имплементируем эти методы в классе так, чтобы тесты проходили.

