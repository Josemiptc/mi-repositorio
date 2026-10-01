import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int suma = 0;
        System.out.println("Escibe el 1r numero: ");
        num1 = sc.nextInt();
        System.out.println("Escribe el 2do numero: ");
        num2 = sc.nextInt();
        for (int i = 1 ; i <= num2 ; i++){
            suma = suma + num1;
        }
        System.out.println("El resultado de la multiplicación es: " + suma);
    }
}
