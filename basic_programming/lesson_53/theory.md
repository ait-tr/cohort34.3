# JVF: HashSet and TreeSet

##HashSet
If we are talking about the uniqueness of elements in a collection, then we must decide how this uniqueness is determined.
There are only two options:
- 1) two objects are the same if the equals method returns true.
- 2) two objects are the same if the comparison method (compareTo or compare) returns zero.

Based on option one, an implementation of the Set interface called HashSet is built. That's why equals() and hashSet
implemented by a “pair”, jointly.
If you decide to store objects of some type in a HashSet, then it is advisable to ensure that the fields
those involved in the hashCode calculation were unchanged. Changing the relevant fields may result in
"leakage" of data from the set.

## TreeSet
Based on option two, an implementation of the Set interface called TreeSet is built.

TreeSet Java is implemented as <a href="https://habrahabr.ru/post/330644/">red-black tree</a>.
Here is <a href="https://www.cs.usfca.edu/~galles/visualization/RedBlack.html">visualization of a red-black tree</a>.

In a TreeSet, to determine the uniqueness of the stored data, it must be either Comparable or in a TreeSet
Comparator must be passed during creation.

_______________________________________________________________

# JVF: HashSet и TreeSet

## HashSet
Если мы говорим об уникальности элементов в коллекции, то мы должны решить, как эта уникальность определяется.
Есть всего две опции:
- 1) два объекта одинаковые, если метод equals возвращает true.
- 2) два объекта одинаковые, если метод сравнения (compareTo или compare) возвращает ноль.

На опции один, построена реализация интерфейса Set называемая HashSet. Именно поэтому equals() и hashSet
реализуются "парой", совместно.
Если объекты какого-то типа решили хранить в HashSet, то желательно позаботиться, чтобы поля
участвующие в расчете hashCode были неизменными. Изменение соответствующих полей, может привести к
"утечке" данных из сета.

## TreeSet
На опции два, построена реализация интерфейса Set называемая TreeSet.

TreeSet Java реализован как <a href="https://habrahabr.ru/post/330644/">красно-черное дерево</a>. 
Вот <a href="https://www.cs.usfca.edu/~galles/visualization/RedBlack.html">визуализация красно-черного дерева</a>.

В TreeSet для определения уникальности хранимых данных, они должны быть или Comparable, или в TreeSet 
при создании должен быть передан Comparator.








