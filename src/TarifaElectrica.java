import java.util.Scanner;

public class TarifaElectrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo;
        double total;
        System.out.println("¿Cual es el consumo mensual en kWh?: ");
        consumo = sc.nextDouble();
        if (consumo <= 0){
            System.out.println("El consumo tiene que ser positivo.");
        } else if (consumo <= 100) {
            total = consumo * 0.1;
            System.out.println("El total a pagar asciende a " + total + " €");
        } else if (consumo <= 300) {
            double diferencia = consumo - 100;
            total = (100 * 0.1) + (diferencia * 0.15);
            System.out.println("El total a pagar asciende a " + total + " €");
        } else {
            total = (100 * 0.1) + (200 * 0.15) + ((consumo - 300) * 0.2);
            System.out.println("El total a pagar asciende a " + total + " €");
        }
    }
}