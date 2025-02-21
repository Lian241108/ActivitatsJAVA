package ARRAYS;

public class PracticaArrays {


    public static void main(String[] args) {
        // Recorregut Ascendent
        String[] noms = {"Paco","Pep", "Bel", "Jaume"};

        for (int i=0; i<noms.length; i++){
            System.out.printf("%s.\n" , noms[i]);
        }
        // Recorregut Descendent
        for (int i=noms.length-1; i>=0; i--){
            System.out.printf("%s.\n" , noms[i]);
        }
    }
}
