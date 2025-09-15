package POO.Geometria;

public class Main2D {
    public static void main(String[] args) {
        //Declatració
        Punt2D p1, p2;

        //Instantació amb els constructors

        p1= new Punt2D("X", 100, 200);
        p2= new Punt2D( 100, 300);

        //setter
        p2.setNom("Y");

        //Altres
        double d= p1.distancia(p2);
        System.out.printf("Distancia: %f.\n",d);

        p1.print();
        p2.print();
    }
}
