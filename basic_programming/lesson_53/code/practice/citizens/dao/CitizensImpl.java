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

    private List<Person> ageList; // список граждан по годам

    private static Comparator<Person> lastNameComparator;

    private static Comparator<Person> ageComparator;

    // constructor
    // пустой конструктор
    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        for (Person person : citizens) {
            add(person);
        }
    }

    @Override
    public boolean add(Person person) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public Person find(int id) {
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        return null;
    }

    @Override
    public Iterable<Person> find(String lastName) {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
