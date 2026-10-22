import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        System.out.println("----Ej04: Convertir kilometros a millas----");


        // Creamos el scanner
        Scanner sc = new Scanner(System.in);


        // Pedimos al usuario que ingrese una cantidad en kilometros para convertirlos a millas
        System.out.println("Ingrese una cantidad en kilometros para convertirlo en millas: ");
        double cifraKilometros = sc.nextDouble();


        // Definimos la constante Millas
        final double millasEquivalente = 1.609;

        
        // Calculamos
        double kilometrosEnMillas = cifraKilometros / millasEquivalente;


        // Mostramos el resultado
        System.out.println(cifraKilometros + " kilometros convertidos a millas equivalen a " + kilometrosEnMillas + " Millas.");


        // Cerramos el scanner
        sc.close();

    }
}
