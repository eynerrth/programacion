
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        System.out.println("----Ej13: Conversion de segundos a horas, minutos y segundos----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos la cantidad total de segundos
        System.out.println("Indique el numero total de segundos: ");
        int totalSegundos = sc.nextInt();

        // Mostramos el dato introducido
        System.out.println("------ DATOS INTRODUCIDOS ------");
        System.out.println("Total de segundos: " + totalSegundos);

        // Formulas para convertir los segundos
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        // Mostramos los resultados
        System.out.println("------ RESULTADO DE LA CONVERSION ------");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        System.out.println("El resultado es: " + horas + " horas, "
                + minutos + " minutos y " + segundos + " segundos.");

        sc.close();
    }
}
