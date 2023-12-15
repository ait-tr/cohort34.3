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

# План занятия №68 15.12.2023

1. Проект - внедрение информационных технологий на базе Java в семье.

**Проблематика:** необходимость отслеживания трат, контроль за расходами.

**Цель проекта:** разработать простое приложение, которое позволит оперативно контролировать 
семейный бюджет.

2. Практика - реализация проекта:
- проведение обследования объекта информатизации:
  - первичная информация (данные) - как поступают?
    - электронные источники (50%): 
      -  личный ноутбук
      - мобильные приложения
      - банковское приложение
      - личный кабинет в Интернет-магазине
    - бумажные носители (50%): 
      - в блокнотике
      - есть бумажные чеки
      - реестр покупок
      - счета
  Вывод: мы хотим, чтобы удобно наглядно быстро и не "на бумажке".
      
  - Боль: непредвиденные расходы!

  - участники процесса?
    - магазины
    - работодатель (в части дохода)
    - члены семьи - у нас несколько **"центров затрат"** (много трат, в разное время, залезаем в кредиты),
    - информацию от разных участников надо собрать и консолидировать:
      - посчитать, свести баланс
      - консолидировать = свести по статьям расходов (продукты, коммуналька, одеджа, Интернет, подписки...),  исключить "неучтенку", дубликаты 

  - сбор и ввод информации - как происходит?
    - посредством электронных и бумажных носителей - это сейчас
    - надо оперативно вводить данные в "одно окно, хранилище"
    - автоматизация расчета(ов)
    
  - конечный потребитель результата проекта?
    - глава домового хозяйства.

- разработка информационной модели:
  - классы (с чем работаем?):
    - меню -> emun
    - персоны (кто тратит деньги - имя, пол, возраст)
    - поставщики (кому платим - магазины и т.д. - название)
    - продукт (product, price, quantity)
    - покупка/расход (data, сумма общая, поставщик, список продуктов, кто потратил)
    - доходы (вид, сумма, кто принес)
    - статьи бюджета, категории (название категории, тип: доход или расход)
  - интерфейсы (что делаем?):
    - бюджет, кошелек (действия = методы)
    
- продумывание и проектирование UI/UX:
  - меню приложения
    - узнать баланс
    - добавить покупку
    - добавить бюджет
    - аналитика - по магазинам (поставщикам), по персонам, по статьям бюджета, по месяцам 
  - сценарий использования:
    - при каждом расходе и доходе;
    - регулярно раз в неделю, как минимум 1 раз в месяц.
  
- написание кода:
  - реализация классов
  - проектирование тестов
  - разработка приложения

3. Задачи для самостоятельного решения:

**Задание 1.**
Создать класс «Яхта». В классе должна храниться следующая информация:
- производитель(верфь);
- год выпуска;
- длина;
- материал корпуса (дерево, пластик, металл);
- стоимость.

Нужно создать набор яхт и выполнить следующие задачи:
- отобразить все яхты;
- отобразить яхты, сделанные из указанного материала корпуса;
- отобразить яхты дороже указанной цены;
- отобразить яхты, чей год выпуска находится в заданном диапазоне;
- отсортировать яхты в порядке убывания стоимости;
- получить среднюю стоимость яхты из созданного набора.

**Задача 2.**
В массиве с ночной температурой за прошедшие 2 недели выяснить сколько раз ночью была минусовая температура.
В какой из дней наблюдений случился первый заморозок? Когда был такой последний день?
Какая максимальная температура была за период наблюдений? В какой день это было?
Какая минимальная температура была за период наблюдений? В какой день это было?
Какая средняя ночная температура была за период наблюдений?
Были ли периоды, когда минус ночью держался несколько дней подряд?

**Задача 3.**
Имеется список всех зарегистрированных жильцов многоквартирного дома в формате:
Фамилия, Имя, пол, дата рождения, этаж, номер квартиры.
Необходимо получить ответы на вопросы:
- в какой (каких) квартирах зарегистрировано наибольшее количество жильцов?
- в какой (каких) квартирах зарегистрировано наименьшее количество жильцов?
- на каком (каких) этажах имеется наибольшее кол-во жильцов?
- какое кол-во несовершеннолетних жильцов зарегистрировано в доме?

Список жильцов сформируйте в табличном редакторе, экспортируйте его в формате csv,
импортируйте его в объекты, сформируйте коллекцию на базе этих объектов, используйте
методы Stream API для получения ответов на поставленные вопросы.
