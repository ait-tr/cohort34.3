package homework.nod;

public class NodAppl {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        Nod nod = new Nod();
        System.out.println(nod.nod(a, b));

    }
}
