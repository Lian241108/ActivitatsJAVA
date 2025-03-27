package POO.Profes;

public class MainProfes {
    public static void main(String[] args) {
        //Declaració
        Profes p1, p2, p3;

        //Cridades als constructors
        p1 = new Profes("Manel", 35, Profes.DEPARTAMENT.FISICA);
        p2 = new Profes("Xesca", 22, Profes.DEPARTAMENT.ANGLES);
        p3 = new Profes("Biel", Profes.DEPARTAMENT.MATES);

        //Setters (mutadors)
        p3.setAnys(15);
        p1.setNom("Marc");

        //Getters
        int sumaAnys = p1.getAnys() + p2.getAnys() + p3.getAnys();
        System.out.printf("SUMA ANYS: %d.\n", sumaAnys);

        //ALTRES
        p1.print();
        p2.print();
        p3.print();
    }
}
