import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        System.out.println("----Ej05: Factura mano de obra y total a pagar----");


        // Creamos el scanner
        Scanner sc = new Scanner(System.in);
        
        // Pedimos el precio por horas trabajadas
        System.out.println("Ingrece el precio por hora de trabajo: ");
        double precioHoraTrabajadas = sc.nextDouble();
        

        //Pedimos las horas que se trabajo
        System.out.println("Ingrese el total de horas empleadas en la reparación: ");
        double horasTrabajadas = sc.nextDouble();


        //Fijamos la constante del 21% de IVA
        final double IVA = 0.21;

        // Mostramos la información que usaremos para calcular
        System.out.println("------ DETALLES DEL SERVICIO ------");
        System.out.println("Tarifa por Hora: " + precioHoraTrabajadas);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("El porcentaje de IVA correspondiente: " + IVA);

        // Formulas
        double subtotalManoObra = precioHoraTrabajadas * horasTrabajadas;
        double ivaCorrespondiente = subtotalManoObra * IVA;
        Double totalPagar = subtotalManoObra + ivaCorrespondiente;

        // Mostramos los resultados de la factura

        System.out.println("------ RESUMEN TOTAL A PAGAR ------");
        System.out.println("El Subtotal de mano de obra es: " + subtotalManoObra);
        System.out.println("El IVA correspondiente es: " + ivaCorrespondiente);
        System.out.println("El Total a pagar es : " + totalPagar);

        // Cerramos el scanner
        sc.close();
        


    }
    
}
