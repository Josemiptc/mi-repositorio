package Ampliación;

import java.util.Scanner;

public class Codigos_de_Barras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero_str;
        String invertido;
        System.out.println("Escribe un numero de un código de barras: ");
        numero_str = sc.next();
        invertido = new StringBuilder(numero_str).reverse().toString();
        char[] array_numero = invertido.toCharArray();

        int suma_pares = 0;
        int suma_impares = 0;
        int suma_total = 0;
        String suma_str;
        if (numero_str.length() == 8 || numero_str.length() == 13){
            for (int i = 1 ; i < numero_str.length() ; i++){
                if (i % 2 == 1){
                    suma_impares = suma_impares + (Character.getNumericValue(array_numero[i]) * 3);
                }else {
                    suma_pares = suma_pares + Character.getNumericValue(array_numero[i]);
                }
            }
            suma_total = suma_impares + suma_pares;
            int numerocontrol = (10 - suma_total % 10) % 10;
            if (numerocontrol == Character.getNumericValue(array_numero[0])){
                System.out.println("Codigo valido.");
            }else{
                System.out.println("Codigo no valido");
            }
        }else {
            System.out.println("Número no válido.");
        }

    }
}