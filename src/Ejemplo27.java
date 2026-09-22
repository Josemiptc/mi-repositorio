import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Dime un numero n: ");
        numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Numero no valido, tiene que ser mayor que 0");
        } else {

            for (int i = 1; i <= numero; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
