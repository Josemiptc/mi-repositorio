package Ampliación;

import java.util.Scanner;

public class Radarestramo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia_metros;
        double velocidad_maxima_hectomectros;
        double tiempo_segundos;

        System.out.println("Escribe la distancia en metros: ");
        distancia_metros = sc.nextDouble();
        System.out.println("Escribe la velocidad en hm/h: ");
        velocidad_maxima_hectomectros = sc.nextDouble();
        System.out.println("Escribe el tiempo en segundos: ");
        tiempo_segundos = sc.nextDouble();

        double velocidadmetrosporsegundo = velocidad_maxima_hectomectros*100/3600;
        double vmedia = distancia_metros/tiempo_segundos;

        if (vmedia < velocidadmetrosporsegundo) {
            System.out.println("No ha superado la velocidad máxima.");
        }else System.out.println("Ha superado la velocidad máxima.");
    }
}
