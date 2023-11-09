package homework;

import java.util.Arrays;

public class TwoGroups {
    public static void main(String[] args) {

        String[] group = {"st1", "st2", "st3", "st4", "st5", "st6", "st7", "st8", "st9", "st10", "st11"};
        int l1 = group.length / 2;
        int l2 = group.length - l1;
        System.out.println(l1 + ", " + l2);

        String[] gr1 = new String[l1];
        String[] gr2 = new String[l2];

        int a = 0;
        int b = 1;
        int m = 0;
        int n = 0;
        // int i = 0;

        for (int i = 0; i < group.length; i++) {
            int randomFactor = (int) (Math.random() * (b - a + 1) + a);
            if (randomFactor == 0 && m < l1) { // если 0 и есть место, то
                gr1[m] = group[i];
                m++;
            } else if (n < l2) { // если 1 и есть место, то заносим в другую группу
                gr2[n] = group[i];
                n++;
            } else if (m < l1) { // отправляем в ту группу, где еще есть место
                gr1[m] = group[i];
                m++;
            } else { // иначе - в другую
                gr2[n] = group[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(gr1));
        System.out.println("------------------");
        System.out.println(Arrays.toString(gr2));
    }
}