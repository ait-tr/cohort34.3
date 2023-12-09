package homework;
// Написать программу, определяющую, является ли год високосным.
// Для того чтобы год был високосным, он должен:
// делится без остатка на 4 и, либо не должен делится без остатка на 100,
// либо если он делится на 100, то он должен делится также на 400.
// Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.

public class LeapYear {
    public static void main(String[] args) {

        int year = 1700;

        if( year % 4 == 0 ){
            System.out.println("This is leap year.");
        } else {
            System.out.println("This is NOT leap year.");
        }

    }

}
