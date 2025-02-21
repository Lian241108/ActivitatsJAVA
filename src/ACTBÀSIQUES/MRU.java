package ACTBÀSIQUES;

import java.util.Scanner;

public class MRU {


    public static void  main (String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("x");
        float x = input.nextFloat();

        System.out.print("v");
        float v = input.nextFloat();

        System.out.print("t ");
        float t = input.nextFloat();

        float posició = x+ (v*t);
        System.out.println( "La seva posició és de " + posició+ " m");
    }
}
