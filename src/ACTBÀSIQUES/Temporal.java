package ACTBÀSIQUES;

import java.util.Scanner;
public class Temporal {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ºF: ");
        float f = input.nextFloat();

        float c = 5/9f * (f-32);

        System.out.println("La temp en ºF és "+f);

    }

}
