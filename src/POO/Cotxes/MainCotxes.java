package POO.Cotxes;

import POO.Alumnes.Alumne;

public class MainCotxes {
    public static void main(String[] args) {

        Cotxes c1, c2, c3; // Declaració

        //constructors
        c1 =new Cotxes("ferrari",23423,23,4);
        c2= new Cotxes( "mercedes", 46456,45,4);
        c3= new Cotxes("Aston Martin");

        //Setters
        c1.setMarca("lambo");
        c2.setMatricula(44452);
        c3.setVelocitat(56);
        c3.setNumPortes(4);

        //Getters
        System.out.printf("%s de matricula %d.\n", c2.getMarca(), c2.getMatricula());

        //Altres
        c1.print();
        c2.print();
        c3.print();
        c2.accelerar(34);
    }
}
