Русский текст смотри ниже


1. A reference of a parent type can refer to an object of a child type. In this case Java itself
    will conduct upper casting. If you try to assign a link value to a child type link
    parent type, the compiler will require explicit down casting. Wherein,
    if a parent type reference points to another child object, then at runtime
    code, an error will occur. You can check type matching using the instanceof operator.
2. Comparing objects using "==" is incorrect, because "==" formally compares references, i.e.
    object addresses. To compare objects, the Object class defines the equals method. If we want
    in order for objects of our class to be compared with each other according to the fields we need, then we need override the equals method in our class, specifying in it the logic for comparing the given object with to others.

<br/>

1. Ссылка родительского типа может ссылаться на объект дочернего типа. В этом случае Java сама 
   проведет upper casting. Если попытаться ссылке дочернего типа присвоить значение ссылки 
   родительского типа, то компилятор потребует явно провести кастинг (down casting). При этом, 
   если ссылка родительского типа указывает на другой дочерний объект, то в процессе выполнения 
   кода, произойдет ошибка. Проверить соответствие типов, можно при помощи оператора instanceof.
2. Сравнивать объекты через "==" некорректно, т. к. "==" сравнивает формально ссылки, т. е. 
   адреса объектов. Для сравнения объектов в классе Object определен метод equals. Если хотим, 
   чтобы объекты нашего класса сравнивались между собой по нужным нам полям, то надо 
   переопределить метод equals в нашем классе, указав в нем логику сравнения заданного объекта с 
   другим.