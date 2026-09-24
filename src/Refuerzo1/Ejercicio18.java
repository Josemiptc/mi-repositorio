package Refuerzo1;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escribe un número entero: ");
        num = sc.nextInt();
        int cont = num;
        if (num % 2 == 0){
            for (int i = 1 ; i <=5 ; i++){
                System.out.println(cont +2 );
                cont = cont +2;
            }
        }else {
            System.out.println(cont +1);
            cont = cont + 1;
            for (int i = 1 ; i<=4 ; i++){
                System.out.println(cont +2 );
                cont = cont +2;
            }
        }
    }
}
