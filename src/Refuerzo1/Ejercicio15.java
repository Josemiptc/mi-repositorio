package Refuerzo1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = 0;
        int minutos = 0;
        int t;
        System.out.println("Escribe un tiempo en segundos: ");
        t = sc.nextInt();
        while (t >=60) {
            if (t >= 60) {
                minutos = minutos + 1;
                t = t - 60;
                if (minutos >= 60) {
                    horas = horas + 1;
                    minutos = minutos - 60;
                }
            }
        }
        System.out.println("Tenemos: " + horas +" hora/s " + minutos + " minuto/s " + t + " segundo/s.");
    }
}
