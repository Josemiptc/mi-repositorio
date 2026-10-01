import java.util.Scanner;

public class ConjeturadeCollatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;
        System.out.println("Escribe cualquier numero entero; ");
        numero = sc.nextInt();
        do {
            if (numero % 2 == 0){
                numero = numero / 2;
                contador = contador +1;
            }else {
                numero = numero *3 + 1;
                contador = contador + 1;
            }
        }while (numero != 1);
        System.out.println("Se han necesitado " + contador + " iteraciones.");
    }
}
