package homework.cube;

public class Cube {
    int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int perimeter(int a) {
        return 12 * a;
    }

    public int square(int a) {
        return 6 * a * a;
    }

    public int volume(int a) {
        return a * a * a;
    }

}
