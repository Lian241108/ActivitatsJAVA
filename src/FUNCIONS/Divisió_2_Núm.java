package FUNCIONS;

public class Divisió_2_Núm {

        public static void main(String[] args) {
            dividir(4, 3);  // Llamada al método con los números a dividir
        }

        public static void dividir(double dividendo, double divisor) {
            if (divisor != 0) {
                double resultado = dividendo / divisor;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        }
    }
