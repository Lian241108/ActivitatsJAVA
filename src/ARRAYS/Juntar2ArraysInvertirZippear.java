package ARRAYS;

public class Juntar2ArraysInvertirZippear {
    public static void main(String[] args) {
        String a = "radar"; // Ejemplo de palabra capicúa

        // Llamamos a la función para verificar si 'a' es capicúa
        if (esCapicua(a)) {
            System.out.println("El texto es capicúa.");
        } else {
            System.out.println("El texto no es capicúa.");
        }
    }

    // Función para verificar si el texto 'a' es capicúa
    public static boolean esCapicua(String a) {
        // Creamos un nuevo string para invertir 'a'
        String invertido = "";

        // Recorremos 'a' de atrás hacia adelante
        for (int i = a.length() - 1; i >= 0; i--) {
            invertido += a.charAt(i); // Concatenamos cada letra al nuevo string invertido
        }

        // Comparamos si 'a' es igual al invertido
        return a.equals(invertido);
    }
}
