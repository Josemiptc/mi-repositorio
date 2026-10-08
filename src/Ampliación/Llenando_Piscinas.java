package Ampliación;

import java.util.Scanner;

public class Llenando_Piscinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double micapacidad;
        double mislitrosporviaje;
        double miperdidaporviaje;
        double sucapacidad;
        double sulitrosporviaje;
        double superdidaporviaje;
        double miganancia;
        double suganancia;
        double litros_que_tengo = 0;
        double litros_que_tiene = 0;
        int mis_viajes = 0;
        int sus_viajes = 0;

        System.out.println("Escribe la capacidad de tu piscina: ");
        micapacidad = sc.nextDouble();
        System.out.println("Escribe cuantos litros traes por viaje: ");
        mislitrosporviaje = sc.nextDouble();
        System.out.println("Escrine cuantos litros pierdes por viaje: ");
        miperdidaporviaje = sc.nextDouble();
        System.out.println("Escribe la capacidad de su piscina: ");
        sucapacidad = sc.nextDouble();
        System.out.println("Escribe cuantos litros trae por viaje: ");
        sulitrosporviaje = sc.nextDouble();
        System.out.println("Escrine cuantos litros pierde por viaje: ");
        superdidaporviaje = sc.nextDouble();

        miganancia = mislitrosporviaje - miperdidaporviaje;
        suganancia = sulitrosporviaje - superdidaporviaje;

        do {
            if (miganancia <=0){
                break;
            }
            litros_que_tengo = litros_que_tengo + miganancia;
            mis_viajes = mis_viajes + 1;
        }while(litros_que_tengo < micapacidad);
        do {
            if (suganancia <= 0){
                break;
            }
            litros_que_tiene = litros_que_tiene + suganancia;
            sus_viajes = sus_viajes + 1;
        }while(litros_que_tiene < sucapacidad);
        if (mis_viajes > sus_viajes){
            System.out.println("-1");
        } else if (mis_viajes < sus_viajes) {
            System.out.println("1");
        }else System.out.println("0");
    }
}
