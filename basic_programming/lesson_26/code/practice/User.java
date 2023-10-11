package practice;

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

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        if(validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid.");
        }
    }

    private boolean validateEmail(String email){
        // k_l_b_1963@hotmail.com
        int indexAt = email.indexOf('@'); // ищем индекс @ (index = 10)
        if( indexAt == -1 || indexAt != email.lastIndexOf('@')) { // проверяем наличие @ и что она только одна
            return false; // тогда вернем false
        }
        if(email.indexOf('.', indexAt) == -1) { // не нашлась точка, начиная с позиции @
            return false;
        }
        if(email.indexOf('.') >= email.length() - 2){ // более 1-го символа после точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
            char c = email.charAt(i);
            if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }


}
