package RECURSIVA;

public class Div2N {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.printf("%d / %d és %d.",10,3, divideix(10, 3));
    }

    public static int divideix(int A, int B) {
        if (A < B) {
            return 0;
        }
        return 1 + divideix( A - B, B);
    }
}
