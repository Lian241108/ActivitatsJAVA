package ACTBÀSIQUES;

import java.util.Scanner;

public class perimetreRectangle {

    public static void  main (String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("Costat A");
        int a= input.nextInt();

        System.out.print("Costat B");
        int b = input.nextInt();

        double perimetre = (a * 2) + (2 * b);
        System.out.println(perimetre);
    }



}




