package ARRAYS;

public class NumParellsArrayFuncio {
    public static void main(String[] args){

        int[] num = {3, 5, 2, 8, 9, 3, 4};
        System.out.printf("L'array té %d números parells.", numParellsArray(num));

    }

    public static int numParellsArray(int[] a){
        int n = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                n++;
            }
        }
        return n;
    }
}
