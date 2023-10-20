package practice.cats;

public class Cat implements Comparable<Cat>{

    private int id; // чип
    private String name; // кличка
    private String breed; // порода
    private int age; // возраст
    private double weight; // вес

    // конструктор
    public Cat(int id, String name, String breed, int age, double weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // этот метод позволяет проводить сравнение объектов этого класса
    // он сравнивает текущий объект (this) с Cat o
    // и возвращает целое число. Если оно > 0 , то объекты меняются местами, в остальных случаях - оставляем как есть
    @Override
    public int compareTo(Cat o) {
        int res = this.age - o.age; //  сравнили года 2-х объектов - this и o
        return res;
    }
}
