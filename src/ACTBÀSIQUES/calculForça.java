package ACTBÀSIQUES;

import java.util.Scanner;

public class calculForça {

    public static void  main (String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("m");
        float m = input.nextFloat();

        System.out.print("a");
        float a = input.nextFloat();

        float força = (a * m);
        System.out.println( "La força és de " + força+ " N");
    }
}

