package practice.beverage.model;

public class Beer extends Beverage {
    //поле класса
    private String type; // вид, сорт пива

    // конструктор
    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    // пустой конструктор
    public Beer() {
    }

    public void toBuy(String title, String packing, int quantity, String type){
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    public void displayStock(){
        super.displayStock();
        System.out.println("This is " + type + " beer.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
