# I/O streams in Java

The abstract class Writer contains methods designed to write one character to a stream. 
The FileWriter class extends the Writer class, and implements the methods of the parent class for writing a character to a file.

The abstract class Reader contains methods designed to read a single character from a stream. The FileReader class extends the Reader class, and implements the parent class's methods for reading a character from a file.

The BufferedReader and PrintWriter classes allow you to buffer the reading and writing of characters from/to a stream. That is, they contain methods designed to read/write a group of characters (String) at once.

System.in is an object of type InputStream associated with the console as a source. An object created as new BufferedReader(new InputStreamReader(System.in) allows you to read lines from the console using the readLine method.

-----------------------------------------

# Потоки ввода-вывода в Java

Абстрактный класс Writer, содержит методы, предназначенные для записи одного символа в поток. Класс FileWriter расширяет класс Writer, и имплементирует методы родительского класса для записи символа в файл.

Абстрактный класс Reader, содержит методы, предназначенные для чтения одного символа из потока. Класс FileReader расширяет класс Reader, и имплементирует методы родительского класса для чтения символа из файла.

Класс BufferedReader и PrintWriter, позволяют буфферизировать чтение и запись символов из/в поток. Т. е. содержат методы, предназначенные для чтения/записи сразу группы символов (String).

System.in - объект типа InputStream связанный с консолью как источником. Объект созданный как new BufferedReader(new InputStreamReader(System.in) позволяет считывать строки с консоли при помощи метода readLine.

