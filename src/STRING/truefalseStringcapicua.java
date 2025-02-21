package STRING;

public class truefalseStringcapicua {
    public static void main(String[] args) {
        String a = "radar"; // Texto base
        System.out.printf("%s és capicua: %b.", a, eltextesCapicua(a));
    }
    public static boolean eltextesCapicua(String a){
        boolean capicua=  true ;
        int i = 0, j = a.length()-1;
        while (i > j && capicua){
            if(a.charAt(i) != a.charAt(j)){
                capicua = false;
            }
        }
        return capicua;
    }
}
