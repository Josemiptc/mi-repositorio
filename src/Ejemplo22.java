import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        double numero;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
             numero = sc.nextDouble();

            if (numero > 0) {
                positivos++;
            }
        }

        System.out.println("Has introducido " + positivos + " número(s) positivo(s).");
    }
}

