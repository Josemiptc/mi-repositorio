import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double precioreal;
        System.out.println("Introduce el precio real del producto: ");
        precioreal  = sc1.nextDouble();

        System.out.println("Introduce el precio rebajado del producto: ");
        double preciorebajado;
        preciorebajado = sc1.nextDouble();
        double descuento;
        descuento = (precioreal - preciorebajado)/precioreal*100;
        System.out.println("El descuento es: " + descuento + "%");
    }
}
