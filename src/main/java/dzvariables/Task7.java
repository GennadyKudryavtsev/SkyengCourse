package dzvariables;

public class Task7 {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}
