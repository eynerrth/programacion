
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        System.out.println("----Ej10: Calculo del capital final con intereses----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos el capital inicial
        System.out.println("Ingrese el capital inicial en euros: ");
        double capitalInicial = sc.nextDouble();

        // Pedimos el tipo de interes anual
        System.out.println("Ingrese el interes anual en porcentaje: ");
        double interesAnual = sc.nextDouble();

        // Pedimos el numero de años
        System.out.println("Ingrese el numero de años: ");
        int anios = sc.nextInt();

        // Mostramos los datos que usaremos para calcular
        System.out.println("------ DATOS DE LA INVERSION ------");
        System.out.println("Capital inicial: " + capitalInicial + " euros");
        System.out.println("Interes anual: " + interesAnual + "%");
        System.out.println("Numero de años: " + anios);

        // Formula para calcular el capital final
        double capitalFinal = capitalInicial * Math.pow(1 + interesAnual / 100, anios);

        // Calculamos los intereses obtenidos
        double interesesObtenidos = capitalFinal - capitalInicial;

        // Mostramos los resultados
        System.out.println("------ RESUMEN DE LA INVERSION ------");
        System.out.println("Capital inicial: " + capitalInicial + " euros");
        System.out.println("Intereses obtenidos: " + interesesObtenidos + " euros");
        System.out.println("El capital final es: " + capitalFinal + " euros");

        sc.close();
    }
}

