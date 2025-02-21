package STRING;

public class Stringparagraf {

    public static void main(String[] args) {

        int numParaules = 0;

        String paragraf = " Hola que tal com va";

        while(paragraf.indexOf(' ')!= -1){
            int posBlank = paragraf.indexOf(' ');
            String paraula = paragraf.substring(0, posBlank);

            paragraf = paragraf.substring( posBlank+1);

            System.out.println(paraula);
            numParaules ++;
        }
        System.out.println(paragraf);
        System.out.println(numParaules);
    }
}
