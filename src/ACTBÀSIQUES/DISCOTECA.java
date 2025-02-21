package ACTBÀSIQUES;

import java.util.Scanner;

public class DISCOTECA {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int a= input.nextInt( );
        if (a < 18 ){
            System.out.println("No pots entrar");
        }else{
            System.out.println( "Pots entrar.");
        }
    }
}
