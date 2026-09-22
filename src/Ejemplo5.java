
import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int numero1;
        System.out.println("Dime el 1r numero: ");
        numero1 = sc1.nextInt();
        int numero2;
        System.out.println("Dime el 2do numero: ");
        numero2 = sc1.nextInt();
        int sum;
        sum = numero1 + numero2;
        int rest;
        rest = numero1 - numero2;
        int mult;
        mult = numero1 * numero2;
        int div;
        div = numero1 / numero2;


        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + rest);
        System.out.println("La multiplicacion es: " + mult);
        System.out.println("La division es: " + div);
    }
}
