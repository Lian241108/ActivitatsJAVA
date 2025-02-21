package ACTBÀSIQUES;

import java.util.Scanner;

public class MruaV {

    public static void  main (String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("v");
        float v = input.nextFloat();

        System.out.print("t ");
        float t = input.nextFloat();

        System.out.print("a ");
        float a = input.nextFloat();

        float velocitatfinal = v + ( a * t);
        System.out.println( "La V és de " + velocitatfinal+ " m/s");
    }
}
