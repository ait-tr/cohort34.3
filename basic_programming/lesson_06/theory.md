# Conditional statements - continued

## Ternary operator

"Ternary" means "triple". This is an alternative to the `if`-`else` conditional statement.

Examples of using the ternary operator:

     `boolean isAdult = (age >= 18) ? true : false;`

     'int max = (a > b) ? a : b;'

     boolean isEven = (x % 2 == 0) true : false;

     int absX = (x > 0) ? x : -x;

A general recommendation might sound like this: if the condition is simple and easy to check, you can use
ternary operator. This reduces the amount of code and the number of `if`-`else` checks.

But if the condition is complex and multi-stage, then it is better to use `if`-`else`.

## `switch`-`case` - multiple selection

A fork into three options in the code might look like this:

```java
     if (turn_left) {
       System.out.println("You will lose your horse");
     } else if (turn_right) {
       System.out.println(“You will gain knowledge”);
     } else {
       System.out.println(“Are you going to stand like this?”);
     }
```

But if there are more options, then it is more convenient to use the `switch`-`case` operator.

```java
switch (SelectExpression) {
   case (Value1):
     Team1;
     break;
   case (Value2):
     Team2;
     break;
   ...
   case (ValueN):
     CommandN;
     break;
   default:
     CommandsDefault;
     break;
}
```

The execution order in the statement is as follows:
1. `ExpressionForSelection` is calculated. Next, the `switch` operator compares the resulting expression with the next Value (in the order listed).
2. If the `ExpressionForSelection` matches the `Value`, then the code following the colon is executed.
3. If the `break` construction is encountered, then control is transferred outside the `switch` command.
4. If no matches between `ExpressionForSelection` and `Values` are found, then control is transferred to the code
   written in `Default Commands`.

## Important points
- The type of `Selection Expressions` for a switch selection statement in Java must be one of the following:
  - `byte`, `short`, `char`, `int`.
  - Their wrappers are `Byte`, `Short`, `Character`, `Integer`.
  - `String` (since Java 7).
  - Enumeration (`Enum`) (we'll find out later).
- The `default` block is optional, then if `ExpressionForSelection` and `Values` do not match, no action will be performed.
- `break` is optional, if it is not present - **the code will continue executing** (**ignoring** further comparisons of values in `case` blocks) until the first `break` encountered or until the end of the `switch` statement.
- if it is necessary to execute the same code for several selection options, to avoid duplication we indicate several corresponding values in front of it in consecutive `case` blocks.

## Example

```java
int day = 2;

switch (day) {
   case 1:
      System.out.println("Today is windy !");
      break;
   case 2:
      System.out.println("Today is sunny !");
      break;
   case 3:
      System.out.println("Today is rainy!");
      break;
   default:
      System.out.println("Oooops, something wrong !");
      break;
}
```

# Keyboard input:

     `Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();`

The variable n will contain the number that the user entered from the keyboard.

     char ch = scanner.nextChar();

The ch variable will contain the character that the user entered from the keyboard.

     String st = scanner.next();

The st variable will contain the string that the user entered from the keyboard.

____________________________________________________

# Условные операторы - продолжение

## Тернарный оператор

"Тернарный" в переводе означает "тройной". Это альтернатива условному оператору `if`-`else`.

Примеры использования тернарного оператора:

    `boolean isAdult = (age >= 18) ? true : false;`

    'int max = (a > b) ? a : b;'

    boolean isEven = (x % 2 == 0) true : false;

    int absX = (x > 0) ? x : -x;

Общая рекомендация может звучать так: если условие простое и легко проверяется, можно без ущерба использовать 
тернарный оператор. Таким образом сокращается объем кода и количество проверок `if`-`else`.

А вот если условие является сложным и многоступенчатым, то лучше использовать `if`-`else`.

## `switch`-`case` - множественный выбор

Развилка на три варианта в коде может выглядеть вот так:

```java
    if (turn_left) {
      System.out.println(«Коня потеряешь»);
    } else if (turn_right) {
      System.out.println(“Знания обретёшь”);
    } else {
      System.out.println(“Так и будешь стоять?”);
    }
```

Но если количество вариантов больше, то удобнее использовать оператор `switch`-`case`.

```java
switch (ВыражениеДляВыбора) {
  case  (Значение1):
    Команда1;
    break;
  case (Значение2):
    Команда2;
    break;
  ...
  case (ЗначениеN):
    КомандаN;
    break;
  default:
    КомандыПоУмолчанию;
    break;
}
```

Порядок выполнения в операторе следующий:
1. Вычисляется `ВыражениеДляВыбора`. Далее оператор `switch` сравнивает полученное выражение с очередным Значением (в порядке перечисления).
2. Если `ВыражениеДляВыбора` совпало со `Значением`, то выполняется код, идущий после двоеточия.
3. Если встречается конструкция `break` — то управление передается за пределы команды `switch`.
4. Если совпадений `ВыражениеДляВыбора` и `Значений` не выявлено, то управление передаётся коду, 
записанному в `КомандахПоУмолчанию`.

## Важные моменты
- Тип `ВыраженияДляВыбора` для оператора выбора switch в Java должен быть одним из следующих:
    - `byte`, `short`, `char`, `int`.
    - Их обёртки `Byte`, `Short`, `Character`, `Integer`.
    - `String` (начиная с Java 7).
    - Перечисление (`Enum`) (узнаем позже).
- Блок `default` — необязательный, тогда в случае отсутствия совпадений `ВыраженияДляВыбора` и `Значений` не будет выполнено никаких действий.
- `break` не является обязательным, если его нет – **код продолжит выполнение** (**игнорируя** дальнейшие сравнения значений в блоках `case`) до первого встреченного `break` или до конца оператора `switch`.
- если необходимо выполнять один и тот же код для нескольких вариантов выбора, для исключения дублирования перед ним указываем несколько соответствующих значений в подряд идущих блоках `case`.

## Пример

```java
int day = 2;

switch (day) {
  case 1:
     System.out.println("Today is windy !");
     break;
  case 2:
     System.out.println("Today is sunny !");
     break;
  case 3:
     System.out.println("Today is rainy!");
     break;
  default:
     System.out.println("Oooops, something wrong !");
     break;
}
```

# Ввод данных с клавиатуры:

    `Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();`

В переменной n окажется то число, которое пользователь ввел с клавиатуры.

    char ch = scanner.nextChar();

В переменной ch окажется тот символ, который пользователь ввел с клавиатуры.

    String st = scanner.next();

В переменной st окажется та строка, которую пользователь ввел с клавиатуры.