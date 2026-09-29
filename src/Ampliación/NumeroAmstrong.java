package Ampliación;
import java.util.Scanner;
public class NumeroAmstrong {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int suma = 0;
                int numero_entero = 0;

                System.out.print("Introduce un número entero: ");
                String numero_str = sc.nextLine();

                // Convierto el numero a array
                char[] arraynumeros = numero_str.toCharArray();


                for (int i = 0; i < arraynumeros.length; i++) {
                    // Convierto a numero entero
                    numero_entero = Character.getNumericValue(arraynumeros[i]);
                    // Sumo cada numero elevandolo a la cantidad de cifas
                    suma =suma + (int) Math.pow(numero_entero, 3);
                }
                // Integer.parseInt para pasar una str a int
                if (suma == (numero_entero = Integer.parseInt(numero_str))){
                    System.out.println("Es un número Amstrong");
                }else System.out.println("No es un número Amstrong");

    }
}
