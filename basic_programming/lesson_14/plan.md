# Lesson plan No. 14 09/22/2023

1.Homework:
- method for finding the minimum element in an array
- method for searching the index of the minimum element
- reverse sorting from maximum to minimum

Here is another bubble sort algorithm:
        `public static void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                }
            }
        }`

- Let's check it out...
- How does he sort? (asc, des?)
- What happens in it?
- Does it match the dance?

2. Repeat for a week:
   see theory section

3. Practice:
- solving problems using the for loop

___________________________________________

# План занятия №14 22.09.2023

1. Homework:
- метод поиска минимального элемента в массиве
- метод поиска индекса минимального элемента
- обратная сортировка от максимального к минимальному

Вот еще один алгоритм "пузырьковой" сортировки:
        `public static void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                }
            }
        }`

- Давайте его проверим... + 
- Как он сортирует? - от меньшего к большему
- Что в нем происходит? - сравнение элементов попарно, 
- Соответствует ли он танцу? - 

2. Повторение за неделю:
см. раздел теория

3. Практика:
- решение задач на цикл for




