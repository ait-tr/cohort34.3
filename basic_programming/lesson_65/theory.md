# I/O streams in Java

A stream is a sequence of data.

An I/O stream represents an input source or an output destination.
A stream can represent many different kinds of sources and
directions, including disk files, devices, other programs and
memory arrays...

Streams support many different types of data, including simple
bytes, primitive data types and objects.

Input Stream - reads data from source, one element at a time.
Output Stream - writes data to destination, one element at a time.

The abstract class OutputStream contains the abstract method abstract void write(int b),
designed to write one byte to a stream.
The FileOutputStream class extends the OutputStream class, and implements the write method to write a byte to a file.

Abstract class InpuStream, contains the abstract method abstract int read(),
designed to read one byte from a stream.
The FileInputStream class extends the InputStream class, and implements the read method to read a byte from a file.
If the read method returns -1, it means that all data from the stream has been read.


-----------------------------------------
# Потоки ввода-вывода в Java

Поток - это последовательность данных.

Поток ввода/вывода представляет источник ввода или пункт назначения вывода.
Поток может представлять множество различных видов источников и
направления, включая файлы дисков, устройства, другие программы и
массивы памяти..

Потоки поддерживают множество различных видов данных, в том числе простые
байты, примитивные типы данных и объекты.

Input Stream - читает данные из source, один элемент за один раз.
Output Stream - записывает данные в destination, один элемент за один раз.

Абстрактный класс OutputStream, содержит абстрактный метод abstract void write(int b), 
предназначенный для записи одного байта в поток. 
Класс FileOutputStream расширяет класс OutputStream, и имплементирует метод write для записи байта в файл.

Абстрактный класс InpuStream, содержит абстрактный метод abstract int read(), 
предназначенный для чтения одного байта из потока. 
Класс FileInputStream расширяет класс InputStream, и имплементирует метод read для чтения байта из файла. 
Если метод read возвращает -1, это означает, что все данные из потока считаны.

