package ARRAYS;

public class RetusrnArray {
    public static void main(String[] args) {

        int[] nums;


        int[] a = {1,3,5,6};
        int[] trosA = miniArray(a, 0,3);
        printArray(trosA);

    }

    public static int[] numsArray(int a, int b) {

        int[] array = new int[b - a + 1];  // Creació de l'array
        // emplenar amb valors enbtre a i b

        for (int i = 0; i < array.length; i++) {
            array[i] = a + 1;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d.", i, array[i]);
        }
    }

    public static int[] copiaArray(int[] array) {

        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia [i] = array[i];
        }
        return copia;
    }

    public static int[] miniArray(int[] array, int a, int b) {

        int[] copia = new int[b-a+1];
        for (int i=a; i <= b; i++) {
            copia [i-a] = array[i];
        }
        return copia;
    }
}


