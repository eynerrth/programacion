import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        System.out.println("----Ej02: Calculo total de Caja----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);


        // Preguntamos la cantidad de dinero de la caja
        System.out.println("Ingrese la cantidad de dinero de la caja:");
        double dineroCaja = sc.nextDouble();
        System.out.println("Dinero en caja:" + dineroCaja); //Lo mostramos


        // Preguntamos la cantidad de gastos del mes
        System.out.println("Ingrese la cantidad de gastos del mes:");
        double gastosMes = sc.nextDouble();
        System.out.println("Los gastos del mes fueron: " + gastosMes); //Lo mostramos


        // Hacemos el calculo
        double dineroFinal = dineroCaja - gastosMes;


        // Mostramos el total
        System.out.println("El dinero que queda en la caja es: " + dineroFinal);

        
        // Cerramos el scanner
        sc.close();
    }
    
}
