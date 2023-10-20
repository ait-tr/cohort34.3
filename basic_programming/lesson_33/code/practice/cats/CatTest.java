package practice.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat[] cat; // создали массив

    @BeforeEach
    void setUp() {

        cat = new Cat[4];
        cat[0] =  new Cat(101, "Tishka", "brit", 5, 3.5);
        cat[1] =  new Cat(102, "Genny", "sfinks", 1, 1.2);
        cat[2] =  new Cat(103, "Murzik", "pers", 9, 5.0);
        cat[3] =  new Cat(104, "Motya", "maikun", 2, 8.5);
    }


    @Test
    void testCatSort(){
        System.out.println("===========Test Cat Sorting====================");
        printArray(cat); // печатаем массив как есть, не отсортирован
        Arrays.sort(cat); // выполнили сортировку
        System.out.println("===Sort by age ========");
        printArray(cat);
    }

    @Test
    void testCatSortComparator(){
        // второй способ сортировки
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName()); // сравнили по именам (поле name)
            }
        };
        printArray(cat); // печатаем массив как есть, не отсортирован
        Arrays.sort(cat, catComparator); // выполнили сортировку с помощью Comparator
        System.out.println("===Sort by name ========");
        printArray(cat);

    }

    @Test
    void testCatSortComparator2(){
        // второй способ сортировки
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge() ; // сравнили по возрасту
            }
        };
        printArray(cat); // печатаем массив как есть, не отсортирован
        Arrays.sort(cat, catComparator); // выполнили сортировку с помощью Comparator
        System.out.println("===Sort by name ========");
        printArray(cat);

    }



    public void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}