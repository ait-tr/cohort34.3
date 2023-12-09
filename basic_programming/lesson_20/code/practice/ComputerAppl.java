package practice;

public class ComputerAppl {
    public static void main(String[] args) {
        double a = 10;
        int[] arr = new int[10];
        System.out.println(arr);
        Computer[] shop = new Computer[4];
        System.out.println(shop);
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[0].setRam(24);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);
        }
//        Object computer = new Computer("i5", 12, 512, "HP");
//        Object laptop = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
//        System.out.println(computer);
//        System.out.println(laptop);

    }
}
