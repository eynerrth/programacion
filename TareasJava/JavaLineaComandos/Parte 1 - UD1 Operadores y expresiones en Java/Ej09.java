
import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        System.out.println("----Ej09: Perimetro y area de una circunferencia----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos el radio de la circunferencia
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        // Mostramos los datos que usaremos para calcular
        System.out.println("------ DATOS DE LA CIRCUNFERENCIA ------");
        System.out.println("Radio de la circunferencia: " + radio);
        System.out.println("Valor de PI: " + Math.PI);

        // Formulas para calcular el perimetro y el area
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        // Mostramos los resultados
        System.out.println("------ RESULTADOS ------");
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
        System.out.println("El area del circulo es: " + area);

        sc.close();
    }
}
