package Refuerzo1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero entero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("El numero es par.");
        }else System.out.println("El numero no es par.");
    }
}
