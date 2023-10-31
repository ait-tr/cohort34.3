package practice.todolist_appl.model;

public enum Menu {
    LIST(1, "List"), ADD(2, "Add"), FIND(3, "Find"), REMOVE(4, "Remove"), EXIT(5, "Exit");

    //fields
    private int menuItem;
    private String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < Menu.values().length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i] + " | ");
        }
        System.out.println();
    }

}
