package practice.employee_save_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

public class RestoreEmployeeAppl {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./dest/employees.dat"))) {
            // deserializing from stream of bytes to object
            HashSet<Employee> employees = (HashSet<Employee>) ois.readObject(); // кастинг

            employees.forEach(System.out::println); // рапечатали

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
