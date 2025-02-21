package FUNCIONS;

public class númerodelletresAs {
    public static void main(String[] args) {
        String a = "abecedari";
        System.out.printf("%s té %d As.", a, comptadorAs(a));

        int nombreAs = comptadorAs(a);

    }

    public static int comptadorAs(String s){
        int comptador = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){

                comptador= comptador + 1;

            }
        }
        return comptador;
    }
}
