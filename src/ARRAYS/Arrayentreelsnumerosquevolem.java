package ARRAYS;

import java.util.Scanner;

public class Arrayentreelsnumerosquevolem {

    public static void main(String[] args) {

        int [] nums;

        Scanner input = new Scanner(System.in);
        System.out.print("a:");
        int a = input.nextInt();

        System.out.print("b:");
        int b = input.nextInt();

        // Instalació / construcció
        nums= new int [b-a+1];

        // Instalació / construcció
        for (int i=0; i<nums.length; i++){
            System.out.printf("%d.\n", nums[i]);
        }
    }
}
