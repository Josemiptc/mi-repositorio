import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double descuento;
        double precio_final = 0;

        System.out.println("¿Cual es el precio del producto?: ");
        precio = sc.nextDouble();

        if (precio < 6){
            precio_final = precio;
        }

        if (precio >= 6 && precio < 60){
            descuento = precio * 0.05;
            precio_final = precio - descuento;
        }

        if (precio >= 60){
            descuento = precio * 0.1;
            precio_final = precio - descuento;
            
        }
        System.out.println("El precio final a pagar es: " + precio_final);
    }
}
