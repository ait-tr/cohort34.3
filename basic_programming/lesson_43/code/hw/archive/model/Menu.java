package hw.archive.model;
//      - добавить документ (запрос id документа, id папки, названия документа, url, присвоение текущей даты и времени)
//        - показать список всех документов в архиве
//        - узнать количество хранимых документов в архиве
//        - поиск документа (id папки, id документа)
//        - удаление документа (id папки, id документа)
//        - выход

public enum Menu {
    ADD(1, "Add document"), LIST(2, "List of documents"), QUANTITY(3, "Quantity"), FIND(4, "Find document"), REMOVE (5, "Delete document"), EXIT(6, "Exit");

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
        System.out.println(); // new line
    }
}
