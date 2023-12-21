package projects.group1_archive.model;
public enum Menu {
    ADD(1, "Add doc"), DEL(2, "Remove doc"), FIND(3, "Find doc"), DATES(4, "View docs between dates"), FOLDER(5, "View docs from folder"), ALL(6, "View all "), QUA(7, "Total quantity "), EXIT(8, "Exit");

    private final int num;
    private final String action;

    Menu(int num, String action) {
        this.num = num;
        this.action = action;
    }

    public int getNum() {
        return num;
    }

    public String getAction() {
        return action;
    }

    public static void printMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i].num + " - " + menus[i].action );
        }
        System.out.println();
    }
}
