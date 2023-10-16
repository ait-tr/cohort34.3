# Loops

**Cycles** are operators for repeated execution of actions.

The `while` loop in Java - formalizes and allows you to perform multiple actions in
laconic structure.

Drawing a block diagram of the While loop in the app.diagrams.net editor.

**Example:**
An algorithm for slicing apples for a pie in a `while` form in Java might look like:

Algorithm for the loop "in words":
_______________________
     while(number of Apples in Basin > 0) {
         apple = Basin.takeNextApple();
         putInPie(apple.peel().cut());
         numberofApplesInBasike = numberofApplesInBasike - 1; // decrement, reduces the number of apples by one;
         // the same thing: number of Apples in the basin --;
     }
     System.out.println('There are no more apples in the basket.');

**Important terms!:**
Cycle parameter: number of apples
Loop condition: number of apples > 0
Loop body: statements (what is inside {} )

## Syntax

     while (Boolean expression) {
     // Body of the loop - periodically executed statement(s)
     }

This is done as follows (step by step):
1. We evaluate the Boolean condition that follows the `while` in parentheses.
2. If the logical condition is true, then the statements in the body of the loop {} are executed,
   After executing the last statement in the body of the loop, we go back to checking the condition.
3. If the logical condition is false, then leave the `while` loop and go to the line below after the body of the loop.

## While loop is a loop with a precondition

Since before executing the body of the loop, we always pre-compute the logical expression (the condition for entering the loop),
this kind of `while` is often called a precondition loop.

Let's build a table of the first ten integer, positive powers of the number 3:

       int number = 3; // Number raised to a power
       int result = 1; // Result of exponentiation
       int power = 1; // Initial exponent
       while(power <= 10) { // loop entry condition
         result *= number; // result = result * number;
         System.out.println(number + " to the power of " + power + " = " + result);
         power++; // power = power + 1;
       }

Console output result:

     ```
     3 to the power of 1 = 3
     3 to the power of 2 = 9
     3 to the power of 3 = 27
     3 to the power of 4 = 81
     3 to the power of 5 = 243
     3 to the power of 6 = 729
     3 to the power of 7 = 2187
     3 to the power of 8 = 6561
     3 to the power of 9 = 19683
     3 to the power of 10 = 59049
     ```

## Loop with post condition

Second type of cycle:

     do {
     // Body of the loop - periodically executed statement(s)
     } while (Boolean expression);

Performed as follows (steps):
1. The body of the loop is executed (immediately after the `do` keyword).
2. We evaluate the Boolean condition that follows the `while` in parentheses.
3. If the logical condition is true, then go (return) to step 1
4. If the logical condition is false, then leave the `while` loop.

Loop with post condition - the body of the loop is processed at least **once**.
This is its difference from a loop with a precondition.

**Algorithm for starting the cycle:**
Step 1. Set the loop variable (counter, parameter);
Step 2. Determine the condition for repeating the cycle;
Step 3. Fill the loop body with the necessary operators;
Step 4. Change the variable (counter, parameter) of the loop;
Step 5. Debugging: run the loop and check its operation at extreme values and in general.

Useful when debugging a loop:
- enable intermediate printing of the cycle parameter and the result obtained at the debugging stage;
- check at extreme values, and then for 1-2 iterations yourself (pen, paper, calculator);
- use debugger.

____________________________________________________

# Циклы 

**Циклы** – операторы многократного выполнения действий.

Цикл `while` в Java (читается цикл вайл) - оформляет, позволяет выполнить многократные действия в
лаконичную структуру.

**while** в переводе с английского означает **пока**

Рисуем блок-схему цикла While в редакторе app.diagrams.net

**Пример:**
Алгоритм по нарезке яблок для пирога в виде `while` в Java мог бы выглядеть как:

Алгоритм цикла "словами":
_______________________
    while(количествоЯблокВТазике > 0) {
        яблоко = Tазик.взятьОчередноеЯблоко();
        положитьВПирог(яблоко.чистить().нарезать());
        числоЯблокВТазике = числоЯблокВТазике - 1; // декремент, уменьшает количество яблок на единицу;
        // то же самое: числоЯблокВТазике--;
    }
    System.out.println('Яблоки в корзине закончились.');

**Важные термины!:**
Параметр цикла: количество яблок
Условие цикла: количество яблок > 0
Тело цикла: операторы (то, что стоит внутри {} )

## Синтаксис

    while (Логическое выражение) {
    // Тело цикла - периодически выполняемые оператор(ы)
    }

Выполняется следующим образом (по шагам):
1. Вычисляем Логическое условие, следующее в скобках за `while`.
2. Если логическое условие истинно, то выполняются операторы в теле цикла {},
   после выполнения последнего оператора в теле цикла, переходим обратно на проверку условия.
3. Если логическое условие ложно, то покидаем цикл `while`, переходим на строчку ниже после тела цикла.

## Цикл While - это цикл с предусловием

Так как перед выполнением тела цикла мы всегда предварительно вычисляем логическое выражение (условие входа в цикл),
то этот вид `while` часто называют циклом с предусловием.

Построим таблицу первых десяти целых, положительных степеней числа 3:

      int number = 3; // Возводимое в степень число
      int result = 1; // Результат возведения в степень
      int power = 1; // Начальный показатель степени
      while(power <= 10) { // условие входа в цикл
        result *= number; // result = result * number;
        System.out.println(number + " в степени " + power + " = " + result);
        power++; // power = power + 1;
      }

Результат вывода на консоль:

    ```
    3 в степени 1 = 3
    3 в степени 2 = 9
    3 в степени 3 = 27
    3 в степени 4 = 81
    3 в степени 5 = 243
    3 в степени 6 = 729
    3 в степени 7 = 2187
    3 в степени 8 = 6561
    3 в степени 9 = 19683
    3 в степени 10 = 59049
    ```

## Цикл с постусловием

Второй вид цикла:

    do {
    // Тело цикла - периодически выполняемые оператор(ы)
    } while (Логическое выражение);

Выполняется следующим образом (шаги):
1. Выполняется тело цикла (сразу после ключевого слова `do`).
2. Вычисляем Логическое условие, следующее в скобках за `while`.
3. Если логическое условие истинно, то переходим (возвращаемся) на шаг 1
4. Если логическое условие ложно, то покидаем цикл `while`.

Цикл с постусловием - тело цикла отрабатывается как минимум **один раз**.
Это его отличие от цикла с предусловием.

**Алгоритм запуска цикла:**
Шаг 1. Задаем переменную (счетчик, параметр) цикла;
Шаг 2. Определяем условие повторения цикла;
Шаг 3. Заполняем тело цикла необходимыми операторами;
Шаг 4. Изменяем переменную (счетчик, параметр) цикла;
Шаг 5. Отладка: запустить цикл и проверить его работу на крайних значениях и в целом.

Полезно при отладке цикла:
- включить на этапе отладки промежуточные печати параметра цикла и получаемого результата;
- проверить при крайних значениях, а потом на 1-2 итерации самостоятельно (ручка, бумажка, калькулятор);
- использовать debugger.
