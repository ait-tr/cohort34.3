package projects.group4_family_budget.model;

public enum Menu {
    ALL(1, " - View of purchases - "),
    LOAD(2, " - Load new purchases - "),
    REMOVE(3, " - Remove purchase - "),
    STORES(4, " - Searching purchases by store - "),
    PERSONS(5, " - Searching purchases by person - "),
    PERIOD(6, " - Searching purchases by period - "),
    CHECK(7," - Check your current budget - "),//todo
    EXIT(8, " - Exit");

    private final int menuItem;
    private final String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }
    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i <menu.length ; i++) {
            System.out.print(menu[i].menuItem + menu[i].action + " | ");
        }System.out.println();
    }
}
