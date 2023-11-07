# Conditional operator

## if() statement

The most versatile way to organize the execution of some part of the code
depending on the condition, is to use the conditional operator
if(condition)
This statement has the **full form**, or **abbreviated** (without else).

**Full form:**
        `if (condition){
            command_1;
            team_2;
            ...
        } else {
            command_1;
            team_2;
            ...
        }`

**Short form** (without else):
        `if (condition) {
            command_1;
            team_2;
            ...
        }`

Block diagrams - see figure.

## Condition
The condition in the parentheses of the if() statement is most often a comparison operation:
* symbol > greater than, x > y - Boolean expression
* symbol < less than , x < y
* this == equals, x == y
* this >= greater than or equal to
* this <= less than or equal to
* this != NOT equal (<> is in other languages)
- these are all logical expressions.
  The logical expression takes the value:
- LIE (false) and TRUTH (true)

## Logical operators:
Logical operations connect (combine) various conditions with each other:
* Logical negation, also known as NOT or inversion.
  Indicated by the symbol “!” before the operand. Applies to one operand.
* Logical AND, also known as AND or conjunction. Identified by the symbol “&” between two operands,
  to which it applies. Example: x > 0 & x <10
* Logical OR in Java, also known as OR, also known as disjunction. Denoted by the symbol “|” between
  two operands.
  Example: x < 0 | x >10 in this expression we get false when x = 2, 3, ... 9
* Exclusive or, XOR, strict disjunction.
  Denoted by a “^” symbol between two operands.
* Conditional OR, denoted by ||, tests the first operand (condition).
* Conditional AND, denoted &&, tests the first operand (condition).
  Conditional OR, conditional AND are useful when the right condition depends on the left one.

The result of comparisons and logical operators is always of type **boolean**,
that is, it can be either TRUE or FALSE.
There is no third!

# Ternary operator

"Ternary" means "triple". This is an alternative to the `if`-`else` conditional statement.

Earlier:
```java
String securityAnswer;
if (age >= 18) {
      securityAnswer = "It's okay, come in!";
} else {
     securityAnswer = "This movie is not suitable for your age!";
}
```

Now:
```java
String securityAnswer = (age >= 18) ? "It's all right, come in!" : "This film is not suitable for your age!";
```

Example of design on several lines:
```java
String securityAnswer = (age >= 18) ?
     "It's all right, come in!" :
     "This film is not suitable for your age!";
```

A general recommendation might sound like this: if the condition is simple and easy to check, you can use the ternary operator without harm. This way you will reduce the amount of code and the number of `if`-`else` checks, of which there may already be a lot.

But if the condition is complex and multi-stage, it is better to use `if`-`else`.

For example, in this case it would be a bad idea to use the ternary operator:
```java
String securityAnswer = (age >= 18 && (hasTicket || hasCoupon) && !hasChild) ? "Come in!" : "You can not pass!";
```
____________________________________________________

# Условный оператор

## Оператор if()

Самым универсальный способ организовать выполнение какой-то части кода в зависимости от условия, 
является использования условного оператора: 
    if(условие) {...}
Этот оператор имеет **полную форму**, или **сокращенную** (без else).

**Полная форма:**
`if (условие){
    команда_1;
    команда_2;
    ...
} else { // иначе
    команда_1;
    команда_2;
    ...
}`
... сл. команда

**Сокращенная форма** (без else):
`if (условие) {
    команда_1;
    команда_2;
    ...
}`
... сл. команда

Блок-схемы - см. рисунок.



## Условие
Условие в скобках оператора if (   ) - это чаще всего операции сравнения:
*  символ > больше , x > y - логическое выражение
*  символ < меньше , x < y
*  это == равно, x == y
*  это >=  больше или равно
*  это <=  меньше или равно
*  это != НЕ равно (<> - это в других языках)
- всё это логические выражения. 

Логическое выражение принимает значение: 
- ЛОЖЬ (false) или ПРАВДА (true)

## Логические операторы:
Логические операции соединяют(комбинируют) между собой различные условия: 
* Логическое отрицание, оно же NOT или инверсия.
  Обозначается символом “!” перед операндом. Применяется к одному операнду.

* Логическое И, оно же AND или конъюнкция. Обозначается символом “&” между двумя операндами,
  к которым применяется. Пример: (x > 0) & (x < 10) - X попадает в интервал от и до
  И и И => И
  И и Л => Л
  Л и И => Л
  Л и Л => Л

  * Логическое ИЛИ в Java, оно же — OR, оно же — дизъюнкция. Обозначается символом “|” между
    двумя операндами. 
  Пример: x < 0 | x >10  в этом выражении получаем ложь, когда x = 2, 3, ... 9
    И или И => И
    И или Л => И
    Л или И => И
    Л или Л => Л

* Исключающее или, XOR, строгая дизъюнкция. 
Обозначается символом “^” между двумя операндами.
  И или И => Л
  И или Л => И
  Л или И => И
  Л или Л => Л

* Условное ИЛИ, обозначаемое как ||, проверяет первый операнд (условие).

* Условное И, обозначаемое как &&, проверяет первый операнд (условие).

Условное ИЛИ, условное И полезно тогда, когда правое условие зависит от левого.

Результат сравнения и логических операторов всегда имеет тип **boolean**,
то есть может быть либо ИСТИНА (true), либо ЛОЖЬ (false).
Третьего НЕ ДАНО!

# Тернарный оператор

"Тернарный" в переводе означает "тройной". Это альтернатива условному оператору `if`-`else`.

Раньше:
```java
String securityAnswer;
if (age >= 18) {
     securityAnswer = "Все в порядке, проходите!";
} else {
    securityAnswer = "Этот фильм не подходит для вашего возраста!";
}
```

Теперь:
```java
String securityAnswer = (age >= 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";
```

Пример оформления на нескольких строках:
```java
String securityAnswer = (age >= 18) ?
    "Все в порядке, проходите!" :
    "Этот фильм не подходит для вашего возраста!";
```

Общая рекомендация может звучать так: если условие простое и легко проверяется, можно без ущерба использовать тернарный оператор. Таким образом ты сократишь объем кода и количество проверок `if`-`else`, которых там и без того может быть немало.

А вот если условие является сложным и многоступенчатым — лучше использовать `if`-`else`.

Например, в этом случае использовать тернарный оператор будет плохой идеей:
```java
String securityAnswer = (age >= 18 && (hasTicket || hasCoupon) && !hasChild) ? "Проходите!" : "Вы не можете пройти!";
```