package RECURSIVA;

public class Multiplicació {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println(multiplicar(a,b));
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return multiplicar(a, b - 1) + a;
        }
    }

}
