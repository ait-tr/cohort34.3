# Основы реляционных БД

**Система управления базами данных, СУБД** — специальная программа-сервер позволяющая использовать и управлять базами данных. СУБД позволяет читать и записывать данные, искать по ним и выполнять сложные выборки.

## База данных

**БД** — фактически создаваемые на диске файлы, в которых хранится информация записанная с помощью СУБД

**Важно!**
Часто значение БД и СУБД путают, можно услышать фразу “БД PostgreSQL” когда имелось ввиду “СУБД PostgreSQL”

## Что такое РСУБД?

**Реляционная система управления базами данных, РСУБД / Relational Database Management System (RDBMS)** — СУБД которая хранит данные в виде таблиц и строк в этих таблицах.
Любая данные в РСУБД должны быть структурированы в соответствии с реляционной моделью.
Примеры РСУБД:

- MySQL
- PostgreSQL
- MSSQL
- Oracle

## PostgreSQL

_SQL_ - язык структурированных запросовStructured Query Language

**SQL** — декларативный язык программирования, предназначенный для описания, изменения и извлечения данных из СУБД. Чаще всего используется в реляционных СУБД.

### Таблица, строка, столбец

- _Таблица_ — совокупность строк и столбцов
- _Строка_ — запись в БД о конкретной сущности
- _Столбец_ — любой атрибут сущности хранящейся в строке




## Data Definition Language, Data Control Language,

**DDL** — подмножество языка SQL, предназначенное для создания, изменения и удаления баз данных и таблиц в них. К нему относятся все команды, начинающиеся с CREATE, ALTER и DROP.

**DCL** — подмножество языка SQL, предназначенное для управления правами доступа к базам данным и таблицам в них. С помощью него можно разрешить и запрещать пользователям создавать, изменять и удалять базы данных или таблицы. К нему относятся все команды, начинающиеся на GRANT и REVOKE.

