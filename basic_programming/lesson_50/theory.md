# What we have learned over the past two weeks

* ENUM is a special class for enumerable data.

* Java Time API is a set of classes and interfaces for working with date, time, and calendar.

* Exceptions, Try ... catch, throw.

* Iterator and its hasNext() and Next() methods.

* Computational complexity (Complexity), O() - notation.

* Java Collection Framework (JCF) - a set of interfaces and classes (structures) for various data.

* ArrayList<E> - class and its methods for numbered lists of data.

* LinkedList<E> - class and its methods for linked lists of data (each element inside the list
  connected with the previous and the following).

_______________________________________________________________

# Что мы узнали за прошедшие две недели

* ENUM - специальный класс для перечислимых данных.

* Java Time API, это набор классов и интерфейсов для работы с датой, временем, календарем.

* Exceptions, Try ... catch, throw.

* Итератор и его методы hasNext() и Next().

* Вычислительная сложность (Complexity), O() - нотация.

* Java Collection Framework (JCF) - набор интерфейсов и классов (структур) для различных данных.

* ArrayList<E> - класс и его методы для нумерованных списков данных.

* LinkedList<E> - класс и его методы для связных списков данных (каждый элемент внутри списка 
связан с предыдущим и последующим).

__________________

Comparable<E>, Comporator<E> - повторение:

public Class implements Comparable<Class> {
    ...

    public int compareTo(Object o){
        return this.number - o.number; // сортировка по числам типа int
    }
}

