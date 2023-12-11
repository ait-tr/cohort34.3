package practice.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputAppl {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fin = new FileInputStream("./dest/data.txt");
        try {
//            System.out.println("Available: " + fin.available()); // выясняем сколько байт доступно для чтения
//            int a = fin.read(); // считали 1 байт
//            System.out.println(a); // напечатали
//            System.out.println("Available: " + fin.available()); // выясняем сколько байт доступно для чтения
//            // каждое чтение байта из файла перемещает "внутренний курсор" на 1 позицию
//            a = fin.read();
//            System.out.println(a);
//            System.out.println("Available: " + fin.available()); // выясняем сколько байт доступно для чтения

            // Как считать все из файла
            // Option 1
//            int a = fin.read();
//            while(a != -1){
//                System.out.println(a);
//                a = fin.read(); // 257 - 256 = 1 получаем на выходе
//            }

            // Option 2
            //int length = fin.available(); // сколько байт доступно для чтения
//            for (int i = 0; i < length; i++) {
//                int a = fin.read();
//                System.out.println(a);
//            }

            // Option 3
            int length = fin.available(); // сколько байт доступно для чтения
            byte[] arr = new byte[length];
            fin.read(arr);
            for (byte b : arr) {
                System.out.println(b);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
