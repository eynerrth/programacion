
import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        System.out.println("----Ej06: Conversion de Fahrenheit a Celsius----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos la temperatura en Fahrenheit
        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Mostramos la informacion que usaremos para calcular
        System.out.println("------ DATOS DE LA TEMPERATURA ------");
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

        // Formula para convertir Fahrenheit a Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Mostramos el resultado
        System.out.println("------ RESULTADO DE LA CONVERSION ------");
        System.out.println("La temperatura en grados Celsius es: " + celsius + " °C");

        sc.close();
    }
}

