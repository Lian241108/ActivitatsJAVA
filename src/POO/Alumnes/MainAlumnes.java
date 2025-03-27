package POO.Alumnes;

public class MainAlumnes {

    public static void main(String[] args) {

        Alumne a1, a2, a3; // Declaració

        //constructors
        a1 =new Alumne("Paco", 1, 'A');
        a2= new Alumne("Albert", 2, 'B');
        a3= new Alumne("Simon");

        //Setters
        a1.setGrup('F');
        a2.setCurs(4);
        a3.setNom("Jaume");
        a3.setCursGrup(2, 'B');

        //Getters
        System.out.printf("%s va a %d.\n", a2.getNom(), a2.getCurs());

        //Altres
        a1.print();
        a2.print();
        a3.print();
    }
}
