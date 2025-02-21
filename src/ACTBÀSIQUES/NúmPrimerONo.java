package ACTBÀSIQUES;

import java.util.Scanner;

public class NúmPrimerONo {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.print("Número: ");

        int n= input.nextInt();

       int t = n -1;

       while (t >= 1 ) {
           if ( n % t == 0) {break;}
           t = n-1;
       }
        if (t== 1) {
            System.out.printf(" %d és primer", n);
        } else {
            System.out.printf(" &d no és primer");
        }

    }
}