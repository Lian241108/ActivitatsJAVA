package ARRAYS;

public class ExtendArraydeN {
    public static void main(String[] args) {

        //Definició
        int[] n = {1, 4, 8, 2, 7,};
        sortArray(n);
        RetusrnArray.printArray(n);
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