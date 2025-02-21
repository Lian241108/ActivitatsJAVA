package ACTBÀSIQUES;

import java.util.Scanner;

public class TemporalRevers {


    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ºC: ");
        float c = input.nextFloat();

        float F = (5/9 * c) + 32;

        System.out.println("La temp en ºC és "+c);

    }

}


