package BinariDecimalHexaOcta;

import java.util.Scanner;

public class BinariHexa {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Num Binari: ");
        int ND = input.nextInt();

        int nb = ND;   //Valor num decimal que guardarem
        int nd = 0;   //valor num decimal que usarem per fer calcúl
        int pot = 1;  // valor potència

        while(nb!=0){
            int dx = nb % 10;   //r= darrer num
            nb = nb / 10;   //agafam darrera xifra
            nd = dx*pot + nd;
            pot = 2 * pot;   // augmentam el valor de la potencia
        }
        System.out.printf("Num binari %d és  %d en decimal.", ND, nd);

        String nh = "";  //num hexadecimal

        while(nd!=0){
            int dx = nd % 16;  // darrera xifra
            nd = nd / 16;
            nh = numerosaLLetres(dx) + nh;
        }
        System.out.printf("El numero hexadecimal del decimal és: %s.", nh);
    }

    public static String numerosaLLetres(int n) {
        if (n < 10) {
            return String.valueOf(n);
        } else if (n == 10) {
            return "A";
        } else if (n == 11) {
            return "B";
        } else if (n == 12) {
            return "C";
        } else if (n == 13) {
            return "D";
        } else if (n == 14) {
            return "E";
        } else {
            return "F";
        }
        // substitució dels valors majors de 10
    }
}
