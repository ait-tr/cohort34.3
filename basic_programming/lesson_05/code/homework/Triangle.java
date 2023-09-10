package homework;

public class Triangle {
    // некорректное с точки зрения математики решение
    public static void main(String[] args) {
        int a = 11;
        int h = 3;
        int s = sTriangle(a, h);
        System.out.println("S triangle = " + s);
    }

    public static int sTriangle(int a, int h){
        return a * h / 2;
    }
}
