package FUNCIONS;

import java.util.Scanner;

public class CelsiusAFarenheintAmbFunció {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ºF: ");
        float f = input.nextFloat();
        System.out.println("La temp en ºF és "+celsiusafarenheint(f));
    }

    public static double celsiusafarenheint (double f){
        return 5/9f * (f-32);
    }

    }
