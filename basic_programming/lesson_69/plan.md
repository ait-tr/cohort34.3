# Lesson plan No. 68 12/15/2023

1. Project - implementation of Java-based information technologies in the family.
   Problematic: the need to track expenses, control expenses.

2. Practice - project implementation:
- conducting a survey of the informatization object:
  - primary information (data) - how is it done?
  - collection and input of information - how does it happen?
  - the final consumer of the project result?
- development of an information model:
  - classes
  - interfaces
- thinking and designing UX/UI
- writing code:
  - implementation of classes
  - test design
  - application development

3. Tasks for independent solution:

**Exercise 1.**
Create a class "Yacht". The class must store the following information:
- manufacturer (shipyard);
- year of issue;
- length;
- body material (wood, plastic, metal);
- price.

You need to create a set of yachts and complete the following tasks:
- display all yachts;
- display yachts made from the specified hull material;
- display yachts more expensive than the specified price;
- display yachts whose year of manufacture is in a given range;
- sort yachts in descending order of cost;
- get the average cost of a yacht from the created set.

**Task 2.**
In an array with night temperatures over the past 2 weeks, find out how many times the temperature was below freezing at night.
On which observation day did the first frost occur? When was the last day like this?
What was the maximum temperature during the observation period? What day was this?
What was the minimum temperature during the observation period? What day was this?
What was the average night temperature during the observation period?
Were there periods when the minus at night lasted for several days in a row?

**Task 3.**
There is a list of all registered residents of an apartment building in the format:
Last name, first name, gender, date of birth, floor, apartment number.
You need to get answers to the following questions:
- which apartment(s) have the largest number of residents registered?
- which apartment(s) have the smallest number of residents registered?
- on which floor(s) are there the largest number of residents?
- what is the number of minor residents registered in the house?

Create a list of residents in a table editor, export it in csv format,
import it into objects, create a collection based on these objects, use
Stream API methods for obtaining answers to posed questions.

___________________________________________

# План занятия №69 18.12.2023

1. Обсуждение домашнего задания:
- яхты;
- ночная температура;
- жильцы дома.

2. Практика на использование Stream API
**Задание 1.**
- создать с помощью stream поток случайных целых чисел;
- выведите на печать элементы потока;
- сколько в потоке получилось положительных чисел? сколько отрицательных?
- просуммируйте все нечетные элементы потока;
- найдите максимальное число, минимальное число;
- выведите значения метода summaryStatistic.

**Задание 2.**
Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис.
Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны.
Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз.
Необходимо ответить на вопросы:
1. Какие страны наиболее популярны?
2. Кто из клиентов посетил наибольшее количество стран?


3. Практика - реализация мини-проектов:
- конвертор валюты:
  - загружает из файла список доступных валют с курсами (список валют - это множество!);
  - запрашивает у клиента желаемую валюту и сколько у него денег для обмена;
  - сообщает сумму к выдаче;
  - в конце сеанса сохраняет все сделанные транзакции в файл, предоставляет отчет о сумме 
  сделанных обменов по каждой валюте отдельно по покупке и продаже. 

- документы - архив:
  - рефакторинг на новые знания (JCF, stream).


**Для самостоятельной работы:**
- библиотека:
  - фиксирует выдачу книги на руки и ее возврат;
  - собирает от читателей отзывы и рейтинги прочитанных книг.
  
- семейный бюджет;

- калькулятор калорий съеденного за день.