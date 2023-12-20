# Lesson plan No. 71 12/20/2023

1. Mini-projects:
- Goal: implement a complete console application.
- Requirements:
    - Availability of menus and messages from the application in English
    - Saving and restoring data from a file in the current project directory (package)
    - Project structure:
      -dao
        - model
        - tests
        - application
    - protection against "fool" (incorrect data entry)
    - presence of a UML diagram

- Organization of work and timing:
    - joint work in Zoom during classes on December 20 and 21, you can request additional fees. conferences
    - distribution of roles (team lead, programmers, tests, project management)
    - distribution of tasks
    - creating a repository on GitHub https://github.com/ait-tr/cohort34.3
    - 20.12 - discussion and implementation, 21.12 - presentation of projects from 11:00
        - presentation is made by team lead;
        - demonstration of the application - what the application does (this is the main thing!), how it reacts to incorrect data entry;
        - who did what in the team;
        - questions and answers;
        - conclusions for yourself - who made what.

2. Topics of mini-projects:

- currency converter:
    - loads a list of available currencies with rates from a file (the list of currencies is a lot!);
    - asks the client for the desired currency and how much money he has to exchange;
    - reports the amount to be issued;
    - at the end of the session, saves all transactions made to a file, provides a report on the amount
      exchanges for each currency separately for purchase and sale.

- documents - archive:
    - refactoring taking into account JCF, Stream API;
    - CRUD functions for documents stored in the archive;
    - search for a document by keyword in its title or abstract;
    - the ability to obtain a list of documents included in the archive for a specified period.

- library:
    - records the issuance of the book and its return;
    - accounting for the number of times a book is issued to readers
    - collects reviews and ratings of books read from readers;
    - reviews have likes from those readers who liked them.

- family budget;

- calculator of calories eaten per day food.

___________________________________________

# План занятия №71 20.12.2023

1. Мини-проекты:
- Цель: реализовать законченное консольное приложение.
- Требования:
  - Наличие меню и сообщения от приложения на английском языке
  - Сохранение и восстановление данных из файла в текущей директории проекта (пакете)
  - Структура проекта:
    - dao
    - model
    - tests
    - приложение
  - защита от "дурака" (некорректный ввод данных)
  - наличие UML-схемы

- Организация работы и тайминг:
  - совместная работа в Zoom во время занятия 20 и 21 декабря, можно запросить доп. конференции 
  - распределение ролей (team lead, programmers, tests, project management)
  - распределение задач
  - создание репозитория на GitHub https://github.com/ait-tr/cohort34.3
  - использование Интернета и AI - по необходимости и желанию.
  - 20.12 - 21.12 - обсуждение и реализация, 21.12 - c 11:00 презентации проектов
    - презентацию делает team lead;
    - демонстрация работы приложения - что делает приложение (это главное!), как реагирует на неправильный ввод данных;
    - кто и что делал в команде;
    - вопросы-ответы;
    - выводы для себя - кто какие сделал.

2. **Темы мини-проектов:**

- конвертор валюты:
    - загружает из файла список доступных валют с курсами (список валют - это множество!);
    - запрашивает у клиента желаемую валюту и сколько у него денег для обмена;
    - сообщает сумму к выдаче;
    - в конце сеанса сохраняет все сделанные транзакции в файл, предоставляет отчет о сумме
      обменов по каждой валюте отдельно по покупке и продаже.

- документы - архив:
    - рефакторинг с учетом JCF, Stream API; 
    - CRUD-функции для хранимых в архиве документов;
    - поиск документа по ключевому слову в его заголовке или аннотации;
    - возможность получить список документов, внесенных в архив за указанный период.

- библиотека:
    - фиксирует выдачу книги на руки и ее возврат;
    - учет количества раз выдачи книги читателям
    - собирает от читателей отзывы и рейтинги прочитанных книг;
    - у отзывов имеются лайки от тех читателей, которым они понравились.

- семейный бюджет;

- калькулятор калорий съеденного за день.