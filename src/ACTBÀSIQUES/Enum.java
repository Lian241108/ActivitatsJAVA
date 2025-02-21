package ACTBÀSIQUES;

public class Enum {
    static enum Sexe {HOME, DONA};
    static enum EstatCivil{SOLTER, CASAT, DIVORCIAT};
   public static void main (String[]args){

       Sexe a = Sexe.HOME;
      EstatCivil c= EstatCivil.SOLTER;
      
       System.out.println ( a + ","+c);
   }
}
