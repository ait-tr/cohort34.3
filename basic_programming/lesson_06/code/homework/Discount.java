package homework;
// Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B.
// Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

public class Discount {
    public static void main(String[] args) {
        double priceA = 24.99; // стоимость
        double priceB = 39.90; // стоимость

        int num1 = 1; // кол-во
        int num2 = 1; // кол-во

//        double dis1 = 0.05; // скидка
//        double dis2 = 0.03; // скидка

        int dis1 = 5; // скидка
        int dis2 = 3; // скидка

        double sum = totalCost( priceA * num1 * dis1 / 100,priceB * num2 * dis2 /100);
        double discount = 0;

        if(sum > 100) {
            discount = sum * 0.05;
            sum = sum - discount;
        }

        System.out.println("Total cost is: " + sum);
        System.out.println("Discount is: " + discount);

    }

    public static double totalCost(double a, double b){
        return a + b;
    }
}
