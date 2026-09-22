import java.util.Scanner;

public class TarifaElectricaPorTramos {
    public static void main(String[] args) {
        double consumo;
        double total;
        double diferencia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el consumo electrico mensual en kWh: ");
        consumo = sc.nextDouble();

        if (consumo <= 100){
            total = consumo * 0.1;
            System.out.println("El total a pagar asciende a: " + total);
        } else if (consumo <= 300) {
            diferencia = consumo - 100;
            double preciovalle = 100 * 0.1;
            double precio = diferencia * 0.15;
            total = precio + preciovalle;
            System.out.println("El total a pagar asciende a: " + total);
        } else if (consumo > 300) {
            diferencia = consumo - 100;
            double preciovalle = 100 * 0.1;
            if (diferencia <= 300){
                double precio = diferencia * 0.15;
                total = precio + preciovalle;
                System.out.println("El total a pagar asciende a: " + total);
            }
            if (diferencia > 300){
                double diferencia2 = diferencia - 300;
            }
        }
    }
}
