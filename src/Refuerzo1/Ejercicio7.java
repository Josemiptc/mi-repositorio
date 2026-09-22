package Refuerzo1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Escribe un numero entero: ");
        a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println("El numero " + a + " es multipo de 2.");
        }else   System.out.println("El numero " + a + " no es multipo de 2.");
        if (a % 3 == 0){
            System.out.println("El numero " + a + " es multipo de 3.");
        }else   System.out.println("El numero " + a + " no es multipo de 3.");
    }
}
