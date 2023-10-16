Русский текст смотри ниже


1. Comparing objects using "==" is incorrect, because "==" formally compares references, i.e.
    object addresses. To compare objects, the Object class defines the equals method. If we want
    in order for objects of our class to be compared with each other according to the fields we need, then we need override the equals method in our class, specifying in it the logic for comparing the given object with to others.
2. Objects of the String class created using double quotes are strings
    constants. This means that when we specify a string with the same content each time in
    double quotes, a new object is not created. We get a reference to the same object.
3. All fields and methods marked as static are accessible by class name, and are the same for
    all objects of this class.
4. A field marked as final cannot be changed after the object is created. Therefore it should
    be initialized in the constructor when an object is created.

<br/>

1. Сравнивать объекты через "==" некорректно, т. к. "==" сравнивает формально ссылки, т. е. 
   адреса объектов. Для сравнения объектов в классе Object определен метод equals. Если хотим, 
   чтобы объекты нашего класса сравнивались между собой по нужным нам полям, то надо 
   переопределить метод equals в нашем классе, указав в нем логику сравнения заданного объекта с 
   другим.
2. Объекты класса String создаваемые при помощи двойных кавычек, являются стринговыми 
   константами. Это означает, что когда мы каждый раз указываем стринг с одинаковым содержимым в 
   двойных кавычках, то новый объект не создается. Мы получаем ссылку на один и тот же объект.
3. Все поля и методы помеченные как static доступны по имени класса, и являются одинаковыми для 
   всех объектов данного класса. 
4. Поле помеченное как final, невозможно изменить после создания объекта. Поэтому оно должно 
   быть инициализировано в конструкторе, при создании объекта.