package ArraysBI;

public class CalculMatriu {
    public static void main(String[] args) {

        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] m2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
       int [][] matrium = sumaMatrius(m1, m2);



    }
    public static int[][] sumaMatrius(int[][]m1,int[][ ]m2){
        int[][] m= new int[m1.length][m2[0].length];

        for (int f = 0; f < m1.length; f++) {
            for (int c = 0; c < m1[0].length; c++) {
                m[f][c] = m1[f][c] + m2[f][c];
            }
        }
        return m;
    }
    public static void imprimir(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}


