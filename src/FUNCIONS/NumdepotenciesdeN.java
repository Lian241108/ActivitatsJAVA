package FUNCIONS;

import ARRAYS.RetusrnArray;

import java.util.Scanner;

public class NumdepotenciesdeN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();

        input = new Scanner(System.in);
        System.out.print("b: ");
        int b = input.nextInt();

        RetusrnArray.printArray(arrayPotencies(n,b));


    }
    public static int[] arrayPotencies(int n, int b) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(b, i + 1);
        }
        return array;
    }
}
