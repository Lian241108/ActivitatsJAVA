package ArraysBI;

public class ArraBi1 {
    public static void main(String[] args) {
        char[][] meuArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        // Recorregut per files
        for (int f = 0; f < meuArray.length; f++) {  //numero de files
            for (int c = 0; c < meuArray[f].length; c++) {  //numero de columnes (f)
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        // Recorregut per files
        for (int c = 0; c < meuArray.length; c++) {
            for (int f = 0; f < meuArray[c].length; f++) {
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }


        System.out.printf("\n");
        // Recorregut diagonal 1
        for (int c = 0; c < meuArray.length; c++) {
            for (int f = 0; f < meuArray[c].length; f++) {
                if (f == c) {
                    System.out.printf("%c\t", meuArray[f][c]);
                }
            }
        }
        // Recorregut diagonal 1
        System.out.printf("Recorregut Diagonal: \n");
            for (int f = 0; f < meuArray.length; f++) {
                System.out.printf("%c\t", meuArray[f][f]);
            }



            System.out.printf("\n");
            // Recorregut diagonal  ascendent 2
        System.out.printf("Recorregut Diagonal: \n");
        for (int f = 2, c=0; f>=0 &&  c< meuArray.length; f--, c++) {
            System.out.printf("%c\t", meuArray[f][c]);
        }
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