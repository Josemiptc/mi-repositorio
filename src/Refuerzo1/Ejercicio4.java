package Refuerzo1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
            System.out.println("Escribe un numero entero: ");
            numero = sc.nextInt();
            if (numero % 10 == 0){
                System.out.println("El numero " + numero + " es multiplo de 10.");
                System.out.println("Ahora escribe otro numero: ");
                numero = sc.nextInt();
                if (numero % 10 == 0){
                    System.out.println("El " + numero + " tambien es multiplo de 10");
                }else System.out.println("El " + numero + " no es multiplo de 10.");
            }else System.out.println("El " + numero + " no es multiplo de 10.");
    }
}
