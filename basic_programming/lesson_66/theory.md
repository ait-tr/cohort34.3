# Multithreading

Multithreading is one of the options for multitasking.
Creating a new thread in an application is equivalent to creating a new stack of functions.
That is, in a multi-threaded application, several stacks can work simultaneously.

You can create a new task in Java either by implementing the Runnable interface or by extending the Thread class.
In any case, you need to override the run method in which the new task will be implemented.

In order for a new thread to start, you need to create an object of type Thread by passing an object of type Runnable to the constructor,
and then call the start method on an object of type Thread.

If it is necessary for one thread to wait for the completion of another thread, then while the first thread is running,
You need to call the join method on the second thread object.

See the presentation for more details.

-----------------------------------------

# Multithreading

Multithreading - это один из вариантов многозадачности. 
Создание нового треда в аппликации, равносильно созданию нового стека функций. 
Т. е. в многопоточной аппликации могут одновременно работать несколько стеков.

Создать новую задачу в Java можно или имплементировав интерфейс Runnable, или расширяя класс Thread. 
В любом случае надо переопределить метод run в котором и будет реализована новая задача.

Чтобы новый тред стартовал, надо создать объект типа Thread передав в конструктор объект типа Runnable, 
и после этого вызвать у объекта типа Thread метод start.

Если необходимо, чтобы один тред дождался завершения другого треда, то в процессе работы первого треда, 
надо у объекта второго треда вызвать метод join.

Подробнее смотрите в презентации.