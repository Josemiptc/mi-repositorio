import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo;
        int divisor;
        int resultado;
        int contador = 0;

        System.out.println("Escribe el dividendo: ");
        dividendo = sc.nextInt();
        System.out.println("Escribe el divisor: ");
        divisor = sc.nextInt();
        resultado = dividendo;

        while (resultado >= divisor) {
            resultado = resultado - divisor;
            contador = contador + 1;
        }
        System.out.println("La division da como resultado el numero " + contador + " y el resto es " + resultado);
    }
}
