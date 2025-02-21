package ArraysBI;

public class DauCares {
    public static void main(String[] args) {

        int[] tirades = {100, 1000, 1000000};

        float[][] probabilitats = new float[3][6];


        for (int i = 0; i < tirades.length; i++) {
            int[] comptador = new int[6];

            for (int j = 0; j < tirades[i]; j++) {

                int caraAleatoria = 1 + (int) (Math.random() * 6);
                // Incrementem el comptador per la cara corresponent
                comptador[caraAleatoria - 1]++;

            }

            for (int k = 0; k < 6; k++) {
                probabilitats[i][k] = (float) comptador[k] / tirades[i];
            }
        }

        for (int i = 0; i < probabilitats.length; i++) {
            System.out.printf("\nExperiment amb %d tirades:\n", tirades[i]);
            for (int j = 0; j < 6; j++) {
                System.out.printf("Cara %d: %.6f \n", j + 1, probabilitats[i][j]);
            }
        }
    }
}
