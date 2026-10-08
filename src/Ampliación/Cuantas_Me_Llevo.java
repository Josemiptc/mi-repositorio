package Ampliación;

import java.util.Scanner;

public class Cuantas_Me_Llevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int acarreos = 0;
        System.out.println("Escribe el 1r numero: ");
        numero1 = sc.nextInt();
        System.out.println("Escribe el 2do numero: ");
        numero2 = sc.nextInt();

        String numero1str = String.valueOf(numero1);
        String numero2str = String.valueOf(numero2);
        char[] numero1_array = numero1str.toCharArray();
        char[] numero2_array = numero2str.toCharArray();

        for (int i=0 ; i < numero1_array.length ; i++){
            int numero1bis = Integer.parseInt("" + numero1_array[i]);
            int numero2bis = Integer.parseInt("" + numero2_array[i]);
            if (numero1bis + numero2bis >= 10){
                acarreos = acarreos + 1;
            }
        }
        System.out.println("Se necesitan " + acarreos + " acarreos.");
    }
}
