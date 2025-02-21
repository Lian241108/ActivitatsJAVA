package ArraysBI;

public class MatriuV {
    public static void main(String[] args) {
        int[][] m = { {2,7,12},{1,5,24}};
        imprimirvalorsEntre(m, 0,5);

    }

    public static void imprimirvalorsEntre(int[][] m, int a, int b){
        for (int i = 0; i<m.length; i++){
            for (int j = 0; j<m.length; j++){
                if(m[i][j]>=a && m[i][j]<=b){
                    System.out.printf("%d\t", m[i][j]);
                }
            }
        }
    }
}
