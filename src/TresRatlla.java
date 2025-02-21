import java.util.Scanner;

public class TresRatlla {


    public enum VALOR {BUIDA, CERCLE, CREU}

    ;
    public static VALOR[][] tauler;

    public enum RESULTAT {ENJOC, EMPAT, GUANYADOR_A, GUANYADOR_B}

    ; //{Posar amb majuscules obligatori}
    public static RESULTAT resultat;

    public enum TORN {JUGADOR_A, JUGADOR_B}

    ;
    public static TORN torn;
    //enum: son els unics valor que podrem usar

    public static int numTirades;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        inicialitzaPartida();
        mostrarTauler(tauler);

        while (!partidaAcabada()) {
            ferTirada(input, torn, tauler);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviarTorn(torn);
        }

        mostrarResultat(resultat);

    }

    public static void inicialitzaPartida() {
        tauler = new VALOR[3][3];
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                tauler[i][j] = VALOR.BUIDA;

            }
        }
        numTirades = 0;
        torn = TORN.JUGADOR_A;
        resultat = RESULTAT.ENJOC;


    }

    public static void mostrarTauler(VALOR[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print("|");
                switch (t[i][j]) {
                    case BUIDA:
                        System.out.print(" ");
                        break;
                    case CREU:
                        System.out.print("X");
                        break;
                    case CERCLE:
                        System.out.print("O");
                        break;
                }
            }
            System.out.println("|");
        }
    }


    public static boolean partidaAcabada() {

        return resultat != RESULTAT.ENJOC;
    }

    public static void ferTirada(Scanner input, TORN t, VALOR[][] tauler) {// t: tauler   tauler: si ja hi ha valor
        int fila, col;

        do {
            System.out.print("FILA:");
            fila = input.nextInt();

            System.out.print("COLUMNA:");
            col = input.nextInt();
        } while (!tiradaValida(fila, col, tauler));

        tauler[fila][col] = (t == TORN.JUGADOR_A) ? VALOR.CREU : VALOR.CERCLE;

        numTirades++;
    }

    public static boolean tiradaValida(int f, int c, VALOR[][] t) {
        return (f >= 0 && f <= 2 && c >= 0 && c <= 2 && t[f][c] == VALOR.BUIDA);
    }


    public static TORN canviarTorn(TORN t) {
        if (t == TORN.JUGADOR_A) {
            return TORN.JUGADOR_B;
        } else {
            return TORN.JUGADOR_A;
        }
    }

    public static RESULTAT comprovaResultat(VALOR[][] t) { //es igual si es t o tauler perque el valor canvia: romeo i julieta exemple

        for (int f=0; f<=2; f++) {
            if(t[f][0]==t[f][1] && t[f][1] == t[f][2] && t[f][0] !=VALOR.BUIDA);
        }
        return RESULTAT.ENJOC;

    }

    public static void mostrarResultat(RESULTAT r) {
        if (r == RESULTAT.EMPAT) {
            System.out.println("Partida acabada en empat");
        } else if (r == RESULTAT.GUANYADOR_A) {
            System.out.println("Enhorabaona Jugador/a A");
        } else if (r == RESULTAT.GUANYADOR_B) {
            System.out.println("Enhorabaona Jugador/a B");
        } else {
            System.out.println("La partina no ha acabat");
        }

    }
}
