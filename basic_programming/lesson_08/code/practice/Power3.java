package practice;
// Возведите 3 в степень 10, выведите все промежуточные результаты.
public class Power3 {
    public static void main(String[] args) {

        int count = 1;
        int res = 1;

        while (count <= 10) {
            res = 3 * res; // возведение в степень
            System.out.println(res + " 3 in power " + count);
            count++;
        }
    }
}
