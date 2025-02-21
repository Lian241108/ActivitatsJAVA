package ACTBÀSIQUES;

import java.util.Scanner;

public class MàxdedosNúm {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int a= input.nextInt( );
        int b= input.nextInt( );
        if (a > b ){
            System.out.println(a+" és el màx");
        }else{
            System.out.println( b+" és el màx");
        }
    }
}
