package consultation.user.model;

import java.time.LocalDate;

public class UserAppl {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        User user = new User("email", "password", "FirstName", "SecondName", 1, now.minusYears(30));

        //  int hashCode1 = obj1.hashCode();
        int hashCode = user.hashCode();
        System.out.println("Hash code of id:  " + hashCode);
    }

}
