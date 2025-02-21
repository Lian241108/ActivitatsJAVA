package ArraysBI;

public class ArraysBIIguals {

    public static void main(String[] args) {

        int[][] mA = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] mB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        System.out.printf("Són iguals? %b",iguals(mA, mB));

    }
    public static boolean iguals (int[][] m1, int[][] m2){

        for (int i = 0; i<m1.length; i++){
            for (int j = 0; j<m1[0].length; j++){
                if (m1[i][j] != m2[i][j]){
                    return false;
                }
            }
        }
        return true;

    }
}
