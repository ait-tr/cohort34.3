#Streams
Functional Streams can be created for any iterable object. Stream is a sequence of operations
over the elements of the iterable object.

With the advent of Java 8, the Stream API allowed programmers to write in much shorter time what previously took a lot of time.
lines of code, namely, to simplify working with data sets, in particular, to simplify operations:
- filtration,
- sorting,
- transformation,
- and other manipulations with data.

Streams consist of **intermediate** and **terminal** operations.
There can be several intermediate operations and they always return the stream.
There can only be one terminal operation, and it is placed at the end of the stream.
A terminal operation returns the result of the entire stream.

Stream "lazy". That is, the stream will start working only when a terminal operation is added to it.

If the stream, “on the conveyor belt,” contains objects that, in turn, are iterable,
then, using the intermediate flatMap method, you can “shak out” the contents of these objects. In this case
Then the contents of the objects will move along the conveyor.

The terminal collect method can collect the contents of the stream into the structure we need. For this he needs
pass an object implementing the Collector interface. In practice, implement the Collector interface yourself
This is rarely necessary, because the Collectors class has many methods that return various collectors. For example,
using Collectors.toList(), you can get a collector that collects stream elements into a list, and using
Collectors.toSet() - to set.

Collectors.groupingBy allows you to group stream elements into a map according to a key that is determined
corresponding function. In this case, elements corresponding to one key are collected by default into a sheet.

Collectors.groupingBy has overloads. For example, instead of the default sheet, as value
you can use the result of the work of some collector.

For details about the stream's operation scheme and basic operations, see the presentation.

[Functional Programming in Java](https://github.com/ait-tr/cohort34.3/blob/main/basic_programming/lesson_58/FP.pdf)

Useful articles:
https://javarush.com/groups/posts/2203-stream-api
https://metanit.com/java/tutorial/10.1.php

_______________________________________________________________

# Streams
Functional Streams можно создать для любого итерируемого объекта. Стрим это последовательность операций
над элементами итерируемого объекта.

С появлением Java 8 Stream API позволило программистам писать существенно короче то, что раньше занимало много 
строк кода, а именно — упростить работу с наборами данных, в частности, упростить операции:
- фильтрации, 
- сортировки, 
- преобразование,
- и другие манипуляции с данными.

Стримы состоят из **промежуточных** и **терминальных** операций. 
Промежуточных операций может быть несколько и они всегда возвращают стрим. 
Терминальная операция может быть только одна, и она помещается в конец стрима. 
Терминальная операция возвращает результат работы всего стрима.

Стрим "ленивый". Т. е. стрим начнет работать, только когда к нему будет добавлена терминальная операция.

Если в стриме, "на конвеере", оказываются объекты, которые в свою очередь являются итерируемыми,
то при помощи промежуточного метода flatMap можно "вытрусить" содержимое этих объектов. В таком случае
далее "по конвееру" будет двигаться уже содержимое объектов.

Терминальный метод collect может собрать содержимое стрима в нужную нам структуру. Для этого ему надо
передать объект имплементирующий интерфейс Collector. На практике имплементировать самим интерфейс Collector
приходится редко, т. к. в классе Collectors есть много методов возвращающих разнообразные коллекторы. Например,
при помощи Collectors.toList(), можно получить коллектор собирающий элементы стрима в лист, а при помощи
Collectors.toSet() - в сет.

Collectors.groupingBy позволяет сгруппировать элементы стрима в мапу, по ключу, который определяется
соответствующей функцией. При этом элементы соответствующие одному ключу собираются по умолчанию в лист.

У Collectors.groupingBy есть перегруженные варианты. Например, вместо дефолтного листа, в качестве вэлью
можно использовать результат работы какого-нибудь коллектора.

Подробно о схеме работы стрима и основных операциях, смотрите в презентации.

[Functional Programming in Java](https://github.com/ait-tr/cohort34.3/blob/main/basic_programming/lesson_58/FP.pdf)

Полезные статьи:
https://javarush.com/groups/posts/2203-stream-api
https://metanit.com/java/tutorial/10.1.php