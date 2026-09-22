package Refuerzo1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero entero: ");
        numero = sc.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        System.out.println("El doble de " + numero + " es " + doble + " y el triple es " + triple);
    }
}
