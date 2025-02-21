package ARRAYS;

public class MitjananumArrays {

    public static void main(String[] args) {
        //Definició i creació
        int[] a = {3,8,2,10,25};
        int[] b = {3,8,2,10,25};
        int[] c = {3,8,2,10,25};


        System.out.printf ( "La suma de l'array A és %d", calculsuma(a));
        System.out.printf ( "La suma de l'array B és %d", calculsuma(b));
        System.out.printf ( "La suma de l'array C és %d", calculsuma(c));

        System.out.printf ( "La mitjana de l'array A és %f", calculmitjana(a));
        System.out.printf ( "La mitjana de l'array B és %f", calculmitjana(b));
        System.out.printf ( "La mitjana de l'array C és %f", calculmitjana(c));


    }

    public static int calculsuma(int[]array){
        int suma=0;
        for(int i=0; i<array.length; i++){
            suma=suma+array[i];
        }
        return suma;

    }

    public static double calculmitjana (int[] array){
        int suma = 0;
        int mitjana = 0;
        for(int i=0; i<array.length; i++){
            mitjana= suma / 2 ;
        }

        return calculsuma(array) / array.length;
    }
}
