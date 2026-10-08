package Ampliación;

import java.util.Scanner;

public class Escalera_De_Color {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeracarta;
        int segundacarta;
        int terceracarta;
        int cuartacarta;
        int separacion = 0;
        int separacionmax = 0;

        System.out.println("Escribe la 1ra carta: ");
        primeracarta = sc.nextInt();
        System.out.println("Escribe la 2da carta: ");
        segundacarta = sc.nextInt();
        System.out.println("Escribe la 3ra carta: ");
        terceracarta = sc.nextInt();
        System.out.println("Escribe la ultima carta: ");
        cuartacarta = sc.nextInt();
        int[] cartas = {primeracarta, segundacarta, terceracarta, cuartacarta};
        for (int i = 0 ; i < (cartas.length - 1) ; i++){
            for (int j = 1 ; j < cartas.length ; j++){
                separacion = cartas[i] - cartas[j];
                if (separacion > separacionmax){
                    separacionmax = separacion;
                }
            }
        }
        if (separacionmax >= 3){
            System.out.println("No se puede formar escalera.");
            System.exit(0);
        }
    }
}
