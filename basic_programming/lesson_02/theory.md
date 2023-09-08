# Algorithm
An algorithm is a clear sequence of actions, the execution of which gives some predetermined result.

**Main properties of the algorithm:**
- Discreteness (divided into steps).
- Efficiency (there is a result at each step and at the end).
- Determinism (uniqueness, there is no possibility of "interpretation").
- Finiteness (ends).

# Java programming language

**Java** is a high-level programming language originally developed by
Sun Microsystems and released in 1995.
Works on various platforms such as Windows, Mac OS, as well as various versions of UNIX.

**Java** is a general-purpose programming language designed to enable programmers
could write once and run anywhere (WORA). This means that the compiled Java code
can run on all platforms that support Java without the need for recompilation.

Learning a programming language usually begins with the 'Hello, World!' program, which displays this text on the screen.
```console
Hello World!
```
In Java, this program would look like this:
```java
   class Main {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
```

At this point, we don't care
The text *Hello, World!* will appear on the screen thanks to the `System.out.println()` command,
where `println()` is short for *print line*. It displays the value given in parentheses.
`("Hello, World!")`, in this case a string. The string itself is surrounded by double quotes "".
If this is not done, then the compiler will indicate a syntax error.

**It is very important to know and remember the following points in the syntax of the Java language:**

**Case sensitive**
- Java is case sensitive, meaning Hello and hello have different meanings.

Class name - for all **the first letter must be in upper case**.

If multiple words are used to form a class name, the first letter of each internal word
must be in upper case, e.g. "MyJavaClass". Method names - in Java syntax, all method names
must start with a lowercase letter. If multiple words are used to form a method name, then
the first letter of each internal word must be in uppercase, for example "public void myMethodName()".

**Program file name = class name**
– the name of the program file must exactly match the name of the class.
When saving a file, you must save it using the class name (remember about case sensitivity)
and add ".java" at the end of the name (if the names don't match, your program won't compile), e.g.
"MyJavaProgram" is the name of the class, then the file should be saved as "MyJavaProgram.java".

public static void main(String args[]) – program processing begins with the main() method, which is mandatory
part of every program. Identifiers are names used for classes, variables and methods.
All Java components require names.

There are several rules in the Java language syntax to remember about an identifier.
They are the following:
Each identifier must start from "A" to "Z" or "a" to "z", "$" or "_".
After the first character can have any combination of characters. The keyword cannot be used as
identifier.
Most importantly, an identifier in Java is case sensitive!
Correct spelling example: age, $salary, _value, __1_value. An example of a misspelling: 123abc, -salary.

**Keywords**
A total of 50 service (key) words are reserved in Java.

**List of Java-keywords in alphabetical order:**

abstract assert boolean break byte case catch char class const continue default do double else enum extends
final finally float for goto if implements import instanceof int interface long native new package private
protected public return short static strictfp super switch synchronized this throw throws transient try
void volatile while

**Important!** The keyword cannot be used as a constant or variable, or any other
identifier names.

**Helpful!** Create your own mini-dictionary with keyword translations.

____________________________________________________________________________
# Алгоритм 
**Алгоритм** — это _четкая_ _последовательность_ _действий_, выполнение которой дает какой-то заранее 
известный _результат_.

**Главные свойства алгоритма:**
1. Дискретность (разбит на шаги). Методология "сверху - вниз". "Слона надо есть по частям."
2. Результативность (имеется результат на каждом шагу и по итогу).
3. Детерминированность (однозначность, отсутствует возможность "толкования").
4. Конечность (завершается).

# Язык программирования Java - общие сведения, первая программа

**Java** – высокоуровневый язык программирования, изначально разработанный компанией
Sun Microsystems и выпущенный в 1995 году.
Работает на различных платформах, таких как Windows, Mac OS, а также различных версий UNIX, для чего
была разработана и реализована **JVM (Java Virtual Mashine)** для всех популярных операционных систем.

**Java** – это язык программирования общего назначения, предназначенный для того, чтобы программисты
могли писать один раз и запускать где угодно (**WORA**). Это означает, что скомпилированный код Java
может работать на всех платформах, поддерживающих Java, без необходимости повторной компиляции.

Изучать язык программирования обычно начинают с программы 'Hello, World!', которая выводит этот текст на экран.
```console
Hello, World!
```
В языке Java эта программа будет выглядеть так:
```java
  class Main { 
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
```

На данном этапе нам не важно,
Текст *Hello, World!* появится на экране благодаря команде `System.out.println()`,
где `println()` - это сокращение от английского *print line*. Она выводит на экран значение, указанное в скобках
`("Hello, World!")`, в данном случае строку. Сама строка обрамляется двойными кавычками "".
Если этого не сделать, то компилятор укажет на синтаксическую ошибку.

**Очень важно знать и помнить следующие моменты в синтаксисе языка Java:**

**Чувствительность к регистру**
– Java чувствителен к регистру, то есть идентификатор (имя переменной) Hello и hello имеют разный смысл.

Название классов – для всех **первая буква должна быть в верхнем регистре**.

Если несколько слов используются, чтобы сформировать название класса, первая буква каждого внутреннего слова
должна быть в верхнем регистре, например, «MyJavaClass». Название методов – в синтаксисе Java все имена методов
должны начинаться с буквы нижнего регистра. Если несколько слов используются, чтобы сформировать имя метода, то
первая буква каждого внутреннего слова должна быть в верхнем регистре, например, «public void myMethodName()».

**Название файла программы = название класса**
– наименование файла программы должно точно совпадать с именем класса.
При сохранении файла, Вы должны сохранить его, используя имя класса (помните о чувствительности к регистру)
и добавить «.java» в конце имени (если имена не совпадают, Ваша программа не будет компилироваться), например,
«MyJavaProgram» – это название класса, тогда файл должен быть сохранен как «MyJavaProgram.java».

public static void main(String args[]) – обработка программы начинается с метода main(), который является обязательной
частью каждой программы. 
**Идентификаторы** – это имена, используемые для классов, переменных и методов.
Все компоненты Java требуют имена.

Существует несколько правил в синтаксисе языка Java, которые необходимо помнить об идентификаторе.

Они следующие:
Каждый идентификатор должен начинаться с «A» до «Z» или «a» до «z», «$» или «_».
Имена классов - с большой буквы.
Имена методов и переменных - с маленькой буквы.
После первого символа может иметь любую комбинацию символов. Ключевое слово не может быть использовано в качестве
идентификатора.

Самое важное – идентификатор в Java чувствителен к регистру!
Пример правильного написания: age, $salary, _value, __1_value. Пример неправильного написания: 123abc, -salary.

**Ключевые слова**
Всего зарезервировано 50 служебных (ключевых) слов в Java.

**Список ключевых слов по алфавиту:**

abstract assert boolean break byte case catch char class const continue default do double else enum extends
final finally float for goto if implements import instanceof int interface long native new package private
protected public return short static strictfp super switch synchronized this throw throws transient try
void volatile while

**Важно!** Ключевое слово не может быть употреблено в качестве константы или переменной, или любых других
имен идентификаторов.

**Полезно!** Составить свой мини-словарь с переводом ключевых слов.