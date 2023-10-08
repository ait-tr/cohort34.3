# Wrapper classes

1. In Java, there are data structures (arrays, collections) that can only work with **objects**, but
   not with primitives, that is, with types int, double, byte, etc.
   To solve this problem, Java has created "wrapper classes" for each primitive type:
   Byte, Short, Character, Integer, Long, Float, Double, Boolean.
   Each such class encapsulates the corresponding primitive type and extends a set of methods for working with them.

2. For the convenience of working with wrapper classes, Java has implemented an autoboxing and auto-unboxing mechanism
   (autounboxing). This means that we can use objects of “wrapper classes” in mathematical operations equally
   with primitive types. Java will automatically convert the "wrapper class" object if necessary
   into the corresponding primitive type (autounboxing), or vice versa - the primitive type will be packed into an object
   class wrapper (autoboxing).

3. Wrapper classes also have useful constants and methods. For example, Integer.MAX_VALUE stores the maximum possible
   a number of integer type, and the static methods Double.isNaN(double a) and Double.isInfinite(double a),
   can check whether the passed argument stores the special values NaN and Infinite, respectively.

4. Wrapper classes, using parsing methods (starting with the word parse...), can convert thongs
   (data of type String) into the primitive type corresponding to this wrapper class.
   If the string contains a set of characters that can be interpreted as a number, then parsing will be successful.
   If not, there will be an error.

----------------------------

# Wrapper classes

1. В Java существуют структуры данных (массивы, коллекции), которые могут работать только с **объектами**, но 
   не с примитивами, то есть с типами int, double, byte и т.д.
   Для решения этой проблемы в Java созданы "классы обертки", для каждого примитивного типа:
   Byte, Short, Character, Integer, Long, Float, Double, Boolean.
   Каждый такой класс инкапсулирует соответствующий примитивный тип и расширяет набор методов для работы с ними.

2. Для удобства работы с wrapper classes в Java реализован механизм автоупаковки (autoboxing) и автораспаковки
   (autounboxing). Это означает, что мы можем использовать в математических действиях объекты "классов оберток" наравне
   с примитивными типами. Java, при необходимости, автоматически преобразует объект "класса обертки"
   в соответствующий ему примитивный тип (autounboxing), или наоборот - примитивный тип упакует в объект
   wrapper класса (autoboxing).

3. Wrapper classes также имеют полезные константы и методы. Например Integer.MAX_VALUE хранит максимально возможное
   число целого типа, а статические методы Double.isNaN(double a) и Double.isInfinite(double a),
   могут проверить хранит ли передаваемый аргумент специальные значения NaN и Infinite соответственно.

4. Wrapper classes при помощи методов парсинга (начинаются со слова parse...), могут преобразовать стринги
   (данные типа String) в соответсвующий данному wrapper классу примитивный тип.
   Если строка содержит набор символов, который можно интерпретировать как число, то парсинг пройдет успешно.
   Если нет, то будет ошибка.

