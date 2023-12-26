package projects.group3_currency_exchange.model;

public enum Menu {
    LOAD_CURRENCIES(1, "Load currencies"),
    BUY_CURRENCY(2, "Buy currency"),
    SELL_CURRENCY(3, "Sell currency"),
    REPORT(4, "Report"),
    EXIT(5, "Exit");

    private final int number;
    private final String action;

    Menu(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public String getAction() {
        return action;
    }

    public static Menu getMenuByNumber(int number) {
        for (Menu option : Menu.values()) {
            if (option.getNumber() == number) {
                return option;
            }
        }
        return null;
    }

    public static void printMenu() {
        System.out.println("Menu:");
        for (Menu option : Menu.values()) {
            System.out.println(option.getNumber() + ". " + option.getAction());
        }
        System.out.println("Enter your choice:");
    }
}
