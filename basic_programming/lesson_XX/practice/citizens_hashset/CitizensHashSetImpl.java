package citizens_hashset;

import practice.citizens_treeset.citizens_v2.dao.Citizens;
import practice.citizens_treeset.citizens_v2.model.Person;

import java.time.LocalDate;
import java.util.*;

public class CitizensHashSetImpl implements Citizens {

    // fields
    private Set<Person> idList; // список граждан по id
    private Set<Person> lastNameList; // список граждан по фамилиям
    private Set<Person> ageList; // список граждан по возрасту

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по алфавиту по фамилиям
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    private static Comparator<Person> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge()); // сортировка по кол-ву лет
        return res !=0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по id
    };

    public CitizensHashSetImpl() {
        idList = new HashSet<>();
        lastNameList = new HashSet<>();// за счет компаратора поддерживается уникальность и сортируемость множества
        ageList = new HashSet<>();}

    public CitizensHashSetImpl(List<Person> citizens) {
        this(); // вызов пустого конструктора
        for (Person person : citizens) {
            citizens.forEach(p -> add(p)); // новый синтаксис с лямбда - выражением
        }
    }

    public void printIdList(){
        for (Person p : idList) {
            System.out.println(p);
        }
    }

    public void printAgeList(){
        for (Person p : ageList) {
            System.out.println(p);
        }
    }

    public void printLastNameList(){
        for (Person p : lastNameList) {
            System.out.println(p);
        }
    }


    // O(
    @Override
    public boolean add(Person person) {
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    // O(
    @Override
    public boolean remove(int id) {
        Person person = find(id);
        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    // O(
    @Override
    public Person find(int id) {
        for (Person person : idList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    // O(
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        ArrayList<Person> res = new ArrayList<>();
        for (Person person : ageList) { // ageList теперь имеет тип HashSet<>()
            if(person.getAge() > minAge && person.getAge() < maxAge) {
                res.add(person);
            }
            res.sort(ageComparator);
            return res;
        }
        return null;
    }

    // O(
    @Override
    public Iterable<Person> find(String lastName) {
        ArrayList<Person> res = new ArrayList<>();
        for (Person person: lastNameList ) { // ageList теперь имеет тип HashSet<>(), но его можно обежать
            if(person.getLastName().equals(lastName)) { // ищем всех однофамильцев по фамилии lastName
                res.add(person); // добавляем в ArrayList
            }
            res.sort(lastNameComparator); // сортируем ArrayList
            return res; // возвращаем отсортированный по фамилиям список
        }
        return null;
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList;
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList;
    }

    // O(1)
    @Override
    public int size() {
        return idList.size();
    }
}
