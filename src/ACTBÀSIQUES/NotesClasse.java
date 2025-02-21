package ACTBÀSIQUES;

import java.util.Scanner;

public class NotesClasse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota = input.nextInt();
        if (nota >= 0 && nota < 5) {
            System.out.println("suspès");
        } else if (nota >= 5 && nota < 6) {
                System.out.println("suficient");
        } else if (nota >= 6 && nota < 7) {
                    System.out.println("Bé");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("excel..");
        } else if(nota <0 && nota > 10);
        System.out.println("No va bé aquest nota");
        }
    }

