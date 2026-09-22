package Refuerzo1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Escribe un numero entero: ");
        a = sc.nextInt();
        if (a % 2 == 0 && a % 3 == 0){
            System.out.println("El numero " + a + " es multiplo de 2 y de 3.");
        }else if (a % 2 == 0 && a % 3 != 0){
            System.out.println("El numero " + a + " es multiplo de 2 pero no de 3.");
        }
    }
}
