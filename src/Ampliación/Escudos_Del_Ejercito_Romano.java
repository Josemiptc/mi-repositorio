package Ampliación;

import java.util.Scanner;

public class Escudos_Del_Ejercito_Romano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soldados;
        int cuadrado = 0;
        int cuadradofinal = 0;
        System.out.println("Escribe el numero de soldados disponibles; ");
        soldados = sc.nextInt();
        for (int i = 1 ; i <= soldados ; i++){
            cuadrado = i*i;
            if (cuadrado <=soldados){
                cuadradofinal=cuadrado;
            }
        }
        System.out.println(cuadradofinal);
    }
}
