import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Dime un numero entero: ");
        a = sc.nextInt();
        int b;
        System.out.println("Dime un numero entero: ");
        b = sc.nextInt();
        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("Ambos numeros son pares.");
        } else if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("Hay 1 numero par.");

        }
    }
}
