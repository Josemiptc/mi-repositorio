package Refuerzo1;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int mayor;
        System.out.println("Escribe un número entero: ");
        a = sc.nextInt();
        mayor = a;
        System.out.println("Escribe otro número entero: ");
        b = sc.nextInt();
        System.out.println("Escribe otro número entero: ");
        c = sc.nextInt();

        if (b > mayor){
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        System.out.println("El número mayor es el " + mayor);
    }
}
