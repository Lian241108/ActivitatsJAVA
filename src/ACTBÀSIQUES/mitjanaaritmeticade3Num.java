package ACTBÀSIQUES;

import java.util.Scanner;

public class mitjanaaritmeticade3Num {

    public static void  main (String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("Num A");
        float a= input.nextFloat();

        System.out.print("Num B");
        float b = input.nextFloat();

        System.out.print("Num C");
        float c = input.nextFloat();

        float mitjana = (a + b + c)/ 3f;
        System.out.println(mitjana);
    }
}

