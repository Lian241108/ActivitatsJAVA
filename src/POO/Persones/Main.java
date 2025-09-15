package POO.Persones;

public class Main {
    public static void main(String[] args) {
        Alumne a1, a2;
        a1 = new Alumne("Pere",15,Persones.SEXE.HOME,1,'A');
        a2 = new Alumne("Julieta",16,Persones.SEXE.DONA,2,'B');

        a1.print();
        a2.print();

        Profe p1, p2;
        p1 = new Profe("Pere",58,Persones.SEXE.HOME,33,"Mates");
        p2 = new Profe("Julieta",56,Persones.SEXE.DONA,32,"Castellà");

        p1.print();
        p2.print();

        // Crea objectes Jugador fent ús del constructor(s)
        Jugador j1 = new Jugador("Ando", 16, Persones.SEXE.DONA, "RCE Manacor", 15, Jugador.POSICIO.DAVANTER);
        Jugador j2 = new Jugador("Lian", 16, Persones.SEXE.HOME, "Inter Manacor", 12, Jugador.POSICIO.MIG);
        Jugador j3 = new Jugador("Pozo", 16, Persones.SEXE.HOME, "Atlètic Manacor", Jugador.POSICIO.PORTER);

        // Utilitza el setter per modificar un atribut (numGols) del jugador
        j1.setNumGols(18);

        // Consulta amb un getter el valor d'un atribut (nomEquip) del jugador
        String nomEquip = j2.getNomEquip();
        System.out.printf("Equip del jugador 2: %s.\n", nomEquip);

        // Imprimeix la informació dels jugadors creats
        j1.imprimir();
        j2.imprimir();
        j3.imprimir();
    }

}
