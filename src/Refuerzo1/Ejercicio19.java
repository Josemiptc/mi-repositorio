package Refuerzo1;
import java.util.Scanner;
public class Ejercicio19 {
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

        if (vmedia < velocidadmetrosporsegundo){
            System.out.println("OK");
        }else if (vmedia < velocidadmetrosporsegundo+ velocidadmetrosporsegundo*0.2){
            System.out.println("MULTA");
        }else System.out.println("PUNTOS");
    }
}