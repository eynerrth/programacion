import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        System.out.println("----Ej01: Calculos numeros enteros y decimales----");
        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);


        // Pedir un numero entero
        System.out.println("----Ingrese un número entero para ver el doble de este.----");
        int numeroEntero = sc.nextInt();


        // Calculamos el doble
        int doble = numeroEntero*2;
        

        // Mostramos el doble
        System.out.println("El doble de " + numeroEntero + " es: " + doble + ".");


        // Pedir un numero decimal
        System.out.println("----Ingrese un número decimal para ver el resultado de dividirlo entre 10.----");
        double numeroDecimal = sc.nextDouble();


        // Calcular la division.
        double division = numeroDecimal/10;


        // Mostrar la solucion
        System.out.println("El resultado de divir " + numeroDecimal + " entre 10 es: " + division + ".");

        
        // Cerramos el scanner
        sc.close();
    }
}
