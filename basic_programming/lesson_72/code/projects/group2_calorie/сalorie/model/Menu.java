package projects.group2_calorie.сalorie.model;

public enum Menu {

    ADD(1, "Add a product"),
    LIST(2, "Your list of products by period"),
    REMOVE(3, "Remove the product"),
    SAVE(4,"Save added products to file"),
    // TODO No.3 statistic
    LOAD(5,"Load added products from file"),
    EXIT(6, "Exit");

    //fields
    private final int menuItem;
    private final String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    public int getMenuItem() {
        return menuItem;
    }

    public String getAction() {
        return action;
    }

    public static void printMenu() {
        System.out.println("Menu: ");
        for (Menu menu : Menu.values()) {
            System.out.println(menu.getMenuItem() + " - " + menu.getAction());
        }
        System.out.println("Choose an option: ");
    }
}