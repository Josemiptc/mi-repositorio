package Refuerzo1;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dobleces = 0;
        double grosor;
        double altura;
        double alturamicras;

        System.out.print("Escribe el grosor del papel en micras: ");
        grosor = sc.nextDouble();
        System.out.print("Escribe la altura del edificio en metros: ");
        altura = sc.nextDouble();

        alturamicras = altura * 1000000;
        double grosorcontador = grosor;
        while (grosorcontador <= alturamicras) {
            grosorcontador = grosorcontador * 2;
            dobleces++;
        }
        System.out.println(dobleces);
    }
}

