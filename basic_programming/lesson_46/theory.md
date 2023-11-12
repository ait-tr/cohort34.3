# ArrayList details
In a regular array (Array), we **cannot change the size**; it is set when the array is created.
The ArrayList structure from JCF is dynamically sized, it expands automatically as more are added
elements into it. When creating your own list based on ArrayList, the size is not specified.

## Question: Is ArrayList a dynamic array?
ArrayList - implemented on the basis of the standard Array.
ArrayList creates a new array on the fly rather than changing the size of the old one,
and transfers the contents of the old array into it.
The size of the array increases by 1.5 times each time a list element is added.
**The size of an in-memory array cannot be changed on the fly in any programming language.**

## Question: why is ArrayList better than just Array?
- Adding and removing elements is easier in ArrayList, no need to think about the size of the array
- Searching, checking an element for presence is easier, we use the built-in contains() method
- Sorting for ArrayList is implemented using standard methods in Collections; for Array you have to write it yourself
- ...

## Question: is there an ArrayList of two or more dimensions?
The answer is, roughly speaking, no, they don’t do that.
In theory we can build an ArrayList<ArrayList1>.
In practice, for tasks with multidimensional arrays it is better to use the standard Array[][].

## ArrayList - direct filling with the asList method
ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Peter","Vladimir","Stepan"));
System.out.println(namesList);

_______________________________________________________________

# ArrayList подробно
В обычном массиве (Array) мы **не можем изменить размер**, он задается при создании массива.
Структура ArrayList из JCF имеет динамический размер, она расширяется автоматически по мере добавления 
в него элементов. При создании собственного списка на базе ArrayList размер не указывается. 

## Вопрос: ArrayList - это динамический массив?
ArrayList - реализован на базе стандартного Array.
ArrayList "на лету" создает новый массив, а не меняет размер старого,
и переносит в него содержимое старого массива.
Размер массива при каждом добавлении элемента списка увеличивается в 1,5 раза.
**Размер находящегося в памяти массива ни в одном языке программирования "на лету" изменить нельзя.**

## Вопрос: чем ArrayList лучше, чем просто Array?
- Добавление и удаление элементов легче в ArrayList - не надо думать о размере массива
- Поиск, проверка элемента на наличие легче - используем встроенный метод contains()
- Сортировка для ArrayList реализована стандартными методами в Collections, для Array надо писать самим
- ...

## Вопрос: бывает ли ArrayList двух и более мерным?
Ответ - грубо говоря, нет, так не делают. 
В теории мы можем построить ArrayList<ArrayList1>.
На практике для задач с многомерными массивами лучше использовать стандартный Array[][].

## ArrayList - прямое заполнение методом asList
ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Peter","Vladimir","Stepan"));
System.out.println(namesList);