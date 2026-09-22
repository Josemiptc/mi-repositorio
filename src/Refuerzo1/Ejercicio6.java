package Refuerzo1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Escribe un numero: ");
        a = sc.nextInt();
        System.out.println("Escribe otro numero: ");
        b = sc.nextInt();
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
        }else{
                double resultado = a / b;
                System.out.println("El resultado de " + a + " / " + b + " es: " + resultado);
        }
    }
}