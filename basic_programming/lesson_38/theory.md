# ENUM - briefly

An enumeration type is a special data type that allows a variable to be a set of predefined constants.
The variable must be equal to one of its predefined values. Since they are constants,
The names of fields of an enumerated type are written in capital letters.

In the Java programming language, the type of an enumeration is defined using the enum keyword.
For example, you can specify the enumeration type for days of the week like this:

public enum Day {
SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
THURSDAY, FRIDAY, SATURDAY
}

All enums implicitly extend java.lang.Enum.
Here is a link to the official Oracle tutorial on enumerated types:
<a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Enum</a>

**Scope of application of ENUM**
Problems in which there is a finite list of values, for example:
- days of the week
- months of the year
- Seasons
- user roles in the system
- ...
  Otherwise, we would have to create an array of the appropriate type for each such list.

_______________________________

# ENUM - details

The name `enum` comes from the word *enumeration* - enumeration.
This is another type of data type in Java.

Sometimes in a programmer's work there is a need to create a new data type,
whose variables take only values from a small fixed list.

For example, the `WeekDay` type can only accept the values `MONDAY`, `TUESDAY`, `WEDnesday`, ... A total of 7 values.
Or the `Month` type can only accept the values `JANUARY`, `FEBRUARY`, `MARCH`, ... A total of 12 values.
You can, of course, use numbers (type `int`): `1` - Monday, `2` - Tuesday, etc.
But someone could accidentally assign the value `8` to such a variable, or, for example, the value `0`.

A situation can easily arise where one programmer thinks that the days of the week (or months) are numbered from zero,
the other - that from one.

Therefore, Java came up with a data type that consists of a finite set of values - `enum`.

# Type declaration

The declaration of a new `enum` data type looks like this:

```java
enum TypeName {
    VALUE1,
    VALUE2,
    VALUE3,
}
```

Where `TypeName` is the name of the new type (class), and the possible values are listed in parentheses, separated by commas:
`Value1`, `Value2`, `Value3`.

Let's create our own `enum` for the `WeekDay` type for the sake of example:

```java
// New type Day
enum Day {
    MONDAY, // Monday
    TUESDAY, // Tuesday
    WEDNESDAY, // Wednesday
    THURSDAY, // Thursday
    FRIDAY, // Friday
    SATURDAY, // Saturday
    SUNDAY, // Sunday
}
```

# Using type

You can create a variable and assign a value to it as follows:
```java
Day day = Day.FRIDAY;
System.out.println(day);
```

`FRIDAY` will be displayed on the screen.

`enum` types can be used as an argument to `switch..case`.

# `enum` methods

The enum type has several built-in methods.

The static method `values()` returns an **array** of all values of type `enum`:
```java
Day[] days = Day.values();

for (Day day: days) {
   System.out.println(day);
}

System.out.println(days[2]); // Print WEDNESDAY
```

The `ordinal()` method returns the ordinal number (`int`) of the constant. It should not be called from the `enum` class,
and **values** have `enum`:

```java
System.out.println(Day.MONDAY.ordinal()); // Prints 0
```

To convert an object of type `enum` to a string, you need to call the `toString()` method on it:
```java
String str = Day.MONDAY.toString(); // str = "MONDAY"
```

To convert back (string to `Day` object) you can use the static `valueOf()` method:
```java
Day day = Day.valueOf("MONDAY"); // day = Day.MONDAY
```

To convert an enum to a number and vice versa, the already known `ordinal()` and `values()` methods are used:
```java
Day day = Day.values()[2]; // day = Day.WEDNESDAY
```

# Important

Since `enum` values represent a **fixed set of constants**,
they **can** be compared using `==`.

_________________________________________________________

# ENUM - кратко

Тип перечисления — это специальный тип данных, который позволяет переменной быть набором предопределенных констант.
Переменная должна быть равна одному из предопределенных для нее значений. Поскольку они являются константами,
имена полей перечисляемого типа пишутся большими буквами.

В языке программирования Java тип перечисления определяется с помощью ключевого слова enum.
Например, вы можете указать тип перечисления дней недели следующим образом:

	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}

Все перечисления неявно расширяют java.lang.Enum.
Вот ссылка на официальный Oracle туториал по перечисляемым типам:
<a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Enum</a>

**Область применения ENUM**
Задачи, в которых имеется конечный перечень значений, например:
- дни недели
- месяцы в году
- времена года
- роли пользователей в системе (USER, GUEST, ADMIN, MANAGER)
- ...
  Иначе пришлось бы заводить массив соответствующего типа под каждый такой список.

_______________________________

# ENUM - подробно

Название `enum` происходит от слова *enumeration* — перечисление.
Это еще одна разновидность типов данных в Java.

Иногда в работе программиста возникает необходимость создать новый тип данных,
переменные которого принимают только значения из небольшого фиксированного списка.

Например, тип `ДеньНедели` может принимать только значения `ПОНЕДЕЛЬНИК`, `ВТОРНИК`, `СРЕДА`, ... Всего 7 значений.
Или тип `Месяц` может принимать только значения `ЯНВАРЬ`, `ФЕВРАЛЬ`, `МАРТ`, ... Всего 12 значений.
Можно, конечно, использовать числа (тип `int`): `1` — понедельник, `2` — вторник и т.д.
Но кто-то случайно может присвоить такой переменной значение `8`, или, например, значение `0`.

Легко может возникнуть ситуация, когда один программист думает, что дни недели (или месяцы) нумеруются с нуля,
другой — что с единицы.

Поэтому в Java придумали тип данных, который состоит из конечного набора значений — `enum`.

# Объявление типа

Выглядит объявление нового `enum` типа данных так:

```java
enum ИмяТипа {
   ЗНАЧЕНИЕ1,
   ЗНАЧЕНИЕ2,
   ЗНАЧЕНИЕ3,
}
```

Где `ИмяТипа` — это имя нового типа (класса), а в скобках через запятую перечислены возможные значения:
`Значение1`, `Значение2`, `Значение3`.

Давайте ради примера создадим свой `enum` для типа `ДеньНедели`:

```java
// Новый тип Day
enum Day {
   MONDAY, // Понедельник
   TUESDAY, // Вторник
   WEDNESDAY, // Среда
   THURSDAY, // Четверг
   FRIDAY, // Пятница
   SATURDAY, // Суббота
   SUNDAY, // Воскресенье
}
```

# Использование типа

Создать переменную и присвоить ей значение можно следующим образом:
```java
Day day = Day.FRIDAY;
System.out.println(day);
```

На экран будет выведено `FRIDAY`.

Типы `enum` можно использовать в качестве аргумента `switch..case`.

# Методы `enum`

Тип enum имеет несколько встроенных методов.

Статический метод `values()` возвращает **массив** всех значений типа `enum`:
```java
Day[] days = Day.values();

for (Day day: days) {
  System.out.println(day);
}

System.out.println(days[2]); // Выведет WEDNESDAY
```

Метод `ordinal()` возвращает порядковый номер (`int`) константы. Вызывать его нужно не у класса `enum`,
а у **значения** `enum`:

```java
System.out.println(Day.MONDAY.ordinal()); // Выведет 0
```

Чтобы преобразовать объект типа `enum` в строку, у него нужно вызвать метод `toString()`:
```java
String str = Day.MONDAY.toString(); // str = "MONDAY"
```

Для обратного преобразования (строки в объект `Day`) можно воспользоваться статическим методом `valueOf()`:
```java
Day day = Day.valueOf("MONDAY"); // day = Day.MONDAY
```

Для преобразования enum в число и наоборот используются уже известные методы `ordinal()` и `values()`:
```java
Day day = Day.values()[2]; // day = Day.WEDNESDAY
```

# Важно (!)

Так как значения типа `enum` представляют собой **фиксированный набор констант**,
их **можно** сравнивать через `==`.
