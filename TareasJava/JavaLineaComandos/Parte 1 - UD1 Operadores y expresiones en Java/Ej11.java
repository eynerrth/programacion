
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        System.out.println("----Ej11: Ecuacion de segundo grado----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos los valores de a, b y c
        System.out.println("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        double b = sc.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        double c = sc.nextDouble();

        // Mostramos los datos de la ecuacion
        System.out.println("------ DATOS DE LA ECUACION ------");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);

        // Comprobamos que sea una ecuacion de segundo grado
        if (a == 0) {
            System.out.println("El valor de a no puede ser 0.");
        } else {
            // Formula para calcular el discriminante
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            System.out.println("Discriminante: " + discriminante);

            // Comprobamos si existen soluciones reales
            if (discriminante < 0) {
                System.out.println("No hay soluciones reales");
            } else if (discriminante == 0) {
                // Formula para una unica solucion
                double x = -b / (2 * a);

                System.out.println("------ RESULTADO ------");
                System.out.println("La unica solucion es: " + x);
            } else {
                // Formulas para calcular las dos soluciones
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                // Mostramos los resultados
                System.out.println("------ RESULTADOS ------");
                System.out.println("La primera solucion es: " + x1);
                System.out.println("La segunda solucion es: " + x2);
            }
        }

        sc.close();
    }
}

