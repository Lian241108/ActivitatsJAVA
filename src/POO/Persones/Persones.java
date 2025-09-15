package POO.Persones;

public class Persones {
    enum SEXE{HOME,DONA,ALTRE};

    String nom;
    int edat;
    SEXE sexe;

    public Persones(String nom, int edat, SEXE sexe) {
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
    }

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public int getEdat() {return edat;}

    public void setEdat(int edat) {this.edat = edat;}

    public SEXE getSexe() {return sexe;}

    public void setSexe(SEXE sexe) {this.sexe = sexe;}

    public void print(){
        System.out.printf("%s te %d anys i és de sexe: %s.\n", nom, edat, sexe);
    }

}

