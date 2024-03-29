## Теория
## Combinatorics(Комбинирование данных)


Основные методы комбинирования:


**Полный перебор значений**


• Тестирование всех возможных комбинаций всех значений всех параметров


• Максимальное покрытие


• Максимум тестов


**Метод минимальных проверок**


• По одному значению каждого параметра использовано хотя бы в одном тест-кейсе


• Минимальное покрытие


• Минимум тестов


**Атомарная проверка**


• Тест-кейсы строятся на основе выбора всех базовых значений, кроме одного, которое изменяется


• Легко локализуемое покрытие


**Pairwise**


• Вместо проверки всех комбинаций - выбираем уникальные пары всех параметров


• Согласно исследованиям компании IBM 97% ошибок в ПО возникает при взаимодействии всего двух значений


Pairwise online https://pairwise.teremokgames.com/


Allpairs download https://www.satisfice.com/download/allpairs


**Алгоритм применения техники**


- Определить переменные
- Определить их значения
- Оптимизировать значения
- Описать условия и зависимости
- Построить тестовую таблицу


[Презентация](https://docs.google.com/presentation/d/1GhpqeK3QIi6w3Bvju3ToKG8E1LTRzS9M/edit?usp=share_link&ouid=116447005932578256378&rtpof=true&sd=true)




## State transition diagrams - Диаграммы перехода состояний
методика тестирования ПО, когда изменения условий ввода вызывают изменения состояния в тестируемом приложении


a software testing technique where changes in input conditions cause state changes in the application under test


**Two types of visual representation of technology(Два вида визуального представления техники):**


- State-Transition Diagram(Диаграмма перехода состояний)


- State-Transition Table(Таблица перехода состояний)


**Components of a state transition diagram(Составляющие диаграммы перехода состояний)**


States(Состояния) - possible conditions for the existence of the system at the moment(возможные условия существования системы в данный момент)


Transitions(Переходы) - possible changes to the object leading to a change in state(возможные изменения объекта, приводящие к изменению состояния)


Events(События) - external events that can occur and cause a change in state(внешние события, которые могут произойти и вызывают изменение состояния)


[Презентация](https://docs.google.com/presentation/d/1ruKU-zimvqJ0eUabbj4C9a-7kzfOqyK-/edit?usp=sharing&ouid=116447005932578256378&rtpof=true&sd=true)



## WHITE-BOX testing(Техника тестирования белого ящика)
используется на уровне тестирования компонентов(т.н. модульного тестирования), но его также можно применять на любом другом уровне, используя различные модели ПО «белого ящика»


used at the component testing level, but can also be applied at any other level using various white box software models


**Statement coverage(Покрытие операторов)**


включает выполнение всех операторов хотя бы один раз в исходном коде


involves executing all statements at least once in the source code


**Branch coverage(Покрытие ветвей)**
также известно как покрытие решений(decision coverage) или покрытие всех границ(all-edges coverage)


охватывает как истинные, так и ложные условия, маловероятные для покрытия операторов


covers both true and false conditions, unlikely to cover statements


[Презентация](https://docs.google.com/presentation/d/1yvwkvPDSZTZYUrMa7WFrPW8zpD-Zd3X3/edit?usp=share_link&ouid=116447005932578256378&rtpof=true&sd=true)




