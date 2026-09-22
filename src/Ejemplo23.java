import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        double numero;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        numero = sc.nextDouble();
        if (numero != 0){
            if (numero > 0){
                cont++;
            }

        }
        while (numero!= 0){
            System.out.println("Introduce otro número");
            numero = sc.nextDouble();
            if (numero > 0){
                cont++;
            }

        }
        System.out.println("Has introducido " + cont + " numero/s postivo/s");
    }
}
