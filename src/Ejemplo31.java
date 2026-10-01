import java.util.Scanner;

public class Ejemplo31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entero;
        System.out.println("Escribe un numero entero: ");
        entero = sc.nextInt();

        for (int i = 1; i<= entero ; i++){
            if (entero % i == 0){
                System.out.println("El numero " + i + " es divisor de " + entero);
            }
        }
    }
}
