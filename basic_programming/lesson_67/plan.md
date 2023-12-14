# Lesson plan No. 67 12/14/2023

1. Continuation of the Multithreading topic:
- Runnable interface and Thread class;
- The join method for the thread.

2. Practice:
- create and launch parallel tasks;
- "cockroach races".

3. Workshop on using the Stream API.

Task 1.
In an array with night temperatures over the past 2 weeks, find out how many times the temperature was below freezing at night.
On which observation day did the first frost occur? When was the last day like this?
What was the maximum temperature during the observation period? What day was this?
What was the minimum temperature during the observation period? What day was this?
What was the average night temperature during the observation period?
Were there periods when the minus at night lasted for several days in a row?

Task 2.
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

# План занятия №67 14.12.2023

1. Продолжение темы Multithreading:
- Интерфейс Runnable и класс Thread;
- Метод join у треда.

2. Практика:
- создаем и запускаем параллельные задачи;
- "тараканьи бега".

3. Практикум на использование Stream API.

Задача 1.
В массиве с ночной температурой за прошедшие 2 недели выяснить сколько раз ночью была минусовая температура.
В какой из дней наблюдений случился первый заморозок? Когда был такой последний день?
Какая максимальная температура была за период наблюдений? В какой день это было?
Какая минимальная температура была за период наблюдений? В какой день это было?
Какая средняя ночная температура была за период наблюдений?
Были ли периоды, когда минус ночью держался несколько дней подряд?

Задача 2.
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