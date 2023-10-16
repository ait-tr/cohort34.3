package homework;

public class Сircus {
    public static void main(String[] args) {
        client();
    }

    public static void client() {
        System.out.println("client-мне нужен катрон");
        System.out.println("client-позвоню мененджеру");
        System.out.println("...звонок...");
        manager();
    }

    public static void manager() {
        System.out.println("manager- Здравствуйте, меня зовут Тратата, чем могу вам помочь?");
        System.out.println("client- мне нужно 4 листа картона 2 на 2");
        System.out.println("manager- Завтра утром будет доставленно");
        System.out.println("client- спасибо, до свидания");
        System.out.println("...звонок завершен...");
        System.out.println("...Мененджер отправил запрос на фирму...");
        firma();
    }

    public static void firma() {
        System.out.println("...фирма отправила картон покупателю...");

    }
}

