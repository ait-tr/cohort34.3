# JСF: Map

Another part of JCF is the Map interface.

Map<K, V> is an interface that defines functionality for a data structure of type set of key-value pairs.
All keys in maps are unique. Maps are not iterable.

The main methods of the Map interface are given in the JCF presentation.

By analogy with sets, we will study two types of maps: HashMap and TreeMap.

Inside the Map structure/collection, data is stored in the “key” - “value” format, that is, in pairs.
Any complex(?) types can act as both keys and values
- numbers, strings or even objects of other classes.
  ATTENTION!!! The key must be **unique**!

What does **Hash** have to do with it?
Hash is calculated for the key and stored in the Hash table.
Internally, HashMap stores elements in a table like this:
Hash(key) | Meaning
Hash(key) | Meaning
...
Key hash calculation **provides guaranteed speed of access to the element**
(pair of values) in the collection.
There is a possibility that the key hashes will match.
This situation is called a **collision**. HashMap takes care of this situation,
creating a LinkedList (see below).
Moreover, a HashMap can have two or more matching values (but not key!)
collection elements.

**HashMap Examples (useful key-value pairs):**
address - all residents at this address
article number - quantity of this in stock
name - number of such names in the group
word - number of repetitions in speech
...

#### Operations with HashMap elements
nameHashMap.put ( key , value) - adding and **updating** an element
nameHashMap.get ( key ) - getting the value by key
nameHashMap.remove ( key ) - removing a value by key
nameHashMap.size() - getting the size of a collection of elements

#### Loop through HashMap elements
// Print keys - pass through all keys
for (String key : nameHashMap.keySet()) {
System.out.println(key);
}

// Print values - pass through all values
for (String value : nameHashMap.values()) {
System.out.println(value);
}

// Print keys and values - pass through all keys and their values
for (String key : nameHashMap.keySet()) {
System.out.println("key: " + key + " value: " + nameHashMap.get(i));
}

There are no numerical indexes, as in arrays or lists, in HashMap - element access
collections are carried out using a **key** (I remind you that it must be unique).

#### Syntax for creating a new HashMap
HashMap<keyType, valueType> nameHashMap = new HashMap<keyType, valueType>();


_______________________________________________________________


# JСF: Map

Еще одной частью JCF является интерфейс Map.

Map<K, V> это интерфейс определяющий функциональность для структуры данных типа множество пар ключ-значение.
Все ключи в мапах являются уникальными. Мапы не итерируемы.

Основные методы интерфейса Map приведены в презентации по JCF.

По аналогии с сетами, имеются две разновидности мап: HashMap и TreeMap.

Внутри структуры/коллекции Map данные хранятся в формате "ключ" - "значение", то есть по парам.
И в качестве ключей, и в качестве значений могут выступать любые сложные(?) типы
— числа, строки или даже объекты других классов.
ВНИМАНИЕ!!! Ключ должен быть **уникален**!

А при чем здесь **Hash**?
Hash вычисляется для ключа и храниться в Hash-таблице.
Внутри себя HashMap хранит элементы в таблице вида:
Hash (ключа) | Значение
Hash (ключа) | Значение
...
Вычисление хеша ключа **обеспечивает гарантированную скорость доступа к элементу**
(паре значений) в коллекции.
Вероятность, что хеши ключей совпадт имеется.
Такая ситуация называется **коллизией**. Эту ситуацию HashMap берет на себя,
создавая связанный список LinkedList (см. ниже).
При этом в HashMap могут быть два и более совпадающих по значению (но не по ключу!)
элементов коллекции.

**Примеры HashMap (полезные пары ключ - значение):**
адрес - все жильцы по этому адресу
артикул - количество этого на складе
имя - кол-во таких имен в группе
слово - кол-во повторений в речи
...

#### Операции с элементами HashMap
nameHashMap.put ( key , value) - добавление и **обновление** элемента
nameHashMap.get ( key ) - получение значения по ключу
nameHashMap.remove ( key ) - удаление значения по ключу
nameHashMap.size () - получение размера коллекции элементов

#### Цикл по элементам HashMap
// Print keys - проход по всем ключам
for (String key : nameHashMap.keySet()) {
System.out.println(key);
}

// Print values - проход по всем значениям
for (String value : nameHashMap.values()) {
System.out.println(value);
}

// Print keys and values - проход по всем ключам и их значениям
for (String key : nameHashMap.keySet()) {
System.out.println("key: " + key + " value: " + nameHashMap.get(i));
}

Номерных индексов, как в массивах или списках, в HashMap нет — доступ к элементу
коллекции осуществляется по **ключу** (напоминаю, что он должен быть уникальным).

#### Синтаксис создания новой HashMap
HashMap<keyType, valueType> nameHashMap = new HashMap<keyType, valueType>();












