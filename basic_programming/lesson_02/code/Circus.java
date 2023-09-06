public class Circus {
    public static void main(String[] args) {
        lightOn();
        entertainer();
        lightOff();
    }
    public static void lightOn(){
        System.out.println("Lights on!");
    }

    public static void entertainer(){
        jogger();
        singer();
        cloun();
    }

    public static void lightOff(){
        System.out.println("Lights off!");
    }

    public static void jogger(){
        System.out.println("My nane is John.");
        System.out.println("I'm jogging!");
    }

    public static void singer(){
        System.out.println("My nane is Phillip.");
        System.out.println("I'm singing!");
    }

    public static void cloun(){
        System.out.println("My name is Oleg Popov.");
        System.out.println("I'm joking!");
    }

}
