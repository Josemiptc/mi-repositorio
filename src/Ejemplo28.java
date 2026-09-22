import java.util.Scanner;

public class Ejemplo28 {
    public static void main(String[] args) {
        int numero;
        boolean primo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero n: ");
        numero = sc.nextInt();

        if (numero == 2){
            System.out.println("El 2 es primo.");
        } else if (numero % 2 == 0) {
            System.out.println("El " + numero + " no es primo.");
        } else {
            for ( int i = 3; i <= numero/2 ; i = i +2){
                if (numero % i==0){
                    System.out.println("El " + numero + " no es primo");
                    primo = false;
                    break;
                }else primo = true;
        }
            if (primo == true){
                System.out.println("El " + numero + " es primo.");
            }
        }

    }
}
