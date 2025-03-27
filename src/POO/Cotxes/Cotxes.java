package POO.Cotxes;

public class Cotxes {

    //Atributs o propietats
    String marca;
    int matricula;
    float velocitat;
    int numPortes;

    // Metodes   //acceleració es una funcio (void accelerar(float q) velocitat +=q)

    //Constructor(s)

    Cotxes(String n, int m, float v, int p){
        marca =n;
        matricula =m;
        velocitat =v;
        numPortes =p;
    }
    Cotxes (String n){
        marca = n;
        matricula = 6879;
        velocitat =0;
        numPortes =4;
    }
    //Setters (mutadores)
    void setMarca(String n){marca = n;}
    void setMatricula(int m){matricula = m;}
    void setVelocitat(float v){velocitat = v;}
    void setNumPortes(int p){numPortes = p;}


    //Getters (Accesores)
    String getMarca(){return marca;}
    int getMatricula(){return matricula;}
    float getVelocitat(){return velocitat;}
    int getNumPortes(){return numPortes;}

    //ALTRES
    void print(){
        System.out.printf("%s, %d, %f, %d.\n", marca, matricula, velocitat, numPortes);
    }

    void accelerar(float q){velocitat +=q; }
}
