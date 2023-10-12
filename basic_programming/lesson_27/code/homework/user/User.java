package homework.user;

// k_l_b_1963@hotmail.com

/*
1) @ exists and only one -> @ только одна
2) dot after @  -> после @ должна быть среди символов как минимум одна точка
3) after last dot minimum 2 symbols -> после последней точки должно быть минимум 2 символа
4) alphabetic, digits, _ , - , . , @ -> разрешены буквы алфавита, цифры и некоторые символы
 */

public class User {
    // поля класса
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid.");
        }
    }

    public boolean validateEmail(String email) {
        // k_l_b_1963@hotmail.com
        int indexAt = email.indexOf('@'); // ищем индекс @
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) { // проверяем наличие @ и что она только одна
            return false; // тогда вернем false
        }
        if (email.indexOf('.', indexAt) == -1) { // не нашлась точка, начиная с позиции @
            return false;
        }
        if (email.indexOf('.') >= email.length() - 2) { // более 1-го символа после точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password not valid");
        }
    }

    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */
    public boolean validatePassword(String password) {
        //TODO
        String symbols = "!@#$%^&*()_+"; // строка специальных символов

        boolean[] test = new boolean[5]; // заводим массив типа boolean
        if (password.length() >= 8) {
            test[0] = true;
        }
        for (int i = 0; i < password.length(); i++) { // выбираем из строки password символы по одному
            char с = password.charAt(i); // это текущий символ в строке password

            if (Character.isUpperCase(с)) { // проверка
                test[1] = true;
            }
            if (Character.isLowerCase(с)) { // проверка
                test[2] = true;
            }
            if(Character.isDigit(с)){ // проверка
                test[3] = true;
            }
            if(symbols.indexOf(с) >= 0){ // если не найдется такой символ, то получим -1, поэтому проверяем, что >= 0
                test[4] = true;
            }
        }
        return test[0]&&test[1]&&test[2]&&test[3]&&test[4];
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

}
