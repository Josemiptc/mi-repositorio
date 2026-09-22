package Refuerzo1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Escribe un numero: ");
        a = sc.nextInt();
        if (a == 0){
            System.out.println("El producto de 0 por cualquier numero es 0.");
        }else {
            System.out.println("Escribe otro numero: ");
            b = sc.nextInt();
            int producto = a * b;
            System.out.println("El producto de " + a + " * " + b + " es: " + producto);
        }
    }
}
