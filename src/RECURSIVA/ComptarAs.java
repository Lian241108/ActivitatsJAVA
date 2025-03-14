package RECURSIVA;

public class ComptarAs {

    public static void main(String[] args) {

        String s ="amargada";
        System.out.printf("%s té %d As.", s, numAsR(s));
    }
    //Funció Iterativa
    public static boolean esA(char c){
        if (c=='a'){
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
            if (esA(lletra)) {
                num++;
            }
        }
        return num;
    }
    //Funció Recursiva
    public static int numAsR(String s){
        if(s.length()==1 && esA(s.charAt(0))){
            return 1;
        }
        else if(s.length()==1 && !esA(s.charAt(0))){
            return 0;
        }
        else{
            String tros1= s.substring(0,1);
            String troa2= s.substring(1);
            return numAsR(tros1) + numAsR(troa2);
        }
    }
}
