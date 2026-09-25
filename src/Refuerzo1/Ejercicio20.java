package Refuerzo1;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo;
        double cambio;
        System.out.println("Dime el saldo inicial de tu cuenta: ");
        saldo = sc.nextDouble();
        System.out.println("Dime el cambio aproximado: ");
        cambio = sc.nextDouble();

        if (saldo + cambio >= 0){
            System.out.println("SÍ");
        }else System.out.println("NO");
    }
}
