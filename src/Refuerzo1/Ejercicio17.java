package Refuerzo1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Escribe un número entero; ");
        a = sc.nextInt();
        System.out.println("Escribe otro número entero: ");
        b = sc.nextInt();

        if (a == b){
            System.out.println("Los números son iguales.");
        } else if (a > b) {
            System.out.println("El " + a + " es el mayor.");
        }else System.out.println("El " + b + " es el mayor.");
    }
}
