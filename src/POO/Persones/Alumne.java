package POO.Persones;

public class Alumne extends Persones{
    int curs;
    char grup;
    Alumne(String n, int e, SEXE s, int c, char g){
        super(n,e,s);
        this.curs = c;
        this.grup= g;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public char getGrup() {
        return grup;
    }

    public void setGrup(char grup) {
        this.grup = grup;
    }
    public void print(){
        System.out.printf("%s te %d anys , és de sexe: %s, %d i grup %c.\n", nom, edat, sexe, curs, grup);

    }
}
