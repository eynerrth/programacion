import java.util.Scanner;
public class ejemplo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca edad: ");
        int edad = sc.nextInt();
        int precioEntrada = (edad < 18)?((edad < 7)? 0: 2):25;
        System.out.println("precio de la entrada= " + precioEntrada);

        sc.close();
    }
}
