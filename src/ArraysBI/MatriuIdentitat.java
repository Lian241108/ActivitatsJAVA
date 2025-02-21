package ArraysBI;

public class MatriuIdentitat {
    public static void main(String[] args) {
        int n=4;
        ArraBi1.imprimir(matriuIdentitat(n));
    }
    public static int[][] matriuIdentitat(int n){

        int[][] m = new int[n][n];
        for (int i = 0; i<m.length; i++){
        m [i][i]= 1;
    }
    return m;
    }
}
