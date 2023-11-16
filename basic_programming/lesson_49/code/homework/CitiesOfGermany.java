package homework;

import java.util.LinkedList;

//Задача 1. В классе GermanyAppl (main) cоздать LinkedList,
// содержащий города - столицы земель Германии.
// Опробовать на нем методы, которые доступны для класса LinkedList.
// Добавить Гамбург в середину списка, в начало списка.
//
// Решение Каролины Жабо

public class CitiesOfGermany {
    public static void main(String[] args) {
        // Создаем LinkedList
        LinkedList<String> gCities = new LinkedList<>();

        // Добавляем города - столицы земель Германии
        gCities.add("Мюнхен"); // Бавария
        gCities.add("Штутгарт"); // Баден-Вюртемберг
        gCities.add("Дюссельдорф"); // Северный Рейн-Вестфалия
        gCities.add("Ганновер"); // Нижняя Саксония
        gCities.add("Потсдам"); // Бранденбург
        gCities.add("Киль"); // Шлезвиг-Гольштейн
        gCities.add("Висбаден"); // Гессен
        gCities.add("Дрезден"); // Саксония
        gCities.add("Шверин"); // Мекленбург-Передняя Померания
        gCities.add("Майнц"); // Рейнланд-Пфальц
        gCities.add("Эрфурт"); // Тюрингия
        gCities.add("Магдебург"); // Саксония-Анхальт
        gCities.add("Саарбрюккен"); // Заарланд
        gCities.add("Бремен"); // Бремен
        gCities.add("Берлин"); // Берлин


        System.out.println("Столицы земель Германии : ");
        System.out.println(gCities);
        // Добавить Гамбург в середину списка, в начало списка.
        gCities.add(5,"Гамбург");
        System.out.println("Столицы земель Германии  и свободный город Гамбург: ");
        System.out.println(gCities);
        System.out.println("------------------удалить Гамбург из списка-----------------------");
        //удалить Гамбург из списка
        gCities.remove(5);
        System.out.println(gCities);
        System.out.println("-------------------add First----------------------");
        gCities. addFirst("Гамбург");
        //System.out.println("Поставить город на 1ое место списка : " );
        System.out.println(gCities);
        System.out.println("-------------------remove city----------------------");
        gCities.removeFirst();
        System.out.println();
        System.out.println("-------------------add Last----------------------");
        gCities. addLast("Гамбург");
        System.out.println(gCities);
        System.out.println("-------------------clear List----------------------");
        gCities.clear();
        System.out.println(gCities);

    }
}
