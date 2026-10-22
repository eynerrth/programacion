
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        System.out.println("----Ej08: Precio final con descuento----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos el precio del producto
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        // Pedimos el porcentaje de descuento
        System.out.println("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = sc.nextDouble();

        // Mostramos los datos del producto
        System.out.println("------ DATOS DEL PRODUCTO ------");
        System.out.println("Precio original: " + precioProducto + " euros");
        System.out.println("Porcentaje de descuento: " + porcentajeDescuento + "%");

        // Formulas para calcular el descuento y el precio final
        double cantidadDescontada = precioProducto * porcentajeDescuento / 100;
        double precioFinal = precioProducto - cantidadDescontada;

        // Mostramos los resultados
        System.out.println("------ RESUMEN DEL PRECIO ------");
        System.out.println("Cantidad descontada: " + cantidadDescontada + " euros");
        System.out.println("El precio final es: " + precioFinal + " euros");

        sc.close();
    }
}
