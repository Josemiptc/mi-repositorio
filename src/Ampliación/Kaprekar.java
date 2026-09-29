package Ampliación;

import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero_str;
        System.out.println("Escribe un numero de 4 cifras con al menos 2 diferentes: ");
        numero_str = sc.next();
        char[] arraydenumeros = numero_str.toCharArray();

        for (int i = 0 ; i < arraydenumeros.length ; i++){
            for (int j = i + 1 ; j < arraydenumeros.length; j++){
                if (arraydenumeros[i] == arraydenumeros[j]){
                    System.out.println("Numero no valido");
                    System.exit(0);
                }else break;
            }


            // Aqui ordena
        }
        char[] arrayMayorMenor = arraydenumeros.clone();
        for (int i = 0; i < arrayMayorMenor.length; i++){
            for (int j = i + 1; j < arrayMayorMenor.length; j++){
                if (arrayMayorMenor[i] < arrayMayorMenor[j]){
                    char aux = arrayMayorMenor[i];
                    arrayMayorMenor[i] = arrayMayorMenor[j];
                    arrayMayorMenor[j] = aux;
                }
            }
        }
        char[] arrayMenorMayor = new char[arrayMayorMenor.length];
        for (int i = 0; i < arrayMayorMenor.length; i++){
            arrayMenorMayor[i] = arrayMayorMenor[arrayMayorMenor.length - 1 - i];
        }
    }
}
