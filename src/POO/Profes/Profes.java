package POO.Profes;

public class Profes {

    enum DEPARTAMENT {FISICA,MATES,CATALA,ANGLES};
    //Atributs o propietats
    String nom;
    int anys;
    DEPARTAMENT departament;

   // Metodes

    //Constructor(s)

    Profes (String n, int a, DEPARTAMENT d){
    nom =n;
    anys =a;
    departament =d;
    }
    Profes (String n, DEPARTAMENT d){
        nom =n;
        anys =0;
        departament =d;
    }
    //Setters (mutadores)
    void setNom(String n){nom = n;}
    void setAnys(int a){anys = a;}
    void setDepartament(DEPARTAMENT d){departament =d;}

    //Getters (Accesores)
    String getNom(){return nom;}
    int getAnys(){return anys;}
    DEPARTAMENT getDepartament(){return departament;}

    //ALTRES
    void print(){
        System.out.printf("%s, %s (%d).\n", nom, departament, anys);
    }

}
