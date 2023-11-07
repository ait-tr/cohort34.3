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

# Wrapper classes - кратко

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


## Wrapper-классы более подробно

У примитивных типов есть объекты-аналоги - так называемые "классы оболочки", или "wrapper" (с англ. "обертка,
упаковка"):

| Primitive Data Types | Wrapper Classes |
|----------------------|-----------------|
| int                  | Integer         |
| short                | Short           |
| long                 | Long            |
| byte                 | Byte            |
| float                | Float           |
| double               | Double          |
| char                 | Character       |
| boolean              | Boolean         |

Класс называется "оболочкой" потому, что он, по сути, копирует то, что уже существует, но добавляет новые возможности
для работы с привычными типами.

Объекты классов оболочкой создаются так же, как и любые другие:

````
public static void main(String[] args) {

   Integer i = new Integer(682);

   Double d = new Double(2.33);

   Boolean b = new Boolean(false);
}
````

### Зачем они нужны?

Примитивы и их аналоги, классы оболочки, существуют параллельно, потому что у каждого есть преимущества.

- Например, обычный int занимает меньше места, и если нет необходимости проводить над ним особые операции

- с помощью класса-оболочки Integer можно выполнять специальные операции - например, перевести текст в
  число (с помощью метода .parseInt() для Integer-а ). Если попробовать сделать это с помощью кода самому придется
  изрядно повозиться.

Примитивные типы потому и называют примитивными, потому что они лишены многих “тяжеловесных” особенностей объектов. Да,
у объекта есть много удобных методов, но ведь они не всегда нужны.

### Autoboxing/Autounboxing

Одной из особенностей примитивов и их классов-оберток в Java является автоупаковка/автораспаковка (
Autoboxing/Autounboxing)

Переменной класса-обертки можно присваивать значение примитивного типа. Этот процесс называется автоупаковкой (
autoboxing).

Точно так же переменной примитивного типа можно присваивать объект класса-обертки. Этот процесс называется
автораспаковкой (autounboxing).

````java
public class Main {
    public static void main(String[] args) {
        int x = 7;
        Integer y = 111;
        x = y; // автораспаковка
        y = x * 123; // автоупаковка
    }
}
````

### Методы классов оболочек

#### Методы valueOf()

Иногда в объекте типа String содержится число, и Вам нужно с ним работать дальше
Метод valueOf() предоставляет второй способ создания объектов оболочек. Метод перегруженный, для каждого класса
существует два варианта - один принимает на вход значение соответствующего типа, а второй - значение типа String. Так же
как и с конструкторами, передаваемая строка должна содержать числовое значение. Исключение составляет опять же класс
Character - в нем объявлен только один метод, принимающий на вход значение char.

И в целочисленные классы Byte, Short, Integer, Long добавлен еще один метод, в который можно передать строку, содержащую
число в любой системе исчисления. Вторым параметром вы указываете саму систему исчисления.

````java
public class WrapperValueOf {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf("6");
        Integer integer2 = Integer.valueOf(6);


        System.out.println(integer1);
        System.out.println(integer2);
    }
}
````

#### Методы parseXxx()

В каждом классе оболочке содержатся методы, позволяющие преобразовывать строку в соответствующее примитивное значение. В
классе Double - это метод parseDouble(), в классе Long - parseLong() и так далее. Разница с методом valueOf() состоит в
том, что метод valueOf() возвращает объект, а parseXxx() - примитивное значение.

Также в целочисленные классы Byte, Short, Integer, Long добавлен метод, в который можно передать строку, содержащую
число в любой системе исчисления. Вторым параметром вы указываете саму систему исчисления. Следующий пример показывает
использование метода parseLong():

````java

public class WrapperDemo3 {
    public static void main(String[] args) {
        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
    }
}
````

#### Методы toString()

Все типы оболочки переопределяют toString(). Этот метод возвращает читабельную для человека форму значения,
содержащегося в оболочке. Это позволяет выводить значение, передавая объект оболочки типа методу println():

````
Double double1 = Double.valueOf("4.6");
System.out.println(double1);
````

Также все числовые оболочки типов предоставляют статический метод toString(), на вход которого передается примитивное
значение. Метод возвращает значение String:

````
String string1 = Double.toString(3.14);
````

Integer и Long предоставляют третий вариант toString() метода, позволяющий представить число в любой системе исчисления.
Он статический, первый аргумент – примитивный тип, второй - основание системы счисления:

````
String string2 = Long.toString(254, 16); // string2 = "fe"
````

#### Методы toHexString(), toOctalString(), toBinaryString()

Integer и Long позволяют преобразовывать числа из десятичной системы исчисления к шестнадцатеричной, восьмеричной и
двоичной системе. Например:

````java

public class WrapperToXString {
    public static void main(String[] args) {
        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в  8-ой системе = " + string2);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в  2-ой системе = " + string3);
    }
}
````

В классы Double и Float добавлен только метод toHexString().

### Пример приведения типов

````
        Integer iOb = new Integer(1000);
        
        System.out.println(iOb.byteValue());    // byte
        System.out.println(iOb.shortValue());   // short
        System.out.println(iOb.intValue());     // int
        System.out.println(iOb.longValue());    // long
        System.out.println(iOb.floatValue());   // float
        System.out.println(iOb.doubleValue());  //double
````

#### Статические константы классов оболочек

Каждый класс оболочка содержит статические константы, содержащие максимальное и минимальное значения 
для данного типа.

Например, в классе Integer есть константы Integer.MIN_VALUE – минимальное int значение и 
Integer.MAX_VALUE – максимальное int значение.

