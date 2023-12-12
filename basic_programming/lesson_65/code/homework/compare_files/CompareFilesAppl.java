package homework.compare_files;

//В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
//Имена файлов принимать через массив args. Два файла считаем одинаковыми,
//если у них одинаковая длина, и на тех же позициях стоят те же байты.
//Результат должен быть выведен на консоль в виде сообщения.

import java.io.*;

public class CompareFilesAppl {
    public static void main(String[] args) {
        // проверяем, что в командной строке два аргумента (пути и имена файлов через пробел)
        if (args.length != 2) {
            System.out.println("Wrong number of arguments.");
            return;
        }
        System.out.println("file 1: " + args[0]);
        System.out.println("file 2: " + args[1]);
        // надо открыть два потока, считывать из них байты и сравнивать
        FileInputStream fin1 = null;
        FileInputStream fin2 = null;
        try {
            fin1 = new FileInputStream((args[0]));
            fin2 = new FileInputStream(args[1]);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int l1 = 0;
        int l2 = 0;
        try {
            l1 = fin1.available();
            l2 = fin2.available();
            if(l1 != l2){
                System.out.println("Files are different by length.");
                return;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            int byte1 = fin1.read();
            int byte2 = fin2.read();
            while (byte1 != -1 && byte2 != -1) {
                byte1 = fin1.read();
                byte2 = fin2.read();
                if (byte1 != byte2) {
                    break;
                }
            }
            if (byte1 == byte2) {
                System.out.println("Files are the same.");
            } else {
                System.out.println("Files are the different.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Рецепты от ChatGPT:
        try {
            // Открываем первый файл на чтение
            FileInputStream fis1 = new FileInputStream(args[0]);
            // Открываем второй файл на чтение
            FileInputStream fis2 = new FileInputStream(args[1]);
            // Теперь можно использовать fis1 и fis2 для чтения данных из файлов
            // Например, можно читать данные из файлов с помощью методов read()
            int b1 = fis1.read();
            int b2 = fis2.read();

            // сравнить в цикле b1 и b2

            // Не забудьте закрыть потоки после использования
            fis1.close();
            fis2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Используем try-with-resources для автоматического закрытия потоков
        try (
                // Открываем первый файл на чтение
                FileInputStream fis1 = new FileInputStream(args[0]);
                // Открываем второй файл на чтение
                FileInputStream fis2 = new FileInputStream(args[1]);
        ) {
            // Теперь можно использовать fis1 и fis2 для чтения данных из файлов
            // Например, можно читать данные из файлов с помощью методов read()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
