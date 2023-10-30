package practice.seasons;

public enum Season {

    WIN(1, "Winter"), SPR(2, "Spring"), SUM(3, "Summer"), AUT(4, "Autumn");

    // поля класса
    private int number;
    private String name;

    // конструктор
    Season(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
