package ARRAYS;

public class Màxnumdelarray {
    public static void main(String[] args) {
        //Definició i creació
        int[] a = {3,8,2,10,25};

        System.out.printf ("El núm màx és %d \n",numMax(a) );
    }

    public static int numMax(int[] array) {
        int numMax = 0; //
        for (int i = 1; i < array.length; i++) {
            if (i > numMax) {
                numMax = i;
            }
        }
        return numMax;
    }
}
