package FUNCIONS;

import java.util.Scanner;

public class MCM {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print(" A:");
        int a = input.nextInt();

        System.out.print("B:");
        int b = input.nextInt();

        int m =  maxim(a, b);
        while(m%a!=0 || m%b!=0){
            m++;
        }

        System.out.printf("MCM de %d i %d és %d.", a, b, m);

    }

    public static int maxim(int a, int b){
        return (a>b) ? a : b;
    }
}
