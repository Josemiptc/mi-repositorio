package Ampliación;

import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero_str;
        int contador = 0;
        int iteraciones = 0;
        System.out.println("Escribe un numero de 4 cifras con al menos 2 diferentes: ");
        numero_str = sc.next();
        String numero_inicial = numero_str;
       while (contador < 7) {
           char[] arraydenumeros = numero_str.toCharArray();
           if (arraydenumeros[0] == arraydenumeros[1] && arraydenumeros[1] == arraydenumeros[2] && arraydenumeros[2] == arraydenumeros[3]) {
               System.out.println("Numero no valido");
               System.exit(0);
           }

               // Aqui ordena
           char[] arrayMayorMenor = arraydenumeros.clone();
           for (int i = 0; i < arrayMayorMenor.length; i++) {
               for (int j = i + 1; j < arrayMayorMenor.length; j++) {
                   if (arrayMayorMenor[i] < arrayMayorMenor[j]) {
                       char aux = arrayMayorMenor[i];
                       arrayMayorMenor[i] = arrayMayorMenor[j];
                       arrayMayorMenor[j] = aux;
                   }
               }
           }
           char[] arrayMenorMayor = new char[arrayMayorMenor.length];
           for (int i = 0; i < arrayMayorMenor.length; i++) {
               arrayMenorMayor[i] = arrayMayorMenor[arrayMayorMenor.length - 1 - i];
           }
           int numeroMayor = Integer.parseInt(new String(arrayMayorMenor));
           int numeroMenor = Integer.parseInt(new String(arrayMenorMayor));
           int resultado = numeroMayor - numeroMenor;
           numero_str = String.format("%04d", resultado);
           contador = contador + 1;
           if (resultado == 6174){
               iteraciones = contador;
               break;
           }
       }
        System.out.println("El numero " + numero_inicial + " necesita " + iteraciones + " iteraciones");
    }
}
