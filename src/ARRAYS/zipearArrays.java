package ARRAYS;

public class zipearArrays {

    public static void main(String[] args) {
        int [] a = {1,5,34,534,5,34,53};
        int [] b = {4,2,84,434,9,24,63};
        RetusrnArray.printArray(zipearArrays(a,b));
    }

    public static int[] zipearArrays(int[] a, int[] b){

        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[2*i] = a[i];
            c[2*i+1] = b[i];

    }
    return c;
    }
}
