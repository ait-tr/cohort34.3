package homework;

import homework.model.Computer;
import homework.model.Laptop;

public class ComputerAppl1 {
    public static void main(String[] args) {
        double a = 10; //upper casting
        int b = (int) a; //down casting
        Computer[] shop = new Computer[5];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", "14", 1500, 1.6);//upper casting from Laptop to Computer
        shop[2] = new Laptop("i7", 24, 1024, "Asus", "12", 1100, 1.2);
        shop[3] = new homework.model.Smartphone("Snapdragon", 8, 128, "Samsung", "9", 900, 0.6, 123456789098l);
        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total ssd capacity = " + total);
        Laptop laptop1 = (Laptop) shop[1]; //down casting
        laptop1.setRam(16);
        System.out.println(laptop1);
        System.out.println(shop[1]);
        double res = getTotalLaptopHours(shop);
        System.out.println("Total laptops hours = " + res);
        total = getTotalSSDLaptopCapacity(shop);
        System.out.println("Total ssd laptops capacity = " + total);
    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public static int getTotalSSDCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getHdd(); // res = res + arr[i].getSsd();
            }
        }
        return res;
    }

    public static int getTotalSSDLaptopCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                res += arr[i].getHdd(); // res = res + arr[i].getHdd();
            }
        }
        return res;
    }

    public static double getTotalLaptopHours(Computer[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                Laptop laptop = (Laptop) arr[i];
                res += laptop.getHdd(); // res = res + laptop.getHours();
            }
        }
        return res;
    }
}
