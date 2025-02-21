package ARRAYS;

public class ArrsysSuma {

    public static void main(String[] args) {
        //Definició i creació
        int[] a = {3,8,2,10,25};
        int[] b = {4,1,9,1,24};
        int[] c = {6,7,4,2,20};


        System.out.printf ( "La suma de l'array A és %d", calculsuma(a));
        System.out.printf ( "La suma de l'array B és %d", calculsuma(b));
        System.out.printf ( "La suma de l'array C és %d", calculsuma(c));

    }

    public static int calculsuma(int[]array){
        int suma=0;
        for(int i=0; i<array.length; i++){
            suma=suma+array[i];
        }
        return suma;

    }
}
