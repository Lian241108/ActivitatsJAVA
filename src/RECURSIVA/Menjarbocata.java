package RECURSIVA;
public class Menjarbocata {
    public static void main(String[] args) {
        String bocata= "Bocatadelmercadondechorizoquesotortillaypanbrioche";
        menjar(bocata);
    }
    public static String mossegar ( String b){
        int mida =1 + (int) (Math.random()*4);
        return b.substring(0,mida);
    }
    public static boolean esTragable(String b){
        return b.length()<=4;
    }
    public static void tragar (String b){
        System.out.print(b);
        System.out.println("Nyammm");
    }
    public static String llevar ( String b, String t){
        return b.replaceFirst (t, "");
    }
    public static void menjar(String b){
        if(esTragable(b)){
            tragar(b);
        } else{
            String boci = mossegar(b);
            String restant = llevar(b, boci);
            menjar(boci);
            menjar(restant);
        }
    }
}