package ACTBÀSIQUES;

public class ACTBinari {
    public static void main(String[] args) {

        int nb=1010001;
        int  pos = 0;
        int nd = 0;
        int pot = 0;

        while(nb>0){
            int d = nb%10;
            int p = (int) Math.pow(2, pos);
            nb = nb/10;
            nd = nd + d*p;
            pos=pos+1;
            pot = pot + 1;
        }
        System.out.println("Num decimal:" +nd);
    }
}
