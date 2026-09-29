package Ampliación;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        int dia;
        int año;

        System.out.println("Introduce tu día de nacimiento: ");
        dia = sc.nextInt();
        System.out.println("Introduce el número de tu mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.println("Introduce tu año de nacimiento: ");
        año = sc.nextInt();

        int suma = 0;
        int numero = dia;
        while (numero > 0) {
            suma = suma + numero % 10;
            numero = numero / 10;
        }

        numero = mes;
        while (numero > 0) {
            suma = suma + numero % 10;
            numero = numero / 10;
        }

        numero = año;
        while (numero > 0) {
            suma = suma +numero % 10;
            numero = numero / 10;
        }

        while (suma >= 10) {
            int sumaaux = 0;
            numero = suma;
            while (numero > 0) {
                sumaaux = sumaaux + numero % 10;
                numero = numero / 10;
            }
            suma = sumaaux;
        }

        System.out.println("Tu numero de la suerte es el: " + suma);
    }
}
