package Refuerzo1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Escribe un numero entero: ");
        a = sc.nextInt();
        System.out.println("Escribe otro numero entero: ");
        b = sc.nextInt();
        if (a % b == 0){
            System.out.println("El numero " + a + " es multipo de " + b);
        }else   System.out.println("El numero " + a + " no es multipo de " + b);
    }
}
