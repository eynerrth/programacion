
import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        System.out.println("----Ej07: Factura de un restaurante----");

        // Creamos el scanner
        Scanner sc = new Scanner(System.in);

        // Fijamos las constantes de los precios
        final double PRECIO_ADULTO = 12.0;
        final double PRECIO_INFANTIL = 8.0;
        final double PRECIO_BEBIDA = 1.5;

        // Pedimos el numero de menus de adulto
        System.out.println("Ingrese el numero de menus de adulto: ");
        int menusAdulto = sc.nextInt();

        // Pedimos el numero de menus infantiles
        System.out.println("Ingrese el numero de menus infantiles: ");
        int menusInfantiles = sc.nextInt();

        // Pedimos el numero de bebidas
        System.out.println("Ingrese el numero de bebidas: ");
        int bebidas = sc.nextInt();

        // Mostramos los datos de la factura
        System.out.println("------ DETALLES DE LA FACTURA ------");
        System.out.println("Menus de adulto: " + menusAdulto);
        System.out.println("Menus infantiles: " + menusInfantiles);
        System.out.println("Bebidas: " + bebidas);
        System.out.println("Precio menu adulto: " + PRECIO_ADULTO + " euros");
        System.out.println("Precio menu infantil: " + PRECIO_INFANTIL + " euros");
        System.out.println("Precio bebida: " + PRECIO_BEBIDA + " euros");

        // Formulas para calcular el importe total
        double totalAdultos = menusAdulto * PRECIO_ADULTO;
        double totalInfantiles = menusInfantiles * PRECIO_INFANTIL;
        double totalBebidas = bebidas * PRECIO_BEBIDA;
        double totalPagar = totalAdultos + totalInfantiles + totalBebidas;

        // Mostramos el importe total
        System.out.println("------ RESUMEN TOTAL A PAGAR ------");
        System.out.println("Total menus de adulto: " + totalAdultos + " euros");
        System.out.println("Total menus infantiles: " + totalInfantiles + " euros");
        System.out.println("Total bebidas: " + totalBebidas + " euros");
        System.out.println("El importe total es: " + totalPagar + " euros");

        // Pedimos la cantidad abonada por el cliente
        System.out.println("Ingrese la cantidad abonada por el cliente: ");
        double cantidadAbonada = sc.nextDouble();

        // Calculamos el cambio
        double cambio = cantidadAbonada - totalPagar;

        // Mostramos el cambio a devolver
        System.out.println("------ RESUMEN DEL PAGO ------");
        System.out.println("Cantidad abonada: " + cantidadAbonada + " euros");
        System.out.println("Cambio a devolver: " + cambio + " euros");

        sc.close();
    }
}
