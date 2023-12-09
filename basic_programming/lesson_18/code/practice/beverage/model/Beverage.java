package practice.beverage.model;

public class Beverage {
    // fields
    private String title; // наименование
    private String packing; // вид упаковки
    private int quantity; // количество упаковок

    // конструктор
    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }

    // пустой конструктор
    public Beverage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // метод для покупки
    public void toBuy(String title, String packing, int quantity){
        System.out.println("Go to market and buy : " + title + " " + packing + " " + quantity + ".");
    }

    // метод для проверки того, что осталось на складе
    public void displayStock(){
        System.out.println("We have : " + title + " " + packing + " " + quantity);
    }

}
