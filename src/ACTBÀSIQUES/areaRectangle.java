package ACTBÀSIQUES;

import java.util.Scanner;

public class areaRectangle {
    public static void  main (String[] arg){

            Scanner input = new Scanner(System.in);
            System.out.print("Costat A");
            int a= input.nextInt();

            System.out.print("Costat B");
            int b = input.nextInt();

            double area = a * b;
System.out.println(area);
    }
}
