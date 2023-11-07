package hw.todo_v3.model;

public enum Menu {
    ADD(1, "Add task"), LIST(2, "View tasks"), FIND(3, "Find task"), REMOVE(4, "Remove task"), EXIT(5, "Exit");

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
        Menu[] menu = Menu.values(); // put enum items into array
        for (int i = 0; i < menu.length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        // TODO заменить на foreach с 19 строчки
        System.out.println(); // new line
    }
}
