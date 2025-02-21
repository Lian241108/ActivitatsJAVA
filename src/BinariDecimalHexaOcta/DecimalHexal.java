package BinariDecimalHexaOcta;

import java.util.Scanner;

public class DecimalHexal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print(" Num decimal: ");
        int ND = input.nextInt();
        int nd = ND;
        String nh = "";

        while(nd!=0){
            int r = nd % 16;
            nd = nd / 16;
            nh = numerosaLLetres(r) + nh;
        }
        System.out.printf("Decimal number %d is hexadecimal number %s.", ND, nh);
    }

    public static String numerosaLLetres(int n){
        if(n<10){
            return String.valueOf(n);
        }
        else if(n==10){
            return "A";
        }
        else if(n==11){
            return "B";
        }
        else if(n==12){
            return "C";
        }
        else if(n==13){
            return "D";
        }
        else if(n==14){
            return "E";
        }
        else {
            return "F";
        }
    }
}
