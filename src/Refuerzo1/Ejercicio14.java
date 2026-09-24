import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Escribe 1 número entero: ");
        a = sc.nextInt();
        System.out.println("Escribe otro número entero: ");
        b = sc.nextInt();
        if (a >= 0 && b >= 0 ){
            System.out.println("Ambos numeros son positivos.");
        } else if (a < 0 && b >= 0 || a >= 0 && b < 0) {
            System.out.println("Uno de los números es positivo.");
        }else System.out.println("Ninguno de los numeros es positivo.");
    }
}
