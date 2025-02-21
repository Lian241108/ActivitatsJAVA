package BinariDecimalHexaOcta;

import java.util.Scanner;

public class DaH {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Binary number: ");
        int NB = input.nextInt();

        int nb = NB;
        int nd = 0;
        int pot = 1;

        while(nb!=0){
            int dx = nb % 10;
            nb = nb / 10;
            nd = dx*pot + nd;
            pot = 2 * pot;
        }
        System.out.printf("Binary number %d is decimal number %d.", NB, nd);
    }
}
