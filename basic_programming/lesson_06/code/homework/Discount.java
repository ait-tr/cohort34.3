package homework;
// Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B.
// Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

public class Discount {
    public static void main(String[] args) {
        double priceA = 24.99;
        double priceB = 39.90;

        int num1 = 1;
        int num2 = 1;

        double sum = totalCost( priceA * num1,priceB * num2);
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
