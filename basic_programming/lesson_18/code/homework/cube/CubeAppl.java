package homework.cube;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(10);
        Cube cube2 = new Cube(20);
        Cube cube3 = new Cube(100);

        System.out.println(cube1.perimeter(cube1.a));
        System.out.println(cube2.perimeter(cube2.a));
        System.out.println(cube3.perimeter(cube3.a));
        System.out.println("------------------------");
        System.out.println(cube1.square(cube1.a));
        System.out.println(cube2.square(cube2.a));
        System.out.println(cube3.square(cube3.a));
        System.out.println("------------------------");
        System.out.println(cube1.volume(cube1.a));
        System.out.println(cube2.volume(cube2.a));
        System.out.println(cube3.volume(cube3.a));

    }
}
