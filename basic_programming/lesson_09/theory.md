# Gained, accumulated knowledge:

     1. Variable types (TYPE, name, value)
int, double, long, char, float, short, byte, boolean - primitive data types.

String is a class-based complex type.

     2. Mathematical operations
       +, -, * - actions we are accustomed to;
       / - integer division for int, % - remainder of division for int.
       / - normal division for double

     3. Accumulation of a sum/value in a variable
       sum := sum + 1; // this is what they wrote before
       sum++; // increase by 1
       sum--; // decrease by 1
       i++ ; // increase by 1

     4. Displaying text and “results” on the screen
sout is transformed to System.out.println();

       System.out.println("Text " + Variable name);

       System.out.printf("Text template", variable_name); - this is for formatted output
       pattern %.2f - numbers with two decimal places, set the number output format

     5. Request for data from the user - number, string

       Scanner scanner = new Scanner(System.in);
       System.out.println("Input ... ") // this is the prompt to the user
       int num = scanner.nextInt(); //
       String st = scanner.next(); //

Don't forget to write an invitation to the user to enter data!

     6. Checking the condition, selecting:
       - if (logical expression) {...} else {...}
       - switch()...case

     7. Formal logic, logical operators:
       &, && -
       |, || -
       == -
       != -
       ^-

     8. Testing for complete divisibility
       if (i % 2 == 0) is divisibility by 2
       number %3 == 0, number % 5 == 0 - this is divisible by 3.5

     9. Cycles:
       - while - loop with precondition;
       - do...while - a loop with a postcondition.

    10. We start the variable name (identifier) with a small letter, do not start with numbers or service characters
       We start the method name with a small letter.
       camelCase is a naming style when the 1st letter is small, and then the “words” begin with
       big.

    11. We start the class name with a capital letter.

## Methods
A method that accepts nothing (empty) and returns nothing looks like this:
piblic static void methodName(){ // void indicates that the method does not return anything
do_something;
}

A method that takes parameters (arguments) and returns nothing looks like this:

        piblic static void methodName(T1 t1, T2 t2){
        do_something;
        }

A method that takes parameters (arguments) and returns a result of type T looks like this:

        piblic static T methodName(T1 t1, T2 t2){
        do something;
        return ...; // response, result from/from the method
        }

If a method returns data, then only ONE TYPE.

Any method is called by its name either without parameters or with parameters that are passed
into method.

## Examples of using the ternary operator:

     boolean isAdult = (age >= 18) ? true : false; - check for age over 18 years
     int max = (a > b) ? a : b; - find which of the 2 numbers is greater, is the maximum of the two
     boolean isEven = (x % 2 == 0) ? true : false; - check for even and odd parity
     int absX = (x > 0) ? x : -x; - determination of the absolute value of a number, module of a number

## Structured programming
- this is one of the programming paradigms (the answer to the question of how to write code in general)
  [More](https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D1%83%D0%BA%D1%82%D1%83%D1%80%D0 %BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80 %D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)

The main idea is a **complete** rejection of the **GOTO LINE_NUMBER** operator.
Using only three structures according to the Boehm-Iacopini theorem:
- algorithm step
- condition (branching), switch-case
- cycle

**Structured programming** is a progressive (still!) approach to software creation,
rejection of spaghetti code, which gave and continues to give an increase in labor productivity
programmers, reducing the number of errors, etc.

_________________________________

# Полученные, накопленные знания:

    1. Типы переменных (ТИП , имя, значение )
int, double, long, char, float, short, byte, boolean - примитивные типы данных.

String - сложный тип на основе класса.

    2. Математические действия
      +, -, * - привычные нам действия; 
      / - целочисленное деление для int, % - остаток от деления для int.
      / - обычное деление для double

    3. Накопление суммы, значения в переменной:
      sum := sum + 1; // так писали раньше
      sum++; // увеличение на 1
      sum--; // уменьшение на 1
      i++ ; // увеличение на 1

    4. Вывод текста и "результатов" на экран
sout трансформируется в System.out.println();

      System.out.println("Текст " + имяПеременной);

      System.out.printf("Текст шаблон", имя_переменной); - это для форматированного вывода
      шаблон %.2f - числа с двумя знаками после запятой, задаем формат вывода числа

    5. Запрос данных от пользователя - число, строка

      Scanner scanner = new Scanner(System.in);
      System.out.println("Input ... ") // это приглашение пользователю
      int num = scanner.nextInt(); // 
      String st = scanner.next(); // 

Не забывать писать приглашение пользователю для ввода данных!

    6. Проверка условия, выбор:
      - if (логическое выражение) {...} else {...}  
      - switch()...case

    7. Формальная логика, логические операторы:
      &, &&  - 
      |, ||  -
      ==     - 
      !=     - 
      ^      - 

    8. Проверка делимости нацело 
      if (i % 2 == 0) - это делимость на 2
      число %3 == 0, число % 5 == 0 - это делимость нацело на 3, 5

    9. Циклы:
      - while - цикл c предусловием; 
      - do...while - цикл с постусловием.

   10. Имя переменной (идентификатор) начинаем с маленькой буквы, не начинаем с цифр, служебных символов
      Имя метода начинаем с маленькой буквы.
      camelCase - это стиль наименования, когда 1-я буква - маленькая, а далее "слова" начинаются с 
      большой.

   11. Имя класса начинаем с Большой буквы.

## Методы
Метод, который ничего не принимает (пусто) и ничего не возвращает, выглядит так:

      piblic static void methodName(){ // void указывает на то, что метод ничего не возвращает
         do_something;
      }

Метод, который принимает параметры (аргументы) и ничего не возвращает выглядит так:

      piblic static void methodName(T1 t1, T2 t2){
         do_something;
      }

Метод, который принимает параметры (аргументы) и возвращает результат типа T выглядит так:

      piblic static T methodName(T1 t1, T2 t2){
         do something;
         return ...; // ответ, результат из/от метода
      }

Если метод возвращает данные, то только ОДНОГО ТИПА.

Любой метод вызывается по его имени либо без параметров, либо с параметрами, которые передаются
в метод.

## Примеры использования тернарного оператора:

    boolean isAdult = (age >= 18) ? true : false; - проверка на возраст более 18 лет
    int max = (a > b) ? a : b; - находим какое из 2-х чисел больше, является максимумом из них двоих
    boolean isEven = (x % 2 == 0) ? true : false; - проверка на четность и нечетность
    int absX = (x > 0) ? x : -x; - определение абсолютной величины числа, модуль числа

## Структурное программирование
- это одна из парадигм программирования (ответ на вопрос о том, как вообще писать код)
  [Подробнее](https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D1%83%D0%BA%D1%82%D1%83%D1%80%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)

Главная идея - **полный** отказ от **оператора GOTO НОМЕР_СТРОКИ**.
Использование только трех структур согласно теореме Бёма - Якопини:
- шаг алгоритма
- условие (ветвление), switch- case
- цикл

**Структурное программирование** - прогрессивный (до сих пор!) подход к созданию ПО,
отказ от спагетти-кода, что дало и дает рост производительности труда
программистов, снижение кол-ва ошибок и т.д.
