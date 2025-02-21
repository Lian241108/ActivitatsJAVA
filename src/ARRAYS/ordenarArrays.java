package ARRAYS;

public class ordenarArrays {

    public static void main(String[] args) {

        //Definició
        int[] a = {1, 4, 2, 3, 5,};

        RetusrnArray.printArray(a);

    }

    public static void sortArray(int[] a) {
        boolean ordenat = false;
        while (!ordenat) {
            ordenat = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > a[i + 1]) {

                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    ordenat = false;
                }
            }
        }
    }
}
