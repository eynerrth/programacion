import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        System.out.println("----Ej03: Calculo de circunferencia de un circulo----");

        
        // Creamos el scanner
        Scanner sc = new Scanner(System.in);


        // Definimos la constante
        final double PI = 3.1416;


        // Pedimos el radio
        System.out.println("Ingrece el radio del circulo para calcular la circunferencia: ");
        double radio = sc.nextDouble();
        System.out.println("El radio ingresado es: ");


        // Calcular
        double longitudCircunferencia = 2 * radio * PI;


        //Mostramos el resultado
        System.out.println("La circunferencia del circulo con radio de " + radio + " es:" + longitudCircunferencia);


        // Cerramos el scanner
        sc.close();
    }
}
