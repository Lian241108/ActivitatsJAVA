package FUNCIONS;

public class AoNoA {
    public static void main(String[] args) {
        char x= 'z';
        String s= "Aloha";
        System.out.printf("%c és una A? %b\n", x, esUnaA(x));
        System.out.printf("%s té %d As.", s, numAs(s));
    }
    public static boolean esUnaA (char c){
        if (c=='a' || c=='A') {
            return true;
        }else{
            return false;
        }
    }
    //Funció Iterativa

    public static int numAs (String s) {
        int num=0;
        for(int i=0; i<s.length(); i++){

            char lletra = s.charAt(i);
            if(esUnaA(lletra)){
                num++;
            }
        }
        return num;
    }
    //Funció recursiva
    public static int numAsR (String s){
        if(s.length()==0 && esUnaA(s.charAt(0))){
            return 1;
        } else if(s.length()==1 && !esUnaA(s.charAt(0))){
            return 0;
        }
        else{
            String tros1 = s.substring(0,s.length()/2);
            String tros2 = s.substring(s.length()/2);
            return numAsR(tros1)+ numAsR(tros2);
        }
    }
}
