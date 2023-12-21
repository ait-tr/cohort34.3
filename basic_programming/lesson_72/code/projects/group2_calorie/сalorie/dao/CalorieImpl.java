package projects.group2_calorie.сalorie.dao;

import projects.group2_calorie.сalorie.model.CalorieEntry;
import projects.group2_calorie.сalorie.model.Product;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CalorieImpl implements Calorie {
    private List<CalorieEntry> entries;

    public CalorieImpl() {
        this.entries = new ArrayList<>();
    }

    @Override
    public void addEntry(LocalDateTime dateTime, List <Product> products) {
        entries.add(new CalorieEntry(dateTime, products));
    }

    @Override
    public List <CalorieEntry> getEntries() {
        return entries;
    }

    @Override
    public List<Product> readProductsFromCSV() {
        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Lesson71_CurrencyExchange/src/pracrice/сalorie/Product.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 2) {
                    String name = data[0].toUpperCase();
                    int calories = Integer.parseInt(data[1]);

                    productList.add(new Product(name, calories));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        productList.forEach(System.out::println); // todo убрать ???
        return productList;
    }

    @Override
    public void saveFood(List <Product> products) {
        String filePath = "Lesson71_CurrencyExchange/src/pracrice/сalorie/saved_food.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(entries);
            System.out.println("\nЕда сохранена.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> loadFood() {
        List<Product> loadedProducts = new ArrayList<>();
        String filePath = "Lesson71_CurrencyExchange/src/pracrice/сalorie/saved_food.txt"; // Укажите полный путь к файлу

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            entries = (List<CalorieEntry>) ois.readObject();
            for (CalorieEntry entry : entries) {
                loadedProducts.addAll(entry.getProducts());
            }
            System.out.println("\nЕда загружена.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading saved food. Please check your data.");
        }
        return loadedProducts;
    }

    @Override
    public void addProduct(List <Product> libraryFood, List <Product> userProducts, String food, int gram, LocalDateTime dateTime) {
        for (Product product: libraryFood) {
            if (food.equalsIgnoreCase(product.getName())) {
                int userGram = (product.getCalorie() * gram) / 100;
                userProducts.add(new Product(food, userGram));
                System.out.println("Product added successfully!");

                // Добавляем новую запись с датой и продуктами в список
                addEntry(LocalDateTime.now(), userProducts);
                return;
            }
        }
        System.out.println("Product not found in the library.");
    }

    @Override
    public boolean removeProduct(String product) {
        entries.forEach(entry -> {
            entry.getProducts().removeIf(product1 -> product1.getName().equalsIgnoreCase(product));
        });
        return true;
    }


    //  PrintWriter pw = new PrintWriter(new FileWriter(str, true)); // поставили флаг - добавление это true(позволяет дополнять, а не перезаписывать файл) / создаем поток символов в файл
    //        System.out.println("Type the text here ");
    //        str = br.readLine();
    //        while (!"stop".equalsIgnoreCase(str)){ // пока строка не равна STOP будем продолжать цикл
    //            pw.println(str);
    //            System.out.println("Type the text here ");
    //            str = br.readLine();
    //        }
    //        pw.flush();// отправление из буфера в поток => файл
    //        pw.close(); // закрываем файл
}
