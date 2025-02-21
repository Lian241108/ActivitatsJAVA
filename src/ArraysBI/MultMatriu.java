package ArraysBI;

public class MultMatriu {
        public static void main(String[] args) {

            int[][] matriuA = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int[][] mp = producteEscalar(3, matriuA);
            ArraBi1.imprimir (mp);

        }

        public static int[][] producteEscalar(int k, int[][] m) {
            int[][] p = new int[m.length][m[0].length];
            for (int i = 0; i<m.length; i++){
                for (int j = 0; j<m.length; j++){
                    p[i][j] = k * m[i][j];
                }
            }
            return p;
        }
}
