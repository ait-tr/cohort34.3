package practice.citizens.dao;

import practice.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CitizensImpl implements Citizens{

    // fields
    private List<Person> idList; // список граждан по id

    private List<Person> lastNameList; // список граждан по фамилиям

    private List<Person> ageList; // список граждан по возрасту

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по алфавиту по фамилиям
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge()); // сортировка по кол-ву лет
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    // constructor
    // пустой конструктор
    public CitizensImpl() {
        idList = new ArrayList<>(); // создаем пустой лист
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this(); // вызов пустого конструктора
        for (Person person : citizens) {
            add(person);
        }
    }
    // O(n)
    @Override
    public boolean add(Person person) {
        // будем вносить объекты Person сразу в три листа
        // поддерживая их сортировку
        if(person == null){
            return false;
        }
        // O(log(n))
        int index = Collections.binarySearch(idList, person); // быстрый поиск
        if (index >= 0) {
            return false;
        }
        index = - index -1;
        // O(n) - потому что это метод от ArrayLis
        idList.add(index, person);
        // O(log(n))
        index = Collections.binarySearch(ageList, person, ageComparator); // быстрый поиск
        index = index >=0 ? index : -index -1;
        // O(n) - потому что это метод от ArrayLis
        ageList.add(index, person);
        // O(log(n))
        index = Collections.binarySearch(lastNameList, person, lastNameComparator); // быстрый поиск
        index = index >=0 ? index : -index -1;
        // O(n) - потому что это метод от ArrayLis
        lastNameList.add(index, person);

        return true;
    }

    // O(log(n))
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if(victim == null) {
            return false;
        }
        idList.remove(victim);
        return true;
    }

    // O(log(n))
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, null, null, null);
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index); // нашли и вернули объект по индексу
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, null, null, now.minusYears(minAge));
        int from = - Collections.binarySearch(ageList, pattern, ageComparator) -1;
        pattern = new Person(Integer.MAX_VALUE, null, null, now.minusYears(maxAge));
        int to = - Collections.binarySearch(ageList, pattern, ageComparator) -1;
        return ageList.subList(from, to);
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(String lastName) {
        Person pattern = new Person(Integer.MIN_VALUE, null, lastName, null);
        int from = - Collections.binarySearch(lastNameList, pattern, lastNameComparator) -1;
        pattern = new Person(Integer.MAX_VALUE, null, lastName, null);
        int to = - Collections.binarySearch(lastNameList, pattern, lastNameComparator) -1;
        return lastNameList.subList(from, to);
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList; // вернули ссылку
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList; // вернули ссылку
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList; // вернули ссылку
    }

    // O(1)
    @Override
    public int size() {
        return idList.size();
    }
}
