import java.util.Scanner;

public class SistemaDescuentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe;
        String socio;
        double precio_final;
        System.out.println("Introduce el importe de la compra: ");
        importe = sc.nextDouble();
        System.out.println("¿Eres socio?: ");
        socio = sc.next();

        if (socio.equals("si")){
            if (importe > 50 && importe <= 100) {
                precio_final = importe - (importe * 0.1);
                System.out.println("El precio final es: " + precio_final);
            } else if (importe > 100) {
                precio_final = importe - (importe * 0.15);
                System.out.println("El precio final es: " + precio_final);
            }else {
                precio_final = importe;
                System.out.println("El precio final es: " + precio_final);
            }
        }else {
            if (importe > 50){
                precio_final = importe - (importe * 0.05);
                System.out.println("El precio final es: " + precio_final);
            }else {
                precio_final = importe;
                System.out.println("El precio final es: " + precio_final);
            }
        }
    }
}
