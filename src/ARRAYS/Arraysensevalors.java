package ARRAYS;

import java.util.Scanner;

public class Arraysensevalors {

    public static void main(String[] args) {
        double [] nums;
        Scanner input = new Scanner(System.in);
        System.out.print("Num Caselles:");
        int n = input.nextInt();
        // Instalació / construcció
        nums= new double[n];
        // Emplenar amb numeros aleatoris entre 10 i 30

        for ( int i=0; i<nums.length; i++){
            nums[i] = 10+ Math.random()*20;
        }
        //imprimir contingut de l'array

        for ( int i=0; i<nums.length; i++){

            System.out.printf("%f.\n", nums[i]);
        }
    }
}
