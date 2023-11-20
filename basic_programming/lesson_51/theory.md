Of the interfaces that extend the Collection interface, we looked at the List interface, which implements
ArrayList and LinkedList.

Set translated from English is “set”, a set of some objects in the context of Java.
The peculiarity of this set is that it can store **only unique values**,
elements of this set.

Set is an **interface** with methods for working with sets:
- add to set,
- remove from set,
- check the presence of an element in the set.

The Set interface extends the Collection interface, and defines collections that
**do not contain two identical elements**.

The Set interface is inherited by the HashSet class, which allows you to create a set/collection of unique elements.

If we are talking about the uniqueness of elements in a collection, then we must decide how this uniqueness is determined.
There are only two options:
- 1) two objects are the same if the equals method returns true.
- 2) two objects are the same if the comparison method (compareTo or compare) returns zero.

Based on option one, an implementation of the Set interface called HashSet is built. That's why equals() and hashSet
implemented by a “pair”, jointly.

Based on option two, an implementation of the Set interface called TreeSet is built.

Examples of useful and necessary HashSets:
- email lists
- phone numbers
- accounts in banking systems
- identification numbers
- tax numbers
- ...

So what is a HashSet?
Answer: this is a class that implements the Set, Collection, Iterable interfaces.
There are no indexes in this structure; the element is searched by its hash. The hash is calculated every time.
The hashes are all unique, since the elements are unique!

**ATTENTION!**
There are no indexes for set elements! An element of a set is searched by matching its hash with the hash of the element being sought.
The hash is quickly calculated and stored in computer memory in special hash tables.

**Examples:**
Car brands are a multitude where each element must be unique.
There are about 100 of them now.

Let's give examples of useful Sets from life:
- letter alphabet
- language dictionary
- indexes for postal addresses
- VIN of cars
- product serial number
- bar code
- Internet links
- from the financial sector: client account, SWIFT code, ...
- banknote numbers
- Tax ID
- e-mail within the registrar
- IP address

Question: How does Set behave when you try to add an element to it that is already in it?
Answer: ignores this operation.

**_Syntax for initializing HashSet:_**
`Set<Type> myHashSet = new HashSet<>();`

### How is Hash calculated???
hashCode() method – returns the hash code for a given string (character set).
The hash value of an empty string is zero.
hashCode(string) = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1], ^ is exponentiation
s[0] is the 1st element of the string (character), s[1] is the 2nd element, etc.
The prime number 31 was chosen empirically.

### What is Hash for?
Hash is the key (unique identifier) for the hash table that stores
pairs of values:
hash of the 1st element | 1st element of the set
hash of the 2nd element | 2nd element of the set
...

### HashSet (summary)
1. The fundamental impossibility of repeating elements of a set (collection);
2. There is no order; when adding an existing element, it ends up somewhere inside the set;
3. There are no indexes of elements, each element has a Hash, by which it is determined (located);
4. HashSet Methods:
- Add element(s): `add()`, `addAll()`
- Remove element(s): `remove()`, `removeAll()`
- Clear a set (remove all elements): `clear()`
- Check if element(s) exist: `contains()`, `containsAll()`
- Find out the size: `size()`

A set **has no indexes** and cannot be **"sorted"**!


_______________________________________________________________

# JVF: Set, HashSet 

Из интерфейсов расширяющих интерфейс Collection, мы рассмотрели интерфейс List, на котором реализованы 
ArrayList и LinkedList. 

Set в переводе с английского - это "множество", множество каких-то **объектов** в контексте Java.
Особенность этого множества в том, что оно может хранить **только уникальные значения**, 
элементы этого множества.

Set<T> - это **интерфейс** с методами для работы со множеством:
- добавить во множество,
- удалить из множества,
- проверить наличие элемента во множестве.
 
Интерфейс Set расширяет интерфейс Collection, и определяет коллекции, которые 
**не содержат двух одинаковых элементов**.

Интерфейс Set наследуется в классе HashSet, который позволяет создать набор/коллекцию уникальных элементов.

Если мы говорим об уникальности элементов в коллекции, то мы должны решить, как эта уникальность определяется. 
Есть всего две опции:
- 1) два объекта одинаковые, если метод equals возвращает true. 
- 2) два объекта одинаковые, если метод сравнения (compareTo или compare) возвращает ноль.

На опции один, построена реализация интерфейса Set называемая HashSet. Именно поэтому equals() и hashSet 
реализуются "парой", совместно.

На опции два, построена реализация интерфейса Set называемая TreeSet.

Примеры полезных и нужных HashSet:
- списки e-mail
- номера телефонов
- аккаунты в банковских системах
- идентификационные номера
- налоговые номера
- номер паспорта
- автомобильные номера
- IP-адрес
- Bar/Штрих-коды
- серийный номер изделия
- IMEI у SIM - карты
- ... 


Итак, что такое HashSet? 
Ответ: это класс, который реализует(implements) интерфейсы Set, Collection, Iterable.  
Индексов в этой структуре нет, элемент ищется по его хешу. Хеш каждый раз вычисляется.
Хеши все уникальные, так как элементы уникальные!

**ВНИМАНИЕ!**
Индексов у элементов сета нет! Элемент множества ищется по совпадению его хеша с хешем искомого элемента.
Хеш быстро вычисляется и хранится в памяти компьютера в специальных хеш-таблицах.
При совпадении хешей (коллизия) образуется связный список и элемент заносится в Set.

**Примеры:**
Бренды автомобилей - это множество, где каждый элемент должен быть уникален.
Их сейчас порядка 100.

Давайте приведем примеры полезных Set из жизни:
- буквенный алфавит
- словарь языка
- индексы для почтовых адресов
- VIN автомобилей
- серийный номер изделия
- штирх-код
- ссылки в Интернете
- из финансовой сферы: счет клиента, SWIFT-код, ...
- номера купюр
- Tax ID
- e-mail в пределах регистратора
- IP - адрес

Вопрос: Как ведет себя Set при попытке добавить в него имеющийся уже в нем элемент?
Ответ: игнорирует эту операцию.

**_Синтаксис для инициализации HashSet:_**
      `Set<Type> myHashSet = new HashSet<>();`

### Как вычисляется Hash ???
Метод hashCode() – возвращает хэш-код для данной строки (набор символов).
Хэш-значение пустой строки равно нулю.
hashCode(строка) = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1], ^ - это возведение в степень
s[0] - это 1-й элемент строки (символ), s[1] - 2-й элемент и т.д.
Простое число 31 подобрано опытным путем.

### Для чего нужен Hash?
Hash - это ключ (уникальный идентификатор) для hash-таблицы, в которой хранятся
пары значений:
hash 1-го элемента | 1-й элемент множества
hash 2-го элемента | 2-й элемент множества
...

### HashSet (summary)
1. Принципиальная невозможность повторений элементов множества (коллекции);
2. Нет порядка, при добавлении имеющегося элемент попадает куда-то внутрь множества;
3. Нет индексов элементов, у каждого элемента есть Hash, по которому он и определяется (находится);
4. Методы HashSet:
- Добавить элемент(ы): `add()`, `addAll()`
- Удалить элемент(ы): `remove()`, `removeAll()`
- Очистить множество (удалить все элементы): `clear()`
- Проверить, есть ли элемент(ы): `contains()`, `containsAll()`
- Узнать размер: `size()`

Во множестве **не бывает индексов**, и его нельзя **"отсортировать"**!





