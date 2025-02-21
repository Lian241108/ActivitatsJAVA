package RECURSIVA;

public class ComptarVocals {

    public static void main(String[] args) {

        String s ="Estefania";
        System.out.printf("%s té %d vocals.", s, numAsR(s));

    }
    //Funció Iterativa
    public static boolean esVocal(char c){
        if (c=='a'|| c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
            return true;
        }
        else{
            return false;
        }

    }

    public static int numVocals(String s){
        int num =0;
        for(int i=0;  i<s.length(); i++){
            char lletra=s.charAt(i);
            if (esVocal(lletra)) {
                num++;
            }

        }
        return num;
    }

    //Funció Recursiva
    public static int numAsR(String s){
        if(s.length()==1 && esVocal(s.charAt(0))){
            return 1;
        }
        else if(s.length()==1 && !esVocal(s.charAt(0))){
            return 0;
        }
        else{
            String tros1= s.substring(0,1);
            String troa2= s.substring(1);
            return numAsR(tros1) + numAsR(troa2);
        }
    }

}
