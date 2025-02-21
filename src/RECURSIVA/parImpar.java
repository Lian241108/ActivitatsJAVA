package RECURSIVA;

public class parImpar {

    public static void main(String[] args) {
        int b= 23;

        System.out.printf("%d es par? %b.\n", b, espar(b));
        System.out.printf("%d es impar? %b,\n", b, esimpar(b));

    }

    public static boolean espar ( int a) {

        if (a == 0) {
            return true;
        }else{
            return esimpar(a-1);
        }

    }

    public static boolean esimpar ( int a) {

        if (a == 0) {
            return false;
        }else{
            return espar(a-1);
        }

    }
}
