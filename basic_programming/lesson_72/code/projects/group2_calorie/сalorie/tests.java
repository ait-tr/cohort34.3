package projects.group2_calorie.сalorie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import projects.group2_calorie.сalorie.dao.Calorie;
import projects.group2_calorie.сalorie.dao.CalorieImpl;
import projects.group2_calorie.сalorie.model.CalorieEntry;
import projects.group2_calorie.сalorie.model.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalorieImplTest {
    CalorieImpl calorie; // Объявляем переменную для тестирования

    @BeforeEach
    void setUp() {
        calorie = new CalorieImpl(); // Создаем новый экземпляр CalorieImpl перед каждым тестом
    }

    @Test
    void addEntry() {
        // Подготовка
        CalorieImpl calorie = new CalorieImpl(); // Создаем экземпляр CalorieImpl для теста
        LocalDateTime now = LocalDateTime.now(); // Получаем текущую дату и время
        List<Product> products = new ArrayList<>(); // Создаем список продуктов
        Product apple = new Product("Apple", 50); // Создаем продукт "Apple" с калориями 50
        products.add(apple); // Добавляем продукт в список
        System.out.println(apple); // Выводим информацию о продукте в консоль

        // Вызов метода
        calorie.addEntry(now, products); // Добавляем запись о приеме пищи в CalorieImpl

        // Проверка результата
        assertFalse(calorie.getEntries().isEmpty(), "The list of entries should not be empty");
        assertEquals(1, calorie.getEntries().size(), "There should be one entry in the list");

        CalorieEntry entry = calorie.getEntries().get(0); // Получаем первую запись
        assertNotNull(entry, "The entry should not be null");
        assertEquals(now, entry.getDateTime(), "The entry should have the correct date and time");
        assertEquals(products, entry.getProducts(), "The entry should have the correct list of products");

        // Добавим вывод для наглядности
        System.out.println("Test addEntry passed successfully!");
    }

    @Test
    void getEntries() {
        Calorie calorie = new CalorieImpl(); // Создаем экземпляр Calorie для теста
        List<CalorieEntry> entries = calorie.getEntries(); // Получаем список записей

        assertNotNull(entries); // Проверяем, что список записей не является null
        assertTrue(entries.isEmpty()); // Проверяем, что список записей пуст

        calorie.addEntry(LocalDateTime.now(), List.of(new Product("Apple", 50))); // Добавляем запись в Calorie

        entries = calorie.getEntries(); // Получаем обновленный список записей

        assertFalse(entries.isEmpty()); // Проверяем, что список записей не пуст
        assertEquals(1, entries.size()); // Проверяем, что в списке одна запись
    }

    @Test
    void readProductsFromCSV() {
        Calorie calorie = new CalorieImpl(); // Создаем экземпляр Calorie для теста
        List<Product> products = calorie.readProductsFromCSV(); // Читаем продукты из CSV файла

        assertNotNull(products); // Проверяем, что список продуктов не является null
        assertFalse(products.isEmpty()); // Проверяем, что список продуктов не пуст
        // Дополнительные проверки, если необходимо
    }

    @Test
    void saveAndLoadFood() {
        Calorie calorie = new CalorieImpl(); // Создаем экземпляр Calorie для теста
        List<Product> products = List.of(
                new Product("Apple", 100),
                new Product("Banana", 150)
        ); // Создаем список продуктов

        calorie.addEntry(LocalDateTime.now(), products); // Добавляем запись о приеме пищи
        calorie.saveFood(products); // Сохраняем продукты в файл

        List<Product> loadedProducts = calorie.loadFood(); // Загружаем продукты из файла

        assertIterableEquals(products, loadedProducts); // Проверяем, что загруженные продукты совпадают с ожидаемыми
    }

    @Test
    void addProduct() {
        // Создаем экземпляр Calorie
        Calorie calorie = new CalorieImpl();

        // Создаем список библиотечных продуктов
        List<Product> libraryFood = List.of(
                new Product("Apple", 50),
                new Product("Banana", 80)
        );

        // Создаем список пользовательских продуктов (делаем его изменяемым)
        List<Product> userProducts = new ArrayList<>(
                List.of(new Product("Orange", 60))
        );

        // Добавляем продукт с использованием метода addProduct
        calorie.addProduct(libraryFood, userProducts, "Apple", 100, LocalDateTime.now());

        // Получаем список продуктов после добавления
        List<CalorieEntry> entries = calorie.getEntries();
        assertNotNull(entries);
        assertFalse(entries.isEmpty());

        // Проверяем, что продукт был успешно добавлен
        assertEquals(1, entries.size());
        assertEquals(2, entries.get(0).getProducts().size()); // Проверяем, что теперь в записи два продукта
        assertEquals("Apple", entries.get(0).getProducts().get(1).getName());
    }
}